package com.company;

public class ForLoop {

    public static void main(String[] args) {


        for (int i = 2; i <= 8; i++) {
            System.out.printf("%.2f%n", calculateInterest(10000, i));
        }
//        for(init; termination ; increment){   }
//
//
//
//        //reversed//

        System.out.println("************************");
        for (int i = 8; i >= 2; i--) {

            System.out.printf("%.2f%n", calculateInterest(10000, i));
        }

        System.out.println("******************");

//        int count = 0;
//
//        for (int i = 5; i < 50 ; i++) {
//            if (isPrime(i)){
//                count++;
//                System.out.println("Number " + i + " is a prime number");
//                if (count == 3){
//                    System.out.println("We have " + count +" prime numbers");
//                    break;
//                }
//            }
//        }


        int count = 0;
        int sum = 0;

        for (int i = 1; i < 1000; i++) {

            if ((i % 3 == 0) && (i % 5 == 0)){
                sum+=i;
                count++;
                System.out.println(" Found one number " + i);

                if (count == 20){
                    System.out.println("Total sum of all numbers divisible by 3 & 5 == "+ sum);
                    break;
                }
            }
        }
    }




    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n){
        //i <= n/2
        if(n==1){
            return false;
        }
        for (int i = 2; i <= (long) Math.sqrt(n) ; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }


}
