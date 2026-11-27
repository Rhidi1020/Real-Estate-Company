package com.example.realestatecompany.Rhidi;

import com.example.realestatecompany.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import org.w3c.dom.Text;

import java.io.IOException;
import java.time.LocalDate;

public class ApproveBudgetProposalController
{
    @javafx.fxml.FXML
    private DatePicker submissionDateDatePicker;
    @javafx.fxml.FXML
    private TableColumn<Float,ApproveBudgetProposal> purposeAmountTC;
    @javafx.fxml.FXML
    private TableColumn<LocalDate,ApproveBudgetProposal> submissionDateTC;
    @javafx.fxml.FXML
    private TableColumn<String, ApproveBudgetProposal> projectNameTC;
    @javafx.fxml.FXML
    private Label approveBudgetProposalLabel;
    @javafx.fxml.FXML
    private TextField projectNameTexField;
    @javafx.fxml.FXML
    private TextField purposeAmountTextField;
    @javafx.fxml.FXML
    private TextArea satusTextArea;
    @javafx.fxml.FXML
    private TableColumn<String, ApproveBudgetProposal> statusTC;

    @javafx.fxml.FXML
    public void initialize() {
        projectNameTC.setCellValueFactory(new PropertyValueFactory<>("projectName"));
        purposeAmountTC.setCellValueFactory(new PropertyValueFactory<>("purposeAmount"));
        submissionDateTC.setCellValueFactory(new PropertyValueFactory<>("submissionDate"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    @javafx.fxml.FXML
    public void approveBudgetProposalOA(ActionEvent actionEvent) {
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

    @javafx.fxml.FXML
    public void loadOA(ActionEvent actionEvent) {
    }

    public void errorAlert(String s){
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setContentText(s);
        a.showAndWait();
    }
    public void informationAlert(String s){
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText(s);
        a.showAndWait();
    }
}
