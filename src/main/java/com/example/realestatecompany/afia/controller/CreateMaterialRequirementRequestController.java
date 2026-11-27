package com.example.realestatecompany.afia.controller;

import com.example.realestatecompany.AppendableObjectOutputStream;
import com.example.realestatecompany.afia.model.Material;
import com.example.realestatecompany.afia.model.MaterialRequest;
import com.example.realestatecompany.afia.model.Project;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class CreateMaterialRequirementRequestController {

    @FXML
    private ComboBox<String> priorityComboBox;

    @FXML
    private DatePicker requiredDatePicker;

    @FXML
    private ComboBox<String> materialComboBox;

    @FXML
    private ComboBox<String> projectComboBox;

    @FXML
    private TextField quantityTextField;

    private ArrayList<Project> projectList;
    private ArrayList<Material> materialList;

    @FXML
    public void initialize() {

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
                    projectComboBox.getItems().add(p.getProjectId() + " - " + p.getName());
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
                    materialComboBox.getItems().add(m.getMaterialId() + " - " + m.getName());
                }

            } catch (EOFException e) {

            } catch (IOException | ClassNotFoundException e) {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setContentText("Error loading materials.");
                a.showAndWait();
            }
        }

        // Load Priority Options
        priorityComboBox.getItems().addAll("Normal", "High", "Urgent");
    }

    @FXML
    public void submitRequestButtonOnAction(ActionEvent actionEvent) {

        // Validation
        if (projectComboBox.getValue() == null ||
                materialComboBox.getValue() == null ||
                quantityTextField.getText().isEmpty() ||
                requiredDatePicker.getValue() == null ||
                priorityComboBox.getValue() == null) {

            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please fill in all the fields.");
            a.showAndWait();
            return;
        }

        double quantity;

        try {
            quantity = Double.parseDouble(quantityTextField.getText());

            if (quantity <= 0) {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setContentText("Quantity must be greater than zero.");
                a.showAndWait();
                return;
            }

        } catch (NumberFormatException e) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please enter a valid quantity.");
            a.showAndWait();
            return;
        }

        LocalDate requiredDate = requiredDatePicker.getValue();

        if (requiredDate.isBefore(LocalDate.now())) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Required delivery date cannot be in the past.");
            a.showAndWait();
            return;
        }

        // Find Selected Project
        Project selectedProject = null;
        String selectedProjectText = projectComboBox.getValue();

        for (Project p : projectList) {
            if ((p.getProjectId() + " - " + p.getName()).equals(selectedProjectText)) {
                selectedProject = p;
                break;
            }
        }

        // Find Selected Material
        Material selectedMaterial = null;
        String selectedMaterialText = materialComboBox.getValue();

        for (Material m : materialList) {
            if ((m.getMaterialId() + " - " + m.getName()).equals(selectedMaterialText)) {
                selectedMaterial = m;
                break;
            }
        }

        if (selectedProject == null || selectedMaterial == null) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Invalid project or material selection.");
            a.showAndWait();
            return;
        }

        // Load Existing Material Requests
        ArrayList<MaterialRequest> requestList = new ArrayList<MaterialRequest>();

        File f = new File("MaterialRequest.bin");

        if (f.exists()) {
            try {
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);

                while (true) {
                    MaterialRequest mr = (MaterialRequest) ois.readObject();
                    requestList.add(mr);
                }

            } catch (EOFException e) {

            } catch (IOException | ClassNotFoundException e) {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setContentText("Error loading existing material requests.");
                a.showAndWait();
                return;
            }
        }

        // Generate Request ID
        String requestId = "MR-" + (requestList.size() + 1);

        // Create Material Request
        MaterialRequest newRequest = new MaterialRequest(
                requestId,
                selectedProject.getProjectId(),
                selectedMaterial.getMaterialId(),
                quantity,
                LocalDate.now(),
                requiredDate,
                priorityComboBox.getValue(),
                "Pending"
        );

        // Save Material Request
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

            oos.writeObject(newRequest);
            oos.close();

            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("Material requirement request submitted successfully.");
            a.showAndWait();

            // Clear Fields
            projectComboBox.setValue(null);
            materialComboBox.setValue(null);
            quantityTextField.clear();
            requiredDatePicker.setValue(null);
            priorityComboBox.setValue(null);

        } catch (IOException e) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Error saving material request.");
            a.showAndWait();
        }
    }
}