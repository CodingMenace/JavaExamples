package com.company;

public class StudentCode {

    public static String greetMe(String name){

        return "Hello " + name;
    }

    public int[] doubleArray(int[] numbers){


        int result = 0;
        if (numbers.length == 0){
            return new int[]{0};
        } else {
            for (int number : numbers) {
                result += number * 2;
                return new int[]{result};
            }
        }


        return new int[]{result};
    }




}
