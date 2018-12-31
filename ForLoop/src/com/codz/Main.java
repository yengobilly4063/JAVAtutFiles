package com.codz;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
//        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
//        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
//        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));

        for (int i = 2; (i<9); i++){
//            System.out.println("Loop " + i + " hello");
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, (double)i)));
        }
        System.out.println("Challenge");
        //Challenge
        for (int i = 8; (i>1); i--){
//            System.out.println("Loop " + i + " hello");
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, (double)i)));
        }

        System.out.println("Challenge 02");
//        System.out.println(isPrime(27));
//        System.out.println(isPrime(3));
//        isPrimeCount(4, 50);
        int count = 0;
        for (int i = 10; i<=50; i++){
            if (isPrime(i)) {
                System.out.println(i);
                count++;
                if (count == 3){
                    System.out.println("exit ...");
                    break;
                }
            }

        }



    }

    public static void isPrimeCount(int x, int y){
        int count = 0;
        List primeNumbers = new ArrayList();
        for (int i = x; i <= y; i++){
            if (isPrime(i)){
                System.out.println("Prime number = " + i);
                primeNumbers.add(i);
                count ++;
//                System.out.println("Counter = " + count + "\n");
                if (count >= 3){
                    System.out.println("At least Three(3) prime number were found and they were");
                    System.out.println(primeNumbers);
                    break;
                }
            }
        }
        if(count < 3){
            System.out.println("Range provided has less than 3 prime numbers");
            System.out.println(primeNumbers);
        }
//        System.out.println(count);
    }

    public static boolean isPrime(int n){
        boolean result = false;
        if ( n == 1){
            return false;
        }
        for ( int i = 2; i <= n/2; i++){
            if ( n% i == 0){
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }
}
