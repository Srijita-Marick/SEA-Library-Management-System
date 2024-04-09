package sea.cpsc233projectgui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class LibraryApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LibraryApplication.class.getResource("library.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 750, 600);
        stage.setTitle("Welcome to Library");
        stage.setScene(scene);
        stage.show();
        //merging error fixing
    }

    public static void main(String[] args) {
        launch();
    }
}