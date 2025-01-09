package com.javaproject.aldeny.zip.maker.and.convertor;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
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
        stage.setTitle("My Application");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}