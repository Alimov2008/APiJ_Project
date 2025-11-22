package com.example.apij_project;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppNavigator {
    private static Stage mainStage;

    public static void setStage(Stage stage) {
        mainStage = stage;
    }

    public static void switchScene(String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(AppNavigator.class.getResource("/com/example/apij_project/views/" + fxmlFile));
            Scene scene = new Scene(loader.load());
            scene.getStylesheets().add(
                    AppNavigator.class.getResource("/com/example/apij_project/styles/main.css")
                            .toExternalForm()
            );
            scene.getStylesheets().add(AppNavigator.class
                    .getResource("/com/example/apij_project/styles/tictactoe.css").toExternalForm());
            mainStage.setScene(scene);
            mainStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
