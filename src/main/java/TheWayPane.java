import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class TheWayPane extends BorderPane{
    public TheWayPane() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("TheWayPane.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void initialize() {
    }

    public void closeOnAction(ActionEvent actionEvent) {
        System.out.println("button click!");
    }
}

