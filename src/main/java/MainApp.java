import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle("The Way");
        TheWayPane root = new TheWayPane();
        Scene scene = new Scene (root);
        scene.setRoot(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
