package com.hemenace;

public class TeenNumberChecker {

    public static boolean hasTeen(int a, int b, int c){
        int d = 13;
        int e = 19;

        return (((a >= d) && (a <= e)) || ((b >= d) && (b <= e)) || ((c >= d) && (c <= e)) );

    }

    public static boolean isTeen (int a){
        int d = 13;
        int e = 19;


        return ((a >= d) && (a <= e));
    }
}
