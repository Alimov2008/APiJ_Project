package com.example.apij_project.logic;

public class ScoreManager {
    private static int score = 0;
    private static int currentLevel = 0;
    private static final int TOTAL_LEVELS = 10;

    public static void addPoint() {
        score++;
    }

    public static int getScore() {
        return score;
    }

    public static void nextLevel() {
        currentLevel++;
    }

    public static int getCurrentLevel() {
        return currentLevel;
    }

    public static int getTotalLevels() {
        return TOTAL_LEVELS;
    }

    public static boolean isGameOver() {
        return currentLevel >= TOTAL_LEVELS;
    }
}