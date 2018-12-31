package com.codz;

public class Main {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(123456));

    }


    public static int getEvenDigitSum(int number){

        int sumofEven = 0;
        int lastNumber = 0;
        if ( number < 0 ) {
            return -1;
        }else {
            while ( number != 0){
                lastNumber = number%10;
                number /= 10;
                System.out.println("last digit = " + lastNumber);
                System.out.println("new number = " + number + " \n");
                if ( lastNumber % 2 == 0){
                    sumofEven += lastNumber;
                }
            }
            return sumofEven;
        }

    }
}
