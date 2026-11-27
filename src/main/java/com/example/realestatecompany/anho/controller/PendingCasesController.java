package com.example.realestatecompany.anho.controller;

import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class PendingCasesController {
    @javafx.fxml.FXML
    private TableColumn clientIdColumn;
    @javafx.fxml.FXML
    private TableColumn priorityColumn;
    @javafx.fxml.FXML
    private TableColumn caseIdColumn;
    @javafx.fxml.FXML
    private ComboBox filterStatusComboBox;
    @javafx.fxml.FXML
    private TextField searchKeywordField;
    @javafx.fxml.FXML
    private TableColumn openedDateColumn;
    @javafx.fxml.FXML
    private TableColumn statusColumn;
    @javafx.fxml.FXML
    private TableView pendingCasesTableView;
    @javafx.fxml.FXML
    private TableColumn categoryColumn;
    @javafx.fxml.FXML
    private TableColumn complaintIdColumn;

    @javafx.fxml.FXML
    public void searchPendingCasesButton() {
    }

    @javafx.fxml.FXML
    public void viewPendingCasesBButton() {
    }
}
