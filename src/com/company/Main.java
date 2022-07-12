package com.company;

public class Main {

    public static void main(String[] args) {

        //  calcFeetAndInchesToCentimeters(50);

        Car porsche = new Car();
        Car holden = new Car();





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

            double centimeters = (feet * 12) * 2.54;
            System.out.println(feet + " feet " + inches + " inches = " + centimeters + " cm");
            return (inches * 2.54) + ((feet * 12) * 2.54);


        } else return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches > 0) {
            double inchesToFeet = inches / 12;
            double remainingInches = inches % 12;
            return calcFeetAndInchesToCentimeters(inchesToFeet, remainingInches);
        } else return -1;
    }


}
