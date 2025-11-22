package com.example.apij_project;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class AppNavigator {
    private static Stage mainStage;

    public static void setStage(Stage stage) {
        mainStage = stage;
    }

    public static void switchScene(String fxmlFile) {
        try {
            // Fixed path - added leading slash and slash before filename
            FXMLLoader loader = new FXMLLoader(AppNavigator.class.getResource("/com/example/apij_project/views/" + fxmlFile));
            Scene scene = new Scene(loader.load(),800,600);

            scene.getStylesheets().add(
                    AppNavigator.class.getResource("/com/example/apij_project/styles/main.css")
                            .toExternalForm()
            );

            if (fxmlFile.equals("tictactoe-view.fxml")) {
                scene.getStylesheets().add(
                        Objects.requireNonNull(
                                AppNavigator.class.getResource("/com/example/apij_project/styles/tictactoe.css")
                        ).toExternalForm()
                );
            }

            if (fxmlFile.equals("final-view.fxml")) {
                scene.getStylesheets().add(
                        Objects.requireNonNull(
                                AppNavigator.class.getResource("/com/example/apij_project/styles/final.css")
                        ).toExternalForm()
                );
            }

            mainStage.setScene(scene);
            mainStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
