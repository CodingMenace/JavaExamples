package com.company;

public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {

        printYearsAndDays(525600);

    }

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
        }


        int days = ((int) minutes / 60) / 24;
        int years = 0;

        if (minutes >= 525600) {
            years = (int) minutes / 525600;
            int remainingMinutesAfterYears = (int) minutes % 525600;
            if (remainingMinutesAfterYears == 0) {
                days = 0;
                System.out.println(minutes + " min = " + years + " y and " + days + " d");
            } else if (remainingMinutesAfterYears >= 1440) {
                days = remainingMinutesAfterYears / 1440;
                int remainingMinutesAfterDays = remainingMinutesAfterYears % 1440;
                System.out.println(minutes + " min = " + years + " y and " + days + " d");
                if (remainingMinutesAfterDays == 0) {
                    System.out.println(minutes + " min = " + years + " y and " + days + " d");
                }
            } else {
                System.out.println(minutes + " min = " + years + " y and " + days + " d");
            }
        }

        if (minutes < 525600 && minutes >= 0) {
            if (minutes > 1440) {
                System.out.println(minutes + " min = " + years + " y and " + days + " d");
            }
            if (minutes == 1440) {
                System.out.println(minutes + " min = " + years + " y and " + days + " d");
            }
            if (minutes < 1440) {
                days = 0;
                System.out.println(minutes + " min = " + years + " y and " + days + " d");
            }
        }
    }


}
