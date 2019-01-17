package com.codz;

import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int [] myIntegers = getIntegers(5);

        for (int i = 0; i<myIntegers.length; i++){
            System.out.println("Element " + i + " value is " + myIntegers[i]);
        }

        System.out.println("The average of values is " + getAverage(myIntegers));
    }

    public static int[] getIntegers( int number ){
        System.out.println("Enter " + number + " integer values.\r");
        int [] values = new int[number];

        for (int i = 0; i<values.length; i++){
            values[i] = scan.nextInt();
        }
        return values;
    }

    public static double getAverage( int [] array ){
        int sum = 0 ;
        for ( int i=0; i<array.length; i++ ){
            sum += array[i];
        }

        return ( (double)sum / (double)array.length );
    }
}
