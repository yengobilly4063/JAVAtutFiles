package com.codz;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(1));

    }


    public static int sumFirstAndLastDigit(int number){
        int sumOfFirstAndLast = 0;
        if (number < 0 ){
            return -1;
        }
        int lastNumber = ( number%10 );
        int firstNumber = 0;
        if (number < 10){
            sumOfFirstAndLast = number *2;
        }else{
            while ( number != 0){
                number /= 10;
                if (number/10 == 0 ){
                    firstNumber = number%10;
                    break;
                }
            }
           sumOfFirstAndLast = ( lastNumber + firstNumber);
        }
        return sumOfFirstAndLast;
    }
}
