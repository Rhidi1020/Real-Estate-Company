module com.example.realestatecompany {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.realestatecompany to javafx.fxml;
    exports com.example.realestatecompany;
}