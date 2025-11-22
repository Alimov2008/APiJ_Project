package com.example.apij_project.controllers;

import com.example.game.AppNavigator;
import com.example.game.logic.ScoreManager;

public class StartConstroller {
    public void startGame() {
        ScoreManager.nextLevel();
        AppNavigator.switchScene("tictactoe-view.fxml");
    }
}
