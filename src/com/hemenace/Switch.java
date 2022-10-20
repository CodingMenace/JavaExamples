package com.hemenace;

public class Switch {

    public static void main(String[] args) {

        int intValue = 3;
        printDayOfTheWeek(intValue);

        switch (intValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> System.out.println("Was a 3, 4 or 5");
            default -> System.out.println("Was not 1 or 2");

                /*
                Switch is only good to use if you are testing the same variable for different values
                So one variable with different results (and you know what those results might be)
                 */

        }

        char value;

        value = 'C';

        switch (value) {
            case 'A' -> System.out.println("It's A");
            case 'B' -> System.out.println("It's B");
            case 'C', 'D' -> System.out.println("It's C or D");
            default -> System.out.println("It wasn't A-D");
        }

    }

    public static void printDayOfTheWeek(int day) {

        switch (day) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Invalid Day");
        }

//        if (day == 1) {
//            System.out.println("Sunday");
//        } else if (day == 2) {
//            System.out.println("Monday");
//        } else if (day == 3) {
//            System.out.println("Tuesday");
//        } else if (day == 4) {
//            System.out.println("Wednesday");
//        } else if (day == 5) {
//            System.out.println("Thursday");
//        } else if (day == 6) {
//            System.out.println("Friday");
//        } else if (day == 7) {
//            System.out.println("Saturday");
//        } else {
//            System.out.println("Invalid Day");
//        }
    }
}