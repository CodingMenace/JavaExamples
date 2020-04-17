package com.company;

public class ConditionalLogic {

    public static void main(String[] args) {

        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("It is not an Alien!");
            // == comparison not assignment
        }

        int topScore = 10;
        if (topScore == 100) {
            System.out.println("You got the high score!");

        }
        int secondTopScore = 85;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both conditions true");
        }
        int newValue = 50;
        boolean isCar = false;
        if (!isCar) {
            System.out.println("this is not supposed to happen but it will");
        }

        boolean wasCar = isCar;

        //variable = Expression1 ? Expression2: Expression3

        /*
        if(Expression1)
        {
        variable = Expression2;
        }
        else
        {
        variable = Expression3;
        }
        public class Test {

        public static void main(String args[]) {
        int a, b;
        a = 10;
        b = (a == 1) ? 20: 30;
        System.out.println( "Value of b is : " +  b );

        b = (a == 10) ? 20: 30;

        System.out.println( "Value of b is : " + b );
        Value of b is : 30
        Value of b is : 20
   }
}
        class Ternary {
    public static void main(String[] args)
    {

        // variable declaration
        int n1 = 5, n2 = 10, max;

        System.out.println("First num: " + n1);
        System.out.println("Second num: " + n2);

        // Largest among n1 and n2
        max = (n1 > n2) ? n1 : n2;

        // Print the largest number
        System.out.println("Maximum is = " + max);
    }
}


         */
        double firstDouble = 20.00d;
        double secondDouble = 80.00d;
        double addThenMultiply = (firstDouble + secondDouble) * 100.00d;
        double remainder = addThenMultiply % 40.00d;
        boolean notZero = remainder == 0;
        System.out.println("The result is " + notZero);
        if (!notZero) {
            System.out.println("Got some remainder");
        }


    }
}
