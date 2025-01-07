package com.javaproject.aldeny.zip.maker.and.convertor;

import javafx.application.Application;
import javafx.scene.StackPane;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * JavaFX App 
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 800, 640);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}