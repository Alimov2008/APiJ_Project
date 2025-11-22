package com.example.apij_project.controllers;

import com.example.apij_project.AppNavigator;
import com.example.apij_project.logic.ScoreManager;

public class StartController {
    public void startGame() {
        ScoreManager.nextLevel();
        AppNavigator.switchScene("tictactoe-view.fxml");
    }
}
