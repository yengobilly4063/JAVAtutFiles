package com.codz;

public class Main {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(1.09234, 1.09234));


    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){
        boolean result = false;

        if (((int)(firstNumber * 1000)) == ((int)(secondNumber * 1000))){
            result = true;
        }
        return result;
    }
}
