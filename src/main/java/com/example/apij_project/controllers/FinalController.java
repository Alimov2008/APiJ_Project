package com.example.apij_project.controllers;

import com.example.apij_project.logic.ScoreManager;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import com.example.apij_project.AppNavigator;

public class FinalController {

    @FXML private Label resultLabel;

    @FXML
    public void initialize() {

        int score = ScoreManager.getScore();
        int total = ScoreManager.getTotalLevels();

        if (score >= 0) {

            resultLabel.setText("Do'st !");
        } else {
            resultLabel.setText("Your score is "+score);
            resultLabel.setText("Dushman !");
        }
    }

    public void restartGame() { AppNavigator.switchScene("start-view.fxml"); }
    public void exitGame() { Platform.exit(); }
}