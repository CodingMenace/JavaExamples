package com.hemenace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Result {

    public static void main(String[] args) {
        fizzBuzz(15);
    }
    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {
        //declare new list
        //add numbers to list from 1 to n
        List<Integer> numbers = new ArrayList<>(List.of());


        for (int i= 1; n == i; i++) {
            numbers.add(i);

            //figure out how to add n - num to array maybe ArrayList or just List reg Array doesn't work.

            // For Each Loop for iterating ArrayList
            for (Integer num : numbers)

                // Printing the elements of ArrayList
                System.out.print(num + " ");
        }

    }

}
