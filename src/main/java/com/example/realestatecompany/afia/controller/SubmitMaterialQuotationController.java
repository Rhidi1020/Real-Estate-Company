
package com.example.realestatecompany.afia.controller;

import com.example.realestatecompany.AppendableObjectOutputStream;
import com.example.realestatecompany.afia.model.Material;
import com.example.realestatecompany.afia.model.MaterialRequest;
import com.example.realestatecompany.afia.model.Project;
import com.example.realestatecompany.afia.model.Quotation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class SubmitMaterialQuotationController {

    @FXML
    private DatePicker deliveryDatePicker;

    @FXML
    private TextField quotedPriceTextField;

    @FXML
    private ComboBox<String> materialRequestComboBox;

    private ArrayList<MaterialRequest> requestList;
    private ArrayList<Project> projectList;
    private ArrayList<Material> materialList;

    @FXML
    public void initialize() {

        requestList = new ArrayList<MaterialRequest>();
        projectList = new ArrayList<Project>();
        materialList = new ArrayList<Material>();

        // Load Projects
        File f = new File("Project.bin");

        if (f.exists()) {
            try {
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);

                while (true) {
                    Project p = (Project) ois.readObject();
                    projectList.add(p);
                }

            } catch (EOFException e) {

            } catch (IOException | ClassNotFoundException e) {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setContentText("Error loading projects.");
                a.showAndWait();
            }
        }

        // Load Materials
        f = new File("Material.bin");

        if (f.exists()) {
            try {
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);

                while (true) {
                    Material m = (Material) ois.readObject();
                    materialList.add(m);
                }

            } catch (EOFException e) {

            } catch (IOException | ClassNotFoundException e) {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setContentText("Error loading materials.");
                a.showAndWait();
            }
        }

        // Load Material Requests
        f = new File("MaterialRequest.bin");

        if (f.exists()) {
            try {
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);

                while (true) {
                    MaterialRequest mr = (MaterialRequest) ois.readObject();
                    requestList.add(mr);

                    String projectName = mr.getProjectId();
                    String materialName = mr.getMaterialId();

                    for (Project p : projectList) {
                        if (p.getProjectId().equals(mr.getProjectId())) {
                            projectName = p.getName();
                            break;
                        }
                    }

                    for (Material m : materialList) {
                        if (m.getMaterialId().equals(mr.getMaterialId())) {
                            materialName = m.getName();
                            break;
                        }
                    }

                    materialRequestComboBox.getItems().add(
                            mr.getRequestId() + " - " +
                                    projectName + " - " +
                                    materialName + " - Quantity: " +
                                    mr.getQuantity()
                    );
                }

            } catch (EOFException e) {

            } catch (IOException | ClassNotFoundException e) {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setContentText("Error loading material requests.");
                a.showAndWait();
            }
        }
    }

    @FXML
    public void submitQuotationButtonOnAction(ActionEvent actionEvent) {

        // Validate Required Fields
        if (materialRequestComboBox.getValue() == null ||
                quotedPriceTextField.getText().trim().isEmpty() ||
                deliveryDatePicker.getValue() == null) {

            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please fill in all the fields.");
            a.showAndWait();
            return;
        }

        // Validate Quoted Price
        double quotedPrice;

        try {
            quotedPrice = Double.parseDouble(quotedPriceTextField.getText());

            if (quotedPrice <= 0) {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setContentText("Quoted price must be greater than zero.");
                a.showAndWait();
                return;
            }

        } catch (NumberFormatException e) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please enter a valid quoted price.");
            a.showAndWait();
            return;
        }

        // Validate Delivery Date
        LocalDate deliveryDate = deliveryDatePicker.getValue();

        if (deliveryDate.isBefore(LocalDate.now())) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Delivery date cannot be in the past.");
            a.showAndWait();
            return;
        }

        // Find Selected Material Request
        MaterialRequest selectedRequest = null;
        String selectedText = materialRequestComboBox.getValue();

        for (MaterialRequest mr : requestList) {

            String projectName = mr.getProjectId();
            String materialName = mr.getMaterialId();

            for (Project p : projectList) {
                if (p.getProjectId().equals(mr.getProjectId())) {
                    projectName = p.getName();
                    break;
                }
            }

            for (Material m : materialList) {
                if (m.getMaterialId().equals(mr.getMaterialId())) {
                    materialName = m.getName();
                    break;
                }
            }

            String displayText = mr.getRequestId() + " - " +
                    projectName + " - " +
                    materialName + " - Quantity: " +
                    mr.getQuantity();

            if (displayText.equals(selectedText)) {
                selectedRequest = mr;
                break;
            }
        }

        if (selectedRequest == null) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please select a valid material request.");
            a.showAndWait();
            return;
        }

        // Load Existing Quotations
        ArrayList<Quotation> quotationList = new ArrayList<Quotation>();

        File f = new File("Quotation.bin");

        if (f.exists()) {
            try {
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);

                while (true) {
                    Quotation q = (Quotation) ois.readObject();
                    quotationList.add(q);
                }

            } catch (EOFException e) {

            } catch (IOException | ClassNotFoundException e) {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setContentText("Error loading existing quotations.");
                a.showAndWait();
                return;
            }
        }

        // Generate Quotation ID
        String quotationId = "QUO-" + (quotationList.size() + 1);

        // Create Quotation
        Quotation newQuotation = new Quotation(
                quotationId,
                selectedRequest.getRequestId(),
                quotedPrice,
                deliveryDate
        );

        // Save Quotation
        try {
            FileOutputStream fos;
            ObjectOutputStream oos;

            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(newQuotation);
            oos.close();

            quotationList.add(newQuotation);

            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("Quotation submitted successfully. Quotation ID: " + quotationId);
            a.showAndWait();

            // Clear Fields
            materialRequestComboBox.setValue(null);
            quotedPriceTextField.clear();
            deliveryDatePicker.setValue(null);

        } catch (IOException e) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Error saving quotation.");
            a.showAndWait();
        }
    }
}
