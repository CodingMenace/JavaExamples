package com.company;

public class Switch {

    public static void main(String[] args) {

        int intValue = 3;

        switch (intValue){

            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Was a 3, 4 or 5");
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;

                /*
                Switch is only good to use if you are testing the same variable for different values
                So one variable with different results (and you know what those results might be)
                 */

        }

        char value;

        value = 'C';

        switch (value){

            case 'A':
                System.out.println("It's A");
                break;
            case 'B':
                System.out.println("It's B");
                break;
            case 'C': case 'D':
                System.out.println("It's C or D");
                break;
            default:
                System.out.println("It wasn't A-D");
                break;
        }

    }
}
