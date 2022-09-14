package com.hemenace;

public class Main {

    public static void main(String[] args) {
        // animal factory
        AnimalFactory animalFactory = new AnimalFactory();

        // produce a cow and speak
        Animal cow = animalFactory.getAnimal("Cow");
        cow.speak();

        // produce a dog and speak
        Animal dog = animalFactory.getAnimal("Dog");
        dog.speak();

        // produce a cat and speak
        Animal cat = animalFactory.getAnimal("Cat");
        cat.speak();
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
