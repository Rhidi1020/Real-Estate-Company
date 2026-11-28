package com.example.realestatecompany.Rhidi;

import com.example.realestatecompany.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController
{
    @javafx.fxml.FXML
    private TextField enterPasswordTextField;
    @javafx.fxml.FXML
    private TextField enterIDTextfield;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void loginOA(ActionEvent actionEvent) {
        if(enterIDTextfield.getText().isEmpty()){
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setHeaderText("Enter Id");
            a.showAndWait();
        }
        if(enterPasswordTextField.getText().isEmpty()){
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setHeaderText("Enter Password");
            a.showAndWait();
        }
        if(!enterIDTextfield.getText().matches("\\d+")){
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setHeaderText("Enter Valid Id");
            a.showAndWait();
        }
        if(enterIDTextfield.getText().equals("1")){
            if (enterPasswordTextField.getText().equals("CEO")){
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CEODashboard-View.fxml"));
                    Scene scene = new Scene(fxmlLoader.load());
                    Stage stage2 = new Stage();
                    stage2.setTitle("Real Estate Company");
                    stage2.setScene(scene);
                    stage2.show();
                }
                catch(Exception e){

                }

            }
            else{
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setHeaderText("Incorrect Password");
                a.showAndWait();
            }
        }
        if(enterIDTextfield.getText().equals("2")){
            if (enterPasswordTextField.getText().equals("Accountant")){
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Accountant/AccountantDashboard-View.fxml"));
                    Scene scene = new Scene(fxmlLoader.load());
                    Stage stage2 = new Stage();
                    stage2.setTitle("Hello!");
                    stage2.setScene(scene);
                    stage2.show();
                }
                catch(Exception e){

                }

            }
            else{
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setHeaderText("Incorrect Password");
                a.showAndWait();
            }

        }
        if(enterIDTextfield.getText().equals("3")){
            if (enterPasswordTextField.getText().equals("X")){
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("X"));
                    Scene scene = new Scene(fxmlLoader.load());
                    Stage stage2 = new Stage();
                    stage2.setTitle("Hello!");
                    stage2.setScene(scene);
                    stage2.show();
                }
                catch(Exception e){

                }
            }
            else{
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setHeaderText("Incorrect Password");
                a.showAndWait();
            }

        }
        if(enterIDTextfield.getText().equals("4")){
            if (enterPasswordTextField.getText().equals("X")){
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("X"));
                    Scene scene = new Scene(fxmlLoader.load());
                    Stage stage2 = new Stage();
                    stage2.setTitle("Hello!");
                    stage2.setScene(scene);
                    stage2.show();
                }
                catch(Exception e){

                }

            }
            else{
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setHeaderText("Incorrect Password");
                a.showAndWait();
            }

        }
        if(enterIDTextfield.getText().equals("5")){
            if (enterPasswordTextField.getText().equals("X")){
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("X"));
                    Scene scene = new Scene(fxmlLoader.load());
                    Stage stage2 = new Stage();
                    stage2.setTitle("Hello!");
                    stage2.setScene(scene);
                    stage2.show();
                }
                catch(Exception e){

                }

            }
            else{
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setHeaderText("Incorrect Password");
                a.showAndWait();
            }

        }
        if(enterIDTextfield.getText().equals("6")){
            if (enterPasswordTextField.getText().equals("X")){
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("X"));
                    Scene scene = new Scene(fxmlLoader.load());
                    Stage stage2 = new Stage();
                    stage2.setTitle("Hello!");
                    stage2.setScene(scene);
                    stage2.show();
                }
                catch(Exception e){

                }

            }
            else{
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setHeaderText("Incorrect Password");
                a.showAndWait();
            }

        }
        if(enterIDTextfield.getText().equals("7")){
            if (enterPasswordTextField.getText().equals("X")){
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("X"));
                    Scene scene = new Scene(fxmlLoader.load());
                    Stage stage2 = new Stage();
                    stage2.setTitle("Hello!");
                    stage2.setScene(scene);
                    stage2.show();
                }
                catch(Exception e){

                }

            }
            else{
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setHeaderText("Incorrect Password");
                a.showAndWait();
            }

        }
        if(enterIDTextfield.getText().equals("8")){
            if (enterPasswordTextField.getText().equals("X")){
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("X"));
                    Scene scene = new Scene(fxmlLoader.load());
                    Stage stage2 = new Stage();
                    stage2.setTitle("Hello!");
                    stage2.setScene(scene);
                    stage2.show();
                }
                catch(Exception e){

                }

            }
            else{
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setHeaderText("Incorrect Password");
                a.showAndWait();
            }

        }
        if(enterIDTextfield.getText().equals("9")) {
            if (enterPasswordTextField.getText().equals("X")) {
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("X"));
                    Scene scene = new Scene(fxmlLoader.load());
                    Stage stage2 = new Stage();
                    stage2.setTitle("Hello!");
                    stage2.setScene(scene);
                    stage2.show();
                } catch (Exception e) {

                }

            } else {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setHeaderText("Incorrect Password");
                a.showAndWait();

            }

        }
        if(enterIDTextfield.getText().equals("10")) {
            if (enterPasswordTextField.getText().equals("X")) {
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("X"));
                    Scene scene = new Scene(fxmlLoader.load());
                    Stage stage2 = new Stage();
                    stage2.setTitle("Hello!");
                    stage2.setScene(scene);
                    stage2.show();
                } catch (Exception e) {

                }

            } else {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setHeaderText("Incorrect Password");
                a.showAndWait();

            }
        }

    }

}
