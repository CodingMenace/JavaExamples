package com.company;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean isCurrentlyBarking, int hourOfTheDay){
        if (hourOfTheDay < 0|| hourOfTheDay > 24){
            return false;
        }
        return isCurrentlyBarking && (hourOfTheDay < 8 || hourOfTheDay > 22);
    }
}
