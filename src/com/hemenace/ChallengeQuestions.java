package com.hemenace;

public class ChallengeQuestions {


    public static void main(String[] args) {

        System.out.println(DigitSum(355));
    }


    public static void printDayOfTheWeek(int day) {

        switch (day) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Saturday");
            default -> System.out.println("Invalid day");
        }
    }

    public static void printDayOfTheWeekIfElse(int day) {

        if (day == 1) {
            System.out.println("Sunday");
        } else if (day == 2) {
            System.out.println("Monday");
        } else if (day == 3) {
            System.out.println("Tuesday");
        } else if (day == 4) {
            System.out.println("Wednesday");
        } else if (day == 5) {
            System.out.println("Thursday");
        } else if (day == 6) {
            System.out.println("Friday");
        } else if (day == 7) {
            System.out.println("Saturday");
        } else
            System.out.println("Invalid Day");

    }

    public static int DigitSum(int num) {
        int sum = 0;
        int digit;
        if (num >= 10) {

            while (num > 0) {
                digit = num % 10;
                sum += digit;
                num /= 10;
            }
        }


        return sum;
    }

}
