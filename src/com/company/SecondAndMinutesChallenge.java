package com.company;

public class SecondAndMinutesChallenge {

    public static void main(String[] args) {


        System.out.println(getDurationString(61, 0));
        System.out.println(getDurationString(3945));

    }

    private static String getDurationString(long seconds) {
        if(seconds < 0){
            return "Invalid Value";
        }
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes,remainingSeconds);
    }


    private static String getDurationString(long minutes, long seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59) ){
            return  "Invalid Value";
        }
            long hours = minutes / 60;
            long remainingMinutes = minutes % 60;
            String hoursString = hours + "h";
            if (hours < 10){
                hoursString = "0" + hoursString;
            }
            String minutesString = remainingMinutes + "m";
            if (remainingMinutes < 10){
                minutesString = "0" + minutesString;
            }
        String secondsString = seconds + "s";
        if (seconds< 10){
            secondsString = "0" + secondsString;
        }


            return hoursString + " " +  minutesString + " " +  secondsString ;
    }

    
    
    
//
//    public static String getDurationString(double minutes, double seconds) {
//
//        int hours = (int) minutes / 60;
//        int minutesLeftAfterHours = (int) minutes % 60;
//        int secondsToMinutes = (int) seconds / 60;
//        int secondsLeftAfterMinutes = (int) seconds % 60;
//
//        if (minutes < 0 || seconds < 59) {
//            return "Invalid Value";
//        } else if (seconds >= 3600) {
//            hours = hours + ((int) seconds / 3600);
//            return hours + "h " + minutesLeftAfterHours + "m " + secondsLeftAfterMinutes + "s";
//        } else if (seconds >= 60) {
//            minutesLeftAfterHours = minutesLeftAfterHours + secondsToMinutes;
//            return hours + "h " + minutesLeftAfterHours + "m " + secondsLeftAfterMinutes + "s";
//        } else if ((minutes >= 0)) {
//            return hours + "h " + minutesLeftAfterHours + "m " + secondsLeftAfterMinutes + "s";
//        }
//        return "Invalid value";
//    }
//
//    public static String getDurationString(double seconds) {
//
//        if (seconds >= 0) {
//
//            int secondsToMinutes = (int) seconds / 60;
//            int secondsLeftAfterMinutes = (int) seconds % 60;
//
//            if (secondsLeftAfterMinutes == 0 && secondsToMinutes <= 59) {
//                return seconds + " seconds was divided evenly resulting in " + secondsToMinutes + " minute(s) and " + secondsLeftAfterMinutes + " seconds remaining";
//            }
//            if (secondsLeftAfterMinutes < 59 && secondsToMinutes <= 59) {
//
//                return secondsToMinutes + " minutes and " + secondsLeftAfterMinutes + " seconds";
//            }
//
//            return getDurationString(secondsToMinutes, secondsLeftAfterMinutes);
//        }
//
//        return "Invalid";
//    }

}
