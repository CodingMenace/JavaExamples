package com.company;

public class BarkingDog {
    
    public static boolean shouldWakeUp(boolean isCurrentlyBarking, int hourOfTheDay){

        if (isCurrentlyBarking && (hourOfTheDay < 8 || hourOfTheDay > 22)){
            return true;
        } else  if (hourOfTheDay < 0 ||hourOfTheDay >23 ){
            return false;
        }
        return false;
    }
}
