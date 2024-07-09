package project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(@SuppressWarnings("exports") Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("view/fxml/ventana1.fxml"));
        Parent root = loader.load();
        stage.setScene(new Scene(root));
        stage.setTitle("Panel de control");

        stage.show();
    }

    @SuppressWarnings("exports")
    public Stage FxmlVentana1() throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("view/fxml/tableDrivers.fxml"));
        Parent root = loader.load();
        stage.setScene(new Scene(root));
        stage.setTitle("ventana 2");

        return stage;
    }

    @SuppressWarnings("exports")
    public Stage FxmlVentana2() throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("view/fxml/tableConstructors.fxml"));
        Parent root = loader.load();
        stage.setScene(new Scene(root));
        stage.setTitle("ventana 3");

        return stage;
    }

    public static void main(String[] args) {
        launch();
    }

}