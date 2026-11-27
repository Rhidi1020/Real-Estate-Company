module com.example.realestatecompany {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.realestatecompany to javafx.fxml;
    exports com.example.realestatecompany;
    exports com.example.realestatecompany.afia.model;
    opens com.example.realestatecompany.afia.model to javafx.fxml;
    exports com.example.realestatecompany.afia.controller;
    opens com.example.realestatecompany.afia.controller to javafx.fxml;
}