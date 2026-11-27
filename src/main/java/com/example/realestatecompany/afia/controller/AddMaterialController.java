
package com.example.realestatecompany.afia.controller;

import com.example.realestatecompany.AppendableObjectOutputStream;
import com.example.realestatecompany.afia.model.Material;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.io.*;
import java.util.ArrayList;

public class AddMaterialController {

    @FXML
    private ComboBox<String> categoryComboBox;

    @FXML
    private TextField unitPriceTextField;

    @FXML
    private TextField availableQuantityTextField;

    @FXML
    private TextField materialNameTextField;

    private ArrayList<Material> materialList;

    @FXML
    public void initialize() {

        materialList = new ArrayList<Material>();

        // Populate Category ComboBox
        categoryComboBox.getItems().addAll(
                "Cement", "Steel", "Brick", "Sand", "Aggregate", "Other"
        );

        // Load Existing Materials
        File f = new File("Material.bin");

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
    }

    @FXML
    public void addMaterialButtonOnAction(ActionEvent actionEvent) {

        // Validate Required Fields
        if (materialNameTextField.getText().trim().isEmpty() ||
                categoryComboBox.getValue() == null ||
                unitPriceTextField.getText().trim().isEmpty() ||
                availableQuantityTextField.getText().trim().isEmpty()) {

            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please fill in all the fields.");
            a.showAndWait();
            return;
        }

        // Validate Numeric Values
        double unitPrice;
        double availableQuantity;

        try {
            unitPrice = Double.parseDouble(unitPriceTextField.getText());
            availableQuantity = Double.parseDouble(availableQuantityTextField.getText());

            if (unitPrice <= 0 || availableQuantity < 0) {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setContentText("Unit price must be greater than zero and quantity cannot be negative.");
                a.showAndWait();
                return;
            }

        } catch (NumberFormatException e) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please enter valid numeric values.");
            a.showAndWait();
            return;
        }

        // Generate Material ID
        String materialId = "MAT-" + (materialList.size() + 1);

        // Create Material
        Material newMaterial = new Material(
                materialId,
                materialNameTextField.getText().trim(),
                categoryComboBox.getValue(),
                unitPrice,
                availableQuantity
        );

        // Save Material
        File f = new File("Material.bin");

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

            oos.writeObject(newMaterial);
            oos.close();

            materialList.add(newMaterial);

            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("Material added successfully. Material ID: " + materialId);
            a.showAndWait();

            // Clear Fields
            materialNameTextField.clear();
            categoryComboBox.setValue(null);
            unitPriceTextField.clear();
            availableQuantityTextField.clear();

        } catch (IOException e) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Error saving material.");
            a.showAndWait();
        }
    }
}
