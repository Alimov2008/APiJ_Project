package com.example.apij_project.controllers;

import com.example.apij_project.logic.ScoreManager;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FinalController {

    @FXML private Label resultLabel;

    @FXML
    public void initialize() {
        int score = ScoreManager.getScore();
        int total = ScoreManager.getTotalLevels();

        if (score >= total * 0.6) {
            resultLabel.setText("Victory! Your score: " + score);
        } else {
            resultLabel.setText("You failed! Score: " + score);
        }
    }
}