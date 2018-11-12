package sample;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LeaseDocument {



  public void goback(ActionEvent event) throws IOException {

    Parent loginScreen = FXMLLoader.load(getClass().getResource("StudentScreen.fxml"));
    Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    loginStage.setScene(new Scene(loginScreen));
    loginScreen.getStylesheets().add
        (Login.class.getResource("Login.css").toExternalForm());
    loginStage.show();
  }
}
