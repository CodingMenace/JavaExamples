package com.company;

public class SecondAndMinutesChallenge {

    public static void main(String[] args) {


        System.out.println(getDurationString(61, 0));
        System.out.println(getDurationString(3600));

    }

    public static String getDurationString(double minutes, double seconds) {

        int hours = (int) minutes / 60;
        int minutesLeftAfterHours = (int) minutes % 60;
        int secondsToMinutes = (int) seconds / 60;
        int secondsLeftAfterMinutes = (int) seconds % 60;

        if (minutes < 0 || seconds < 0) {
            return "Invalid Value";
        } else if (seconds >= 3600) {
            hours = hours + ((int) seconds / 3600);
            return hours + "h " + minutesLeftAfterHours + "m " + secondsLeftAfterMinutes + "s";
        } else if (seconds >= 60) {
            minutesLeftAfterHours = minutesLeftAfterHours + secondsToMinutes;
            return hours + "h " + minutesLeftAfterHours + "m " + secondsLeftAfterMinutes + "s";
        } else if ((minutes >= 0)) {
            return hours + "h " + minutesLeftAfterHours + "m " + secondsLeftAfterMinutes + "s";
        }
        return "Invalid value";
    }

    public static String getDurationString(double seconds) {

        if (seconds >= 0) {

            int secondsToMinutes = (int) seconds / 60;
            int secondsLeftAfterMinutes = (int) seconds % 60;

            if (secondsLeftAfterMinutes == 0 && secondsToMinutes <= 59) {
                return seconds + " seconds was divided evenly resulting in " + secondsToMinutes + " minute(s) and " + secondsLeftAfterMinutes + " seconds remaining";
            }
            if (secondsLeftAfterMinutes < 59 && secondsToMinutes <= 59) {

                return secondsToMinutes + " minutes and " + secondsLeftAfterMinutes + " seconds";
            }

            return getDurationString(secondsToMinutes, secondsLeftAfterMinutes);
        }

        return "Invalid";
    }

}
