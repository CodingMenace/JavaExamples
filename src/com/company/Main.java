package com.company;

public class Main {

    public static void main(String[] args) {

//       long miles = SpeedConverter.toMilesPerHour(10.5);
//        System.out.println("Miles = " + miles);
//        SpeedConverter.printConversion(10.5);

        int newScore = calculateScore("Tim", 500);
        System.out.println("New Score is " + newScore);

        int unknownPlayer = calculateScore(350);
        System.out.println("Unknown Score is " + unknownPlayer);


    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore( int score){
        System.out.println("Unknown Player scored " + score + " points");
        return score * 1000;
    }

    public static int calcFeetAndInchesToCentimeters(int feet, int inches){

        return -1;
    }

    public static int calcFeetAndInchesToCentimeters(int inches){

        return -1;
    }


}
