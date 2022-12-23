package com.jastermaster;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Program extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(Main.getResource("/fxml/mainView.fxml"));
        primaryStage.setScene(new Scene(loader.load(), 1280, 720));
        primaryStage.show();
    }
}
