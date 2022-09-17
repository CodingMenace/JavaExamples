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

    static class GreatestCommonDivisor {

        public static void main(String[] args) {
          int x =  getGreatestCommonDivisor(25,15);
            System.out.println(x);
        }

        // write your code here
//
//      Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
//      If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
//      The method should return the greatest common divisor of the two numbers (int).
//      The greatest common divisor is the largest positive integer that can fully
//      divide each of the integers (i.e. without leaving a remainder).
//      For example 12 and 30:
//      12 can be divided by 1, 2, 3, 4, 6, 12
//      30 can be divided by 1, 2, 3, 5, 6, 10, 15, 30
//      The greatest common divisor is 6 since both 12 and 30 can be divided by 6, and there is no resulting remainder.
//
//      EXAMPLE INPUT/OUTPUT:
//      * getGreatestCommonDivisor(25, 15); should return 5 since both can be divided by 5 without a remainder
//      * getGreatestCommonDivisor(12, 30); should return 6 since both can be divided by 6 without a remainder
//      * getGreatestCommonDivisor(9, 18); should return -1 since the first parameter is < 10
//      * getGreatestCommonDivisor(81, 153); should return 9 since both can be divided by 9 without a remainder
//       HINT: Use a while or a for loop and check if both numbers can be divided without a remainder.
//       HINT: Find the minimum of the two numbers.
//       NOTE: The method getGreatestCommonDivisor should be defined as public static
//       like we have been doing so far in the course.
//       NOTE: Do not add a main method to the solution code.
        public static int getGreatestCommonDivisor(int first, int second) {
            if (first < 10 || second < 10)
                return -1;

            int divisor = 0;
            int number = Math.max(first, second);

            for (int i = 1; i < number; i++) {
                if(first % i == 0 && second % i == 0){
                    divisor = i;
                }
            }

           return divisor;

        }

    }

}
