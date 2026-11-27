package com.example.realestatecompany.Rhidi;

import com.example.realestatecompany.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class AddCompanyDepartmentController
{
    @javafx.fxml.FXML
    private TextField departmentNameTextFields;
    @javafx.fxml.FXML
    private Label addCompanyDepartmentLabel;
    @javafx.fxml.FXML
    private TextArea descriptionFieldsTextArea;
    @javafx.fxml.FXML
    private TableColumn<String,AddCompanyDepartment> departmentNameTC;
    @javafx.fxml.FXML
    private TableColumn<String,AddCompanyDepartment> descriptionTC;

    @javafx.fxml.FXML
    public void initialize() {
        departmentNameTC.setCellValueFactory(new PropertyValueFactory<>("departmentName"));
        descriptionTC.setCellValueFactory(new PropertyValueFactory<>("description"));
    }


    @javafx.fxml.FXML
    public void addCompanyDepatmentOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void LoadOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CEODashboard-View.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setTitle("Budget Proposal");
        stage.setScene(scene);
        stage.show();
    }
    public void errorAlert(String s){
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setContentText(s);
        a.showAndWait();
    }
    public void informationAlert(String s) {
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText(s);
        a.showAndWait();
    }
}