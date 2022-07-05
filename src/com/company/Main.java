package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(calcFeetAndInchesToCentimeters(48));

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unknown Player scored " + score + " points");
        return score * 1000;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if ((feet < 0) || (inches > 0 || inches <= 12)) {
            return (inches * 2.54) + ((feet * 12) * 2.54);

        } else return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches > 0) {
            double feetToInch =  inches / 12;
            double remainder = inches % 12;
            return calcFeetAndInchesToCentimeters(feetToInch, remainder);
        } else return -1;
    }


}
