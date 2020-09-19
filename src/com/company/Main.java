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

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unknown Player scored " + score + " points");
        return score * 1000;
    }

    public static int calcFeetAndInchesToCentimeters(double feet, double inches) {


        // Create a method called calcFeetAndInchesToCentimeters
        // It needs to have two parameters.
        // feet is the first parameter, inches is the 2nd parameter
        //
        // You should validate that the first parameter feet is >= 0
        // You should validate that the 2nd parameter inches is >=0 and <=12
        // return -1 from the method if either of the above is not true
        //
        // If the parameters are valid, then calculate how many centimetres
        // comprise the feet and inches passed to this method and return
        // that value.
        //
        // Create a 2nd method of the same name but with only one parameter
        // inches is the parameter
        // validate that its >=0
        // return -1 if it is not true
        // But if its valid, then calculate how many feet are in the inches
        // and then here is the tricky part
        // call the other overloaded method passing the correct feet and inches
        // calculated so that it can calculate correctly.
        // hints: Use double for your number datatypes is probably a good idea
        // 1 inch = 2.54cm  and one foot = 12 inches
        // use the link I give you to confirm your code is calculating correctly.
        // Calling another overloaded method just requires you to use the
        // right number of parameters.

        if ((feet < 0) || (inches < 0 || inches > 12)) {
            return -1;
        }
        double centimeters = (feet / 12);
        return -1;

    }

    public static int calcFeetAndInchesToCentimeters(double inches) {

        return -1;
    }

    public static String getDurationString(double minutes, double seconds) {

        if ((minutes >= 0) && (seconds >= 59)) {

            int hours = (int) minutes / 60;
            int minutesLeft = (int) minutes % 60;
//            int secondsLeft = (int)
        }
        return "Invalid value";
    }


}
