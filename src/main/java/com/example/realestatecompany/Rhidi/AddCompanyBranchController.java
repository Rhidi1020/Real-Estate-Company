package com.example.realestatecompany.Rhidi;

import com.example.realestatecompany.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class AddCompanyBranchController
{
    @javafx.fxml.FXML
    private TextField emailTextFields;
    @javafx.fxml.FXML
    private TextField contactNumberTextFields;
    @javafx.fxml.FXML
    private TextField addressTextFields;
    @javafx.fxml.FXML
    private TextField branchNameTextFields;
    @javafx.fxml.FXML
    private TableColumn<String, AddCompanyBranch> contactNumberTC;
    @javafx.fxml.FXML
    private TableColumn<String, AddCompanyBranch> addressTC;
    @javafx.fxml.FXML
    private TableColumn<String, AddCompanyBranch> emailTC;
    @javafx.fxml.FXML
    private TableColumn<String, AddCompanyBranch> branchNameTC;
    @javafx.fxml.FXML
    private Label addCompanyBranchLabel;

    @javafx.fxml.FXML
    public void initialize() {
        branchNameTC.setCellValueFactory(new PropertyValueFactory<>("branchName"));
        addressTC.setCellValueFactory(new PropertyValueFactory<>("address"));
        contactNumberTC.setCellValueFactory(new PropertyValueFactory<>("contactNumber"));
        emailTC.setCellValueFactory(new PropertyValueFactory<>("email"));

    }

    @javafx.fxml.FXML
    public void addCompanyBranchOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CEODashboard-View.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setTitle("CEO Dashboard");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void loadOA(ActionEvent actionEvent) {
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