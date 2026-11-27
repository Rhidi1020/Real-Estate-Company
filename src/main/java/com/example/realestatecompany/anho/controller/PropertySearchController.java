package com.example.realestatecompany.anho.controller;

import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class PropertySearchController {
    @javafx.fxml.FXML
    private ComboBox propertyTypeComboBox;
    @javafx.fxml.FXML
    private TextField locationField;
    @javafx.fxml.FXML
    private TableColumn propertyTypeColumn;
    @javafx.fxml.FXML
    private TextField minPriceField;
    @javafx.fxml.FXML
    private TableColumn locationColumn;
    @javafx.fxml.FXML
    private TextField maxPriceField;
    @javafx.fxml.FXML
    private TableColumn statusColumn;
    @javafx.fxml.FXML
    private TableColumn areaColumn;
    @javafx.fxml.FXML
    private TableView propertyTableView;
    @javafx.fxml.FXML
    private TableColumn priceColumn;
    @javafx.fxml.FXML
    private TableColumn propertyIdColumn;

    @javafx.fxml.FXML
    public void clearButton() {
    }

    @javafx.fxml.FXML
    public void searchPropertiesButton() {
    }
}
