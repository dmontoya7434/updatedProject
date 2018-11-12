package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import java.awt.TextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SubmitPayment {


  @FXML
  private JFXButton submitPayment;

  @FXML
  private JFXButton clearPayment;

  @FXML
  private JFXButton backPayment;

  @FXML
  private JFXComboBox<?> month;

  @FXML
  private JFXComboBox<?> year;

  @FXML
  private JFXTextField creditCardNumber;

  @FXML
  private JFXTextField CCV;

  @FXML
  private JFXTextField fullName;

  public void goBack(ActionEvent event) throws Exception {

    Parent loginScreen = FXMLLoader.load(getClass().getResource("StudentScreen.fxml"));
    Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    loginStage.setScene(new Scene(loginScreen));
    loginScreen.getStylesheets().add
        (Login.class.getResource("Login.css").toExternalForm());
    loginStage.show();
  }


  public void resetAll() {

    fullName.clear();
    creditCardNumber.clear();
    CCV.clear();
    year.getSelectionModel().clearSelection();
    year.setPromptText("Year");
    month.getSelectionModel().clearSelection();
    month.setPromptText("Month");
  }

  public void submit(ActionEvent event) throws Exception {
    Parent loginScreen = FXMLLoader.load(getClass().getResource("StudentScreen.fxml"));
    Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    loginStage.setScene(new Scene(loginScreen));
    loginScreen.getStylesheets().add
        (Login.class.getResource("Login.css").toExternalForm());
    loginStage.show();
  }

  @FXML
  void ccv(ActionEvent event) {

  }

  @FXML
  void creditCardNumber(ActionEvent event) {

  }

  @FXML
  void fullName(ActionEvent event) {

  }


  @FXML
  void month(ActionEvent event) {

  }

  @FXML
  void resetAll(ActionEvent event) {

  }

  @FXML
  void year(ActionEvent event) {

  }


}
