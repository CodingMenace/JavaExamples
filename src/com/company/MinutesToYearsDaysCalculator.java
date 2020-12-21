package com.company;

public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        }

        int hours = (int) minutes / 60;
        int days = hours / 24;
        int years ;
//        int remainingMinutes = (int) minutes % 525600;

        if (minutes > 525600){
            years = (int) minutes / 525600;
            int remainingMinutesAfterYears = (int) minutes % 525600;
            if (remainingMinutesAfterYears == 0){
                System.out.println(minutes + " min = " + years +" y and " + days + " d");
            } else if (remainingMinutesAfterYears >= 1440){
                days =  remainingMinutesAfterYears / 1440;
                int remainingMinutesAfterDays = remainingMinutesAfterYears % 1440;
            if (remainingMinutesAfterDays == 0){
                System.out.println(minutes + " min = " + years +" y and " + days + " d");
                }
            } else {
                System.out.println(minutes + " min = " + years +" y and " + days + " d");
            }
        }
    }


//            else {
//                System.out.println(minutes + " min = " + years +" y and " + days + " d");
////                if (remainingMinutesAfterDays >= 60){
////                    hours = remainingMinutesAfterDays / 60;
////                    int remainingMinutesAfterHours = remainingMinutesAfterDays % 60;
//                }



//            if(remainingMinutes > 1440){
//                days = days +  (remainingMinutes / 1440);
//                remainingMinutes = remainingMinutes % 1440;
//                if (remainingMinutes > 60){
//                    hours = hours + (remainingMinutes / 60);
//
//                    System.out.println(minutes + " min = " + years +" y and " + days + " d");
//                }
//            }
//        if (minutes >= 1440){
//            days = days + (int) (minutes / 1440);
//            int remainingMinutes = (int) minutes % 1440;
//            if (remainingMinutes > 60){
//                hours = hours + (remainingMinutes / 60);
//                System.out.println(minutes + " min = " + years +" y and " + days + " d");
//            }
//        }



}
