package project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import project.controller.PanelController;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(@SuppressWarnings("exports") Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("view/fxml/pagePanel.fxml"));
        Parent root = loader.load();
        stage.setScene(new Scene(root));
        stage.setTitle("Panel de control");
        // Panel de control
        PanelController controller = loader.getController();
        // Enviando panel de control.
        controller.recivePanel(stage);
        // seguir enviando escenarios
        stage.show();
    }

    @SuppressWarnings("exports")
    public Stage GenerateFxml(String file, String title) throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("view/fxml/" + file + ".fxml"));
        Parent root = loader.load();
        stage.setScene(new Scene(root));
        stage.setTitle(title);

        return stage;
    }

    public static void main(String[] args) {
        launch();
    }

}