package sample;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SubmitMaintenance {

  @FXML
  private JFXTextField room;

  @FXML
  private JFXTextField email;

  @FXML
  private JFXTextArea details;

  @FXML
  private JFXTextField name;

  @FXML
  private JFXComboBox<?> type;

  public void goBack(ActionEvent event) throws Exception {

    Parent loginScreen = FXMLLoader.load(getClass().getResource("StudentScreen.fxml"));
    Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    loginStage.setScene(new Scene(loginScreen));
    loginScreen.getStylesheets().add
        (Login.class.getResource("Login.css").toExternalForm());
    loginStage.show();
  }

  public void resetAll() {
    name.clear();
    room.clear();
    details.clear();
    email.clear();

    type.getSelectionModel().clearSelection();
    type.setPromptText("Issue");
  }

  public void submit(ActionEvent event) throws Exception {
    Parent loginScreen = FXMLLoader.load(getClass().getResource("Login.fxml"));
    Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    loginStage.setScene(new Scene(loginScreen));
    loginScreen.getStylesheets().add
        (Login.class.getResource("Login.css").toExternalForm());
    loginStage.show();
  }

}
