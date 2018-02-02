import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        setScene(primaryStage);
    }

    private void setScene(Stage primaryStage) {
        primaryStage.setTitle("The Way");
        Scene value = new Scene(new TheWayPaneController());
        primaryStage.setScene(value);
        primaryStage.show();
    }
}
