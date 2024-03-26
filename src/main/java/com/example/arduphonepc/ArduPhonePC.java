package com.example.arduphonepc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ArduPhonePC extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ArduPhonePC.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());//Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");//Test
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}