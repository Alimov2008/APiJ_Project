package com.example.apij_project.controllers;


import com.example.apij_project.AppNavigator;
import com.example.apij_project.logic.ScoreManager;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TicTacToeController {

    @FXML private Label scoreLbl;
    @FXML private Label statusLbl;
    @FXML private Button nextButton;

    @FXML private Button btn00, btn01, btn02;
    @FXML private Button btn10, btn11, btn12;
    @FXML private Button btn20, btn21, btn22;

    private Button[][] grid;
    private boolean finished = false;

    @FXML
    public void initialize() {
        scoreLbl.setText("Score: " + ScoreManager.getScore());

        grid = new Button[][] {
                { btn00, btn01, btn02 },
                { btn10, btn11, btn12 },
                { btn20, btn21, btn22 }
        };
    }

    @FXML
    public void playerMove(javafx.event.ActionEvent e) {
        if (finished) return;

        Button btn = (Button) e.getSource();

        if (!btn.getText().isEmpty()) return; // already used

        btn.setText("X"); // Player move

        if (checkWin("X")) {
            winGame();
            return;
        }

        if (boardFull()) {
            drawGame();
            return;
        }

        aiMove(); // computer plays

        if (checkWin("O")) {
            loseGame();
            return;
        }

        if (boardFull()) {
            drawGame();
        }
    }

    private void aiMove() {
        List<Button> free = new ArrayList<>();
        for (Button[] row : grid) {
            for (Button b : row) {
                if (b.getText().isEmpty()) free.add(b);
            }
        }

        if (free.isEmpty()) return;

        Button choice = free.get(new Random().nextInt(free.size()));
        choice.setText("O");
    }