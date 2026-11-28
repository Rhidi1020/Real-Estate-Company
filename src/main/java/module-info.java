//module com.example.realestatecompany {
    //requires javafx.controls;
    //requires javafx.fxml;
    //requires java.xml;


    //opens com.example.realestatecompany to javafx.fxml;
    //exports com.example.realestatecompany;
//}

            //Rhidi: Please comment my part if you change anything

module com.example.realestatecompany {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;
    //requires com.example.realestatecompany;
    requires javafx.graphics;
    //requires com.example.realestatecompany;

    opens com.example.realestatecompany to javafx.fxml;
    opens com.example.realestatecompany.Rhidi to javafx.fxml;

    exports com.example.realestatecompany;
    exports com.example.realestatecompany.Rhidi;
}


