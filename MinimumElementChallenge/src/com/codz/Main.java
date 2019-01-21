package com.codz;

import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        int [] array = readIntegers();

        System.out.println("Min value is " + findMin(array));
        //LIZA//

    }

    private static int [] readIntegers(){
        System.out.print("How many numbers you wish to enter? ");
        int count = scan.nextInt();
        int [] array = new int[count];
        for (int i=0; i<array.length; i++){
            System.out.print("Enter #" + (i+1) + " : ");
            array[i] = scan.nextInt();
            scan.nextLine();
        }
        return array;
    }

    private static int findMin(int [] array){
        int min = array[0];
        for (int i=0; i<array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
