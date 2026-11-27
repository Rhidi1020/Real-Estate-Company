
package com.example.realestatecompany.afia.controller;

import com.example.realestatecompany.AppendableObjectOutputStream;
import com.example.realestatecompany.afia.model.Milestone;
import com.example.realestatecompany.afia.model.Project;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.*;
import java.util.ArrayList;

public class DefineMilestoneController {

    @javafx.fxml.FXML
    private ComboBox<String> projectComboBox;

    @javafx.fxml.FXML
    private DatePicker targetDatePicker;

    @javafx.fxml.FXML
    private TextField milestoneNameTextField;

    private ArrayList<Project> projectList;

    Alert alert = new Alert(Alert.AlertType.ERROR);

    @javafx.fxml.FXML
    public void initialize() {

        projectList = new ArrayList<Project>();

        File f = new File("Project.bin");

        if (f.exists()) {
            try {
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);

                try {
                    while (true) {
                        projectList.add((Project) ois.readObject());
                    }
                } catch (EOFException e) {

                }
                ois.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (Project p : projectList) {
            projectComboBox.getItems().add(
                    p.getProjectId() + " - " + p.getName()
            );
        }
    }

    @javafx.fxml.FXML
    public void addMilestoneButtonOnAction(ActionEvent actionEvent) {

        if (projectComboBox.getValue() == null) {
            alert.setContentText("Please select a project.");
            alert.showAndWait();
            return;
        }

        if (milestoneNameTextField.getText().trim().isEmpty()) {
            alert.setContentText("Milestone name cannot be blank.");
            alert.showAndWait();
            return;
        }

        if (targetDatePicker.getValue() == null) {
            alert.setContentText("Please select a valid target date.");
            alert.showAndWait();
            return;
        }

        String selectedProject = projectComboBox.getValue();
        Project selected = null;

        for (Project p : projectList) {
            if ((p.getProjectId() + " - " + p.getName()).equals(selectedProject)) {
                selected = p;
                break;
            }
        }

        if (targetDatePicker.getValue().isBefore(selected.getPlannedStartDate())
                || targetDatePicker.getValue().isAfter(selected.getPlannedCompletionDate())) {

            alert.setContentText(
                    "Milestone date must be within the project's planned start and completion dates."
            );
            alert.showAndWait();
            return;
        }

        try {
            ArrayList<Milestone> milestoneList = new ArrayList<Milestone>();
            File f = new File("Milestone.bin");

            if (f.exists()) {
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);

                try {
                    while (true) {
                        milestoneList.add((Milestone) ois.readObject());
                    }
                } catch (EOFException e) {
                }

                ois.close();
            }

            String milestoneId = "MS-" + (milestoneList.size() + 1);

            Milestone newMilestone = new Milestone(
                    milestoneId,
                    selected.getProjectId(),
                    milestoneNameTextField.getText().trim(),
                    targetDatePicker.getValue()
            );

            FileOutputStream fos;
            ObjectOutputStream oos;

            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(newMilestone);
            System.out.println(newMilestone.getProjectId());
            oos.close();

            Alert ok = new Alert(Alert.AlertType.INFORMATION);
            ok.setContentText("Milestone added successfully.");
            ok.showAndWait();

            milestoneNameTextField.clear();
            targetDatePicker.setValue(null);

        } catch (Exception e) {
            e.printStackTrace();
            alert.setContentText(
                    "Something went wrong while saving the milestone."
            );
            alert.showAndWait();
        }
    }
}
