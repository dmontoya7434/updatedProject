package sample;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class NewAdmin {

    @FXML
    private JFXButton backButton;

    @FXML
    private JFXButton submitButton;

    @FXML
    public void add(ActionEvent event) throws Exception {

        Parent add = FXMLLoader.load(getClass().getResource("NewAdmin.fxml"));
        Stage signUpScreen = (Stage) ((Node) event.getSource()).getScene().getWindow();
        signUpScreen.setScene(new Scene(add));
        signUpScreen.show();
    }

    @FXML
    void maintenance(ActionEvent event) throws IOException {

        Parent maintenance = FXMLLoader.load(getClass().getResource("Maintenance.fxml"));
        Stage signUpScreen = (Stage) ((Node) event.getSource()).getScene().getWindow();
        signUpScreen.setScene(new Scene(maintenance));
        signUpScreen.show();
    }

    @FXML
    void viewPayments(ActionEvent event) throws IOException {

        Parent viewPayments = FXMLLoader.load(getClass().getResource("AdminPayments.fxml"));
        Stage signUpScreen = (Stage) ((Node) event.getSource()).getScene().getWindow();
        signUpScreen.setScene(new Scene(viewPayments));
        signUpScreen.show();
    }

    @FXML
    void viewResidents(ActionEvent event) throws IOException {

        Parent viewResidents = FXMLLoader.load(getClass().getResource("ViewResidents.fxml"));
        Stage signUpScreen = (Stage) ((Node) event.getSource()).getScene().getWindow();
        signUpScreen.setScene(new Scene(viewResidents));
        signUpScreen.show();
    }

    @FXML
    void CreateEvent(ActionEvent event) throws IOException {

        Parent createEvent = FXMLLoader.load(getClass().getResource("CreateEvents.fxml"));
        Stage signUpScreen = (Stage) ((Node) event.getSource()).getScene().getWindow();
        signUpScreen.setScene(new Scene(createEvent));
        signUpScreen.show();
    }
    @FXML
    void goBack(ActionEvent event) throws IOException {
        Parent loginScreen = FXMLLoader.load(getClass().getResource("Admin.fxml"));
        Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        loginStage.setScene(new Scene(loginScreen));
        loginStage.show();

    }

    @FXML
    void submitButton(ActionEvent event) throws IOException {
        Parent loginScreen = FXMLLoader.load(getClass().getResource("Admin.fxml"));
        Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        loginStage.setScene(new Scene(loginScreen));
        loginStage.show();
    }

    @FXML
    void logOut(ActionEvent event) throws Exception {
        Parent loginScreen = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        loginStage.setScene(new Scene(loginScreen));
        loginScreen.getStylesheets().add
            (Login.class.getResource("Login.css").toExternalForm());
        loginStage.show();
    }
}
