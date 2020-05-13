package com.yasudaInternational.tools.PointNameApp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
    	AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("primary.fxml"));
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("指さしくん. ver.1.0b");
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }

}