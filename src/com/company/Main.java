package com.company;

public class Main {

    public static void main(String[] args) {


        // instantiate three student objects
        Student student1 = new Student("Harry", "Potter", "Flying");
        Student student2 = new Student("Ron", "Weasley", "Herbology");
        Student student3 = new Student("Hermione", "Granger", "Potions");

        System.out.println(student1.getFirstName() + " " + student1.getLastName() + " is studying " + student1.getCourseFocus());
        System.out.println(student2.getFirstName() + " " + student2.getLastName() + " is studying " + student2.getCourseFocus());
        System.out.println(student3.getFirstName() + " " + student3.getLastName() + " is studying " + student3.getCourseFocus());

        // print the student names and initials
        System.out.println(student1.getFirstName() + " " + student1.getLastName() + ": " + student1.getInitials());
        System.out.println(student2.getFirstName() + " " + student2.getLastName() + ": " + student2.getInitials());
        System.out.println(student3.getFirstName() + " " + student3.getLastName() + ": " + student3.getInitials());





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
