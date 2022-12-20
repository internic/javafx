package MiniWeb;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;



public class MiniWebMain extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MiniWeb.fxml"));
        Parent root = loader.load();
        MiniWebController controller = loader.getController();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        scene.getStylesheets().add(this.getClass().getResource("style.css").toExternalForm());

        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}
