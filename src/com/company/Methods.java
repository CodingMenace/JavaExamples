package com.company;

public class Methods {

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        String name = "John";
        int position = calculateHighScorePosition(score);

        int highScore =calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println(highScore);
        
       displayHighScorePosition(name,position);
        System.out.println(position);
    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;
        if (score >= 1000) {
           position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
          position = 3;
        }
        return position;
    }

}

