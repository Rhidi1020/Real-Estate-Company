package com.example.realestatecompany.afia.controller;

import com.example.realestatecompany.AppendableObjectOutputStream;
import com.example.realestatecompany.afia.model.Project;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.*;
import java.util.ArrayList;

public class RegisterProjectController
{
    @javafx.fxml.FXML
    private ComboBox <String> projectTypeComboBox;
    @javafx.fxml.FXML
    private TextField budgetTextField;
    @javafx.fxml.FXML
    private DatePicker plannedStartDatePicker;
    @javafx.fxml.FXML
    private DatePicker plannedCompletionDatePicker;
    @javafx.fxml.FXML
    private TextField locationTextField;
    @javafx.fxml.FXML
    private Button registerProjectButton;
    @javafx.fxml.FXML
    private TextField projectNameTextField;
    @javafx.fxml.FXML
    private TextArea projectDescriptionTextArea;

    Alert alert = new Alert(Alert.AlertType.ERROR);

    @javafx.fxml.FXML
    public void initialize() {
        projectTypeComboBox.getItems().addAll("Residential", "Commercial", "Industrial", "Infrastructure", "Renovation", "Mixed-Use");
    }

    @javafx.fxml.FXML
    public void registerProjectButtonOnAction(ActionEvent actionEvent) {

        if (projectNameTextField.getText().isEmpty()) {
            alert.setContentText("Project name cannot be blank.");
            alert.showAndWait();
            return;
        }

        if (projectTypeComboBox.getValue() == null) {
            alert.setContentText("Please select a project type.");
            alert.showAndWait();
            return;
        }

        if (locationTextField.getText().isEmpty()) {
            alert.setContentText("Please enter the project location.");
            alert.showAndWait();
            return;
        }

        if (budgetTextField.getText().isEmpty()) {
            alert.setContentText("Please enter the project budget.");
            alert.showAndWait();
            return;
        }

        int budget;

        try {
            budget = Integer.parseInt(budgetTextField.getText());

            if (budget <= 0) {
                alert.setContentText("Budget must be a number greater than 0.");
                alert.showAndWait();
                return;
            }

        } catch (NumberFormatException e) {
            alert.setContentText("Budget must be a number greater than 0.");
            alert.showAndWait();
            return;
        }

        if (plannedStartDatePicker.getValue() == null) {
            alert.setContentText("Please select the planned start date.");
            alert.showAndWait();
            return;
        }

        if (plannedCompletionDatePicker.getValue() == null) {
            alert.setContentText("Please select the planned completion date.");
            alert.showAndWait();
            return;
        }

        if (!plannedCompletionDatePicker.getValue().isAfter(plannedStartDatePicker.getValue())) {
            alert.setContentText("Planned completion date must be after the planned start date.");
            alert.showAndWait();
            return;
        }

        if (projectDescriptionTextArea.getText().isEmpty()) {
            alert.setContentText("Please enter the project description.");
            alert.showAndWait();
            return;
        }

        try {
            ArrayList<Project> projectList = new ArrayList<Project>();
            File f = new File("Project.bin");

            if (f.exists()) {
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);
                try {
                    while (true) {
                        projectList.add((Project) ois.readObject());
                    }
                } catch (EOFException e) {

                }
                ois.close();
            }

            for (Project p : projectList) {
                if (p.getName().equalsIgnoreCase(projectNameTextField.getText())
                        && p.getLocation().equalsIgnoreCase(locationTextField.getText())) {
                    alert.setContentText("A project with this name and location already exists.");
                    alert.showAndWait();
                    return;
                }
            }

            String projectId = "PRJ-" + (projectList.size() + 1);

            Project newProject = new Project(
                    projectId,
                    projectNameTextField.getText(),
                    projectTypeComboBox.getValue(),
                    locationTextField.getText(),
                    budget,
                    plannedStartDatePicker.getValue(),
                    plannedCompletionDatePicker.getValue(),
                    projectDescriptionTextArea.getText()
            );

            FileOutputStream fos = null;
            ObjectOutputStream oos = null;
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(newProject);
            oos.close();

            Alert ok = new Alert(Alert.AlertType.INFORMATION);
            ok.setContentText("Project " + projectId + " registered successfully.");
            ok.showAndWait();

            projectNameTextField.clear();
            locationTextField.clear();
            budgetTextField.clear();
            projectDescriptionTextArea.clear();
            projectTypeComboBox.setValue(null);
            plannedStartDatePicker.setValue(null);
            plannedCompletionDatePicker.setValue(null);

        } catch (Exception e) {
            e.printStackTrace();
            alert.setContentText("Something went wrong while saving the project.");
            alert.showAndWait();
        }
    }
}