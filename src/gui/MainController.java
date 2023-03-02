package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MainController {
    @FXML
    private Label lbl;

    public void clickBtn(ActionEvent actionEvent) {
        lbl.setText("Huh?");
    }

    public void handleCreate(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/GUI/View/CreateMovieWindow.fxml"));
        AnchorPane pane = (AnchorPane) loader.load();
        CrudController = loader.getController();
        
    }

    public void handleEdit(ActionEvent actionEvent) {
    }

    public void handleDelete(ActionEvent actionEvent) {
    }
}
