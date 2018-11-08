package sample;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StudentScreen {


  @FXML
  void maintenance(ActionEvent event) throws IOException {

    Parent maintenance = FXMLLoader.load(getClass().getResource("SubmitMaintenance.fxml"));
    Stage signUpScreen = (Stage) ((Node) event.getSource()).getScene().getWindow();
    signUpScreen.setScene(new Scene(maintenance));
    signUpScreen.show();
  }

  public void logOut(ActionEvent event) throws Exception {

    Parent loginScreen = FXMLLoader.load(getClass().getResource("Login.fxml"));
    Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    loginStage.setScene(new Scene(loginScreen));
    loginScreen.getStylesheets().add
        (Login.class.getResource("Login.css").toExternalForm());
    loginStage.show();
  }


  }

