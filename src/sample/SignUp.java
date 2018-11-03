package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class SignUp {

    @FXML
    private JFXButton resetButton;

    @FXML
    private JFXButton submitButton;

    @FXML
    private JFXButton goBack;

    @FXML
    private JFXTextField firstName;

    @FXML
    private JFXTextField lastName;

    @FXML
    private JFXTextField userID;

    @FXML
    private JFXTextField password;

    @FXML
    private JFXTextField address;

    @FXML
    private JFXTextField phoneNumber;

    @FXML
    private JFXTextField DOB;

    @FXML
    private JFXTextField city;

    @FXML
    private JFXTextField state;

    @FXML
    private JFXTextField zipCode;

    @FXML
    private JFXComboBox<?> gender;

    @FXML
    private JFXTextField email;


    @FXML
    void goBack(ActionEvent event) throws IOException {
        Parent loginScreen = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        loginStage.setScene(new Scene(loginScreen));
        loginScreen.getStylesheets().add
                (Login.class.getResource("Login.css").toExternalForm());
        loginStage.show();

    }

    @FXML
    void resetAll(ActionEvent event) {

        firstName.clear();
        userID.clear();
        address.clear();
        phoneNumber.clear();
        DOB.clear();
        lastName.clear();
        password.clear();
        city.clear();
        email.clear();
        state.clear();
        zipCode.clear();
        gender.getSelectionModel().clearSelection();
        gender.setPromptText("Sex");
    }

    @FXML
    void submit(ActionEvent event) throws IOException {

        Parent loginScreen = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        loginStage.setScene(new Scene(loginScreen));
        loginScreen.getStylesheets().add
                (Login.class.getResource("Login.css").toExternalForm());
        loginStage.show();
    }
}
