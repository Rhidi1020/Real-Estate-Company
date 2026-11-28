package com.example.realestatecompany.Rhidi;

import com.example.realestatecompany.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CreateCompanyAnnouncementController
{
    @javafx.fxml.FXML
    private ComboBox<String> categoryComboBox;
    @javafx.fxml.FXML
    private TextField announcementTitelTextFields;
    @javafx.fxml.FXML
    private Label createCompanyAnnouncementLabel;
    @javafx.fxml.FXML
    private TextArea descriptionTextArea;

    @javafx.fxml.FXML
    public void initialize() {
        categoryComboBox.getItems().addAll("General Announcement","Company notice","Meeting Notice","Policy Update");
    }


    @javafx.fxml.FXML
    public void createCompanyAnnouncementOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CEODashboard-View.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setTitle("Announcement");
        stage.setScene(scene);
        stage.show();
    }
}