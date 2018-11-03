package sample;


import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class Login {


    @FXML
    private JFXTextField UserID;

    @FXML
    private JFXPasswordField userPass;

    @FXML
    private Button login;

    @FXML
    private Label loginFail;

    @FXML
    private Button createAccount;

    @FXML
    void signIn(ActionEvent event) throws IOException {
        if(UserID.getText().equals("admin") && userPass.getText().equals("admin")) {
            Parent adminDash = FXMLLoader.load(getClass().getResource("Admin.fxml"));
            Stage adminScreen = (Stage) ((Node) event.getSource()).getScene().getWindow();
            adminScreen.setScene(new Scene(adminDash));
            adminScreen.show();
        }
        else if(UserID.getText().equals("student") && userPass.getText().equals("student")) {
            Parent studentDash = FXMLLoader.load(getClass().getResource("StudentScreen.fxml"));
            Stage studentScreen = (Stage) ((Node) event.getSource()).getScene().getWindow();
            studentScreen.setScene(new Scene(studentDash));
            studentScreen.show();
        }
        else {
            loginFail.setVisible(true);
        }

    }

    @FXML
    void createAccount(ActionEvent event) throws IOException {

        Parent createAccount = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
        Stage signUpScreen = (Stage) ((Node) event.getSource()).getScene().getWindow();
        signUpScreen.setScene(new Scene(createAccount));
        signUpScreen.show();
    }


}
