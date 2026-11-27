package com.example.realestatecompany.anho.controller;

import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ServiceRecordGeneratorController {
    @javafx.fxml.FXML
    private ComboBox recordTypeComboBox;
    @javafx.fxml.FXML
    private TableColumn clientIdColumn;
    @javafx.fxml.FXML
    private TableColumn caseIdColumn;
    @javafx.fxml.FXML
    private DatePicker endDatePicker;
    @javafx.fxml.FXML
    private TableColumn statusColumn;
    @javafx.fxml.FXML
    private DatePicker startDatePicker;
    @javafx.fxml.FXML
    private TableColumn recordIdColumn;
    @javafx.fxml.FXML
    private TableView serviceRecordsTableView;
    @javafx.fxml.FXML
    private TableColumn recordTypeColumn;
    @javafx.fxml.FXML
    private TableColumn dateColumn;
    @javafx.fxml.FXML
    private TableColumn complaintIdColumn;

    @javafx.fxml.FXML
    public void filterRecordsButton() {
    }

    @javafx.fxml.FXML
    public void generateRecordsButton() {
    }
}
