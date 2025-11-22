package com.example.apij_project;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        AppNavigator.setStage(stage);
        AppNavigator.switchScene("start-view.fxml");
    }

    public static void main(String[] args) {
        launch();
    }
}