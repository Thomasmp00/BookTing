package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
    @FXML
    private Label lbl;

    public void clickBtn(ActionEvent actionEvent) {
        lbl.setText("Huh?");
    }

    public void handleCreate(ActionEvent actionEvent) {
    }

    public void handleEdit(ActionEvent actionEvent) {
    }

    public void handleDelete(ActionEvent actionEvent) {
    }
}
