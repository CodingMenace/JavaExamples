package com.hemenace;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        a = a * 1000;
        b = b * 1000;

        int a1 = (int) a;
        int b1 = (int) b;

        return a1 == b1;
    }
}
