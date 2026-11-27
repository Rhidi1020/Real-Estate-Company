
package com.example.realestatecompany.afia.controller;

import com.example.realestatecompany.AppendableObjectOutputStream;
import com.example.realestatecompany.afia.model.Project;
import com.example.realestatecompany.afia.model.ProjectIssue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class RecordIssueController {

    @FXML
    private TextField titleTextField;
    @FXML
    private DatePicker dateIdentifiedPicker;
    @FXML
    private ComboBox<String> projectComboBox;
    @FXML
    private TextArea descriptionTextArea;
    @FXML
    private ComboBox<String> severityComboBox;

    private ArrayList<Project> projectList = new ArrayList<>();
    private ArrayList<ProjectIssue> issueList = new ArrayList<>();

    @FXML
    public void initialize() {

        severityComboBox.getItems().add("Low");
        severityComboBox.getItems().add("Medium");
        severityComboBox.getItems().add("High");

        File projectFile = new File("Project.bin");

        if (projectFile.exists()) {
            try {
                FileInputStream fis = new FileInputStream(projectFile);
                ObjectInputStream ois = new ObjectInputStream(fis);

                while (true) {
                    Project project = (Project) ois.readObject();
                    projectList.add(project);

                    projectComboBox.getItems().add(
                            project.getProjectId() + " - " + project.getName()
                    );
                }

            } catch (EOFException e) {
                // Finished reading projects.
            } catch (IOException | ClassNotFoundException e) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Unable to load project records.");
                alert.showAndWait();
            }
        }

        File issueFile = new File("ProjectIssue.bin");

        if (issueFile.exists()) {
            try {
                FileInputStream fis = new FileInputStream(issueFile);
                ObjectInputStream ois = new ObjectInputStream(fis);

                while (true) {
                    ProjectIssue issue = (ProjectIssue) ois.readObject();
                    issueList.add(issue);
                }

            } catch (EOFException e) {
                // Finished reading issues.
            } catch (IOException | ClassNotFoundException e) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Unable to load issue records.");
                alert.showAndWait();
            }
        }
    }

    @FXML
    public void saveIssueButtonOnAction(ActionEvent actionEvent) {

        if (projectComboBox.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please select a project.");
            alert.showAndWait();
            return;
        }

        if (titleTextField.getText().trim().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please enter the issue title.");
            alert.showAndWait();
            return;
        }

        if (descriptionTextArea.getText().trim().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please enter the issue description.");
            alert.showAndWait();
            return;
        }

        if (severityComboBox.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please select the issue severity.");
            alert.showAndWait();
            return;
        }

        if (dateIdentifiedPicker.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please select the date identified.");
            alert.showAndWait();
            return;
        }

        if (dateIdentifiedPicker.getValue().isAfter(LocalDate.now())) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Date identified cannot be in the future.");
            alert.showAndWait();
            return;
        }

        String projectId = "";

        for (Project project : projectList) {
            String projectDetails = project.getProjectId() + " - " + project.getName();

            if (projectDetails.equals(projectComboBox.getValue())) {
                projectId = project.getProjectId();
                break;
            }
        }

        String issueId = "PI-" + (issueList.size() + 1);

        ProjectIssue issue = new ProjectIssue(
                issueId,
                projectId,
                titleTextField.getText(),
                descriptionTextArea.getText(),
                severityComboBox.getValue(),
                dateIdentifiedPicker.getValue(),
                "Open"
        );

        try {
            FileOutputStream fos = new FileOutputStream("ProjectIssue.bin", true);
            AppendableObjectOutputStream aoos = new AppendableObjectOutputStream(fos);

            aoos.writeObject(issue);
            aoos.close();

            issueList.add(issue);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Issue recorded successfully.");
            alert.showAndWait();

            projectComboBox.setValue(null);
            titleTextField.clear();
            descriptionTextArea.clear();
            severityComboBox.setValue(null);
            dateIdentifiedPicker.setValue(null);

        } catch (IOException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Unable to save the issue.");
            alert.showAndWait();
        }
    }
}
