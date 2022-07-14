package com.company;

public class StudentCode {

    public static String greetMe(String name){

        return "Hello " + name;
    }

    public double getAverage(double[] numbers){

        int numberOfNumbers = numbers.length;
        double average = 0.0;

        if (numbers.length == 0){
            return 0;
        } else {
            for (double number : numbers) {
                average += number;
            }
        }


        return average / numberOfNumbers;
    }

}
