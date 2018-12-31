package com.codz;

public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of all the digits in '5258' is " + sumDigits(5258));




    }



    private static int sumDigits(int number){
        int sum = 0;
        if (number < 10){
            return -1;
        }
        while (number > 0){
            sum += number%10;
            number = number/10;

//            if ( number<10 ){
//                sum += number;
//                return sum;
//            }

        }
        return sum;
    }
}
