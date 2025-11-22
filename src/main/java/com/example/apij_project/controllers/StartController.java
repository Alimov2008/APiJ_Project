package com.example.apij_project.controllers;

import com.example.apij_project.AppNavigator;
import com.example.apij_project.logic.ScoreManager;

public class StartConstroller {
    public void startGame() {
        ScoreManager.nextLevel();
        AppNavigator.switchScene("tictactoe-view.fxml");
    }
}
