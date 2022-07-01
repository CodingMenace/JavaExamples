package com.company;

public class Main {

    public static void main(String[] args) {

        long miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println(miles);
        SpeedConverter.printConversion(10.5);

//        int newScore = calculateScore("Tim", 500);
//        System.out.println("New Score is " + newScore);
//
//        int unknownPlayer = calculateScore(350);
//        System.out.println("Unknown Score is " + unknownPlayer);


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

        if ((feet < 0) || (inches < 0 || inches > 12)) {
            return (inches * 2.54) + ((feet * 12) * 2.54);

        } else return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            int feetToInch = (int) inches / 12;
            int remainder = (int) inches % 12;
            return calcFeetAndInchesToCentimeters(feetToInch, remainder);
        } else return -1;
    }


}
