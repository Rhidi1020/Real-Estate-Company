
package com.example.realestatecompany.afia.controller;

import com.example.realestatecompany.AppendableObjectOutputStream;
import com.example.realestatecompany.afia.model.Milestone;
import com.example.realestatecompany.afia.model.Project;
import com.example.realestatecompany.afia.model.ProjectProgress;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.*;
import java.util.ArrayList;

public class RecordProgressController {

    @javafx.fxml.FXML
    private ComboBox<String> statusComboBox;

    @javafx.fxml.FXML
    private TextField progressPercentageField;

    @javafx.fxml.FXML
    private ComboBox<String> projectComboBox;

    @javafx.fxml.FXML
    private TextArea descriptionTextArea;

    @javafx.fxml.FXML
    private ComboBox<String> milestoneComboBox;

    @javafx.fxml.FXML
    private DatePicker progressDatePicker;

    private ArrayList<Project> projectList;
    private ArrayList<Milestone> milestoneList;

    Alert alert = new Alert(Alert.AlertType.ERROR);

    @javafx.fxml.FXML
    public void initialize() {

        projectList = new ArrayList<Project>();
        milestoneList = new ArrayList<Milestone>();

        statusComboBox.getItems().addAll(
                "Not Started",
                "In Progress",
                "Completed",
                "Delayed"
        );

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
                alert.setContentText("Unable to load projects.");
                alert.showAndWait();
            }
        }

        for (Project p : projectList) {
            projectComboBox.getItems().add(
                    p.getProjectId() + " - " + p.getName()
            );
        }

        File mf = new File("Milestone.bin");

        if (mf.exists()) {
            try {
                FileInputStream fis = new FileInputStream(mf);
                ObjectInputStream ois = new ObjectInputStream(fis);

                try {
                    while (true) {
                        milestoneList.add((Milestone) ois.readObject());
                    }
                } catch (EOFException e) {

                }

                ois.close();

            } catch (Exception e) {
                alert.setContentText("Unable to load milestones.");
                alert.showAndWait();
            }
        }

        for (Milestone m : milestoneList) {
            milestoneComboBox.getItems().add(
                    m.getMilestoneId() + " - " + m.getName()
            );
        }
    }

    @javafx.fxml.FXML
    public void saveProgressButtonOnAction(ActionEvent actionEvent) {

        if (projectComboBox.getValue() == null) {
            alert.setContentText("Please select a project.");
            alert.showAndWait();
            return;
        }

        if (milestoneComboBox.getValue() == null) {
            alert.setContentText("Please select a milestone.");
            alert.showAndWait();
            return;
        }

        if (progressPercentageField.getText().trim().isEmpty()) {
            alert.setContentText("Please enter the progress percentage.");
            alert.showAndWait();
            return;
        }

        if (progressDatePicker.getValue() == null) {
            alert.setContentText("Please select a progress date.");
            alert.showAndWait();
            return;
        }

        if (statusComboBox.getValue() == null) {
            alert.setContentText("Please select a progress status.");
            alert.showAndWait();
            return;
        }

        if (descriptionTextArea.getText().trim().isEmpty()) {
            alert.setContentText("Please enter a progress description.");
            alert.showAndWait();
            return;
        }

        try {
            double percentage = Double.parseDouble(
                    progressPercentageField.getText().trim()
            );

            if (percentage < 0 || percentage > 100) {
                alert.setContentText(
                        "Progress percentage must be between 0 and 100."
                );
                alert.showAndWait();
                return;
            }

            String selectedProject = projectComboBox.getValue();
            String selectedMilestone = milestoneComboBox.getValue();

            Project selected = null;
            Milestone selectedM = null;

            for (Project p : projectList) {
                if ((p.getProjectId() + " - " + p.getName())
                        .equals(selectedProject)) {
                    selected = p;
                    break;
                }
            }

            if (selected == null) {
                alert.setContentText("Project not found.");
                alert.showAndWait();
                return;
            }

            for (Milestone m : milestoneList) {
                if ((m.getMilestoneId() + " - " + m.getName())
                        .equals(selectedMilestone)
                        && m.getProjectId().equals(selected.getProjectId())) {
                    selectedM = m;
                    break;
                }
            }

            if (selectedM == null) {
                alert.setContentText(
                        "Please select a milestone belonging to the selected project."
                );
                alert.showAndWait();
                return;
            }

            ArrayList<ProjectProgress> progressList =
                    new ArrayList<ProjectProgress>();

            File f = new File("ProjectProgress.bin");

            if (f.exists()) {
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);

                try {
                    while (true) {
                        progressList.add((ProjectProgress) ois.readObject());
                    }
                } catch (EOFException e) {

                }

                ois.close();
            }

            String progressId = "PP-" + (progressList.size() + 1);

            ProjectProgress newProgress = new ProjectProgress(
                    progressId,
                    selected.getProjectId(),
                    selectedM.getMilestoneId(),
                    percentage,
                    progressDatePicker.getValue(),
                    statusComboBox.getValue(),
                    descriptionTextArea.getText().trim()
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

            oos.writeObject(newProgress);
            oos.close();

            selectedM.setStatus(statusComboBox.getValue());

            File mf = new File("Milestone.bin");

            FileOutputStream mfos = new FileOutputStream(mf);
            ObjectOutputStream moos = new ObjectOutputStream(mfos);

            for (Milestone m : milestoneList) {
                moos.writeObject(m);
            }

            moos.close();

            Alert ok = new Alert(Alert.AlertType.INFORMATION);
            ok.setContentText("Project progress recorded successfully.");
            ok.showAndWait();

            progressPercentageField.clear();
            descriptionTextArea.clear();
            progressDatePicker.setValue(null);
            projectComboBox.setValue(null);
            milestoneComboBox.setValue(null);
            statusComboBox.setValue(null);

        } catch (NumberFormatException e) {
            alert.setContentText("Please enter a valid progress percentage.");
            alert.showAndWait();

        } catch (Exception e) {
            alert.setContentText(
                    "Something went wrong while recording project progress."
            );
            alert.showAndWait();
        }
    }
}
