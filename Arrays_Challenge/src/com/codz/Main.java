package com.codz;

import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


        int [] unsortedArray = getIntegers(5);

        System.out.println("Unsorted array is ");
        printArrays(unsortedArray);

        int [] sortedArray = sortArray(unsortedArray);


        System.out.println("Sorted array is ");
        printArrays(sortedArray);

    }



    public static void printArrays(int [] array){
        for ( int i=0; i<array.length; i++){
//            System.out.println("Element " + i + " value is " + array[i]);
            System.out.print(array[i] + " ");
        }
    }

    public static int[] getIntegers(int number){

        int [] values = new int[number];
        System.out.println("Enter " + number + " numbers\r");

        for ( int i=0; i<number; i++){
            values[i]  = scan.nextInt();
        }
        return values;
    }

    public static int[] sortArray(int[] array){
        int [] sorted = array;
        for (int i=0; i<sorted.length; i++){
            for (int j=i+1; j<sorted.length; j++){
                if (sorted[i] < sorted[j]){
                    int temp;
                    temp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }
        return sorted;
    }

}
