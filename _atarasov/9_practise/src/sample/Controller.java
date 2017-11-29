package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.KeyEvent;
import javafx.scene.control.*;

public class Controller {

    @FXML
    TextField pole;

    public void logClick(ActionEvent actionEvent) {
        System.out.println("Hello " + pole.getText());
    }

    public void handleNewKey(KeyEvent keyEvent) {
        System.out.println(keyEvent.getText());
    }
}
