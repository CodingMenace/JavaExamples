package com.company;

import java.io.IOException;

public class WhileAndDoWhile {

    public static void main(String[] args) {

        int count = 1;
        while (count != 6){
            System.out.println(count);
            count++;
        }

        for (count = 1; count != 6 ; count++) {
            System.out.println(count);
        }

    }

}
//Guess the letter
class Guess4 {
    public static void main(String[] args) throws IOException {

        char ch, ignore, answer = 'k';

        do {
            System.out.println("I'm thinking of a letter between A and Z.");
            System.out.println("Can you guess it?...");

            //read a character
            ch = (char) System.in.read();

            //discard any other characters in the input buffer
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (ch == answer)
                System.out.println("*** You Got it Right!!! ***");
            else {
                System.out.println("...Sorry you're ");
                if(ch < answer)
                    System.out.println("too low");
                else System.out.println("too high");
                System.out.println("Try Again! \n");
            }
        } while (answer != ch);
    }
}

//Using break to exit a loop
class BreakDemo{
    public static void main(String[] args) {

        int num = 100;

        //loop while i-square is less than num
        for (int i = 0; i < num; i++) {
            if (i * i >= num)
                break; //terminates loop if i*i = 100
            System.out.println(i + " ");
        }
        System.out.println("Loop complete!");
    }

}

//Read input until a 'q' is received
class Break2{

    public static void main(String[] args) throws IOException{

        char ch;
        for (; ; ) {
            ch = (char) System.in.read();
            if (ch == 'q')
                break;
        }
        System.out.println("Nice you pressed q!");
    }
}

//Using break with nested loops
class Break3{
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Outer loop count: " + i);
            System.out.println("        Inner loop count: ");

            int t = 0;

            while (t < 100){
                if ( t == 10) break; //terminates loop if t is 10
                System.out.println(t + " ");
                t++;
            }
            System.out.println();
        }
        System.out.println("Loops complete!");
    }
}

//Using break with a label
class  Break4{
    public static void main(String[] args) {

    }
}
