package com.hemenace;

public class Expressions {

    public static void main(String[] args) {

        double kilometres = 100 * 1.609344;

        //expression is after the data type double in this case

        //Statements are the entire line assignments/expressions
        int myVariable = 50;
        myVariable++;
        System.out.println("My number is " + myVariable);

        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;
        int finaScore = score + (levelCompleted * bonus);

        if (score <= 4000) {
            System.out.println("Your score was 5000");
        } else
            System.out.println("This was executed");

        if (gameOver){
            System.out.println("Your final score was " + finaScore);
        }



    }
}
