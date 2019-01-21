package com.codz;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] array = new int[]{1,2,3,4,5};


        System.out.println("Normal arrray = " + Arrays.toString(array));
        System.out.print("Reversed array = "); reverse(array);


    }

    private static void reverse(int[] array){
        int maxIndex = (array.length-1);
        int temp;
        for (int i=0; i<array.length/2; i++){
            temp = array[i];
            array[i] = array[maxIndex];
            array[maxIndex] = temp;
            maxIndex--;
        }
        System.out.print(Arrays.toString(array));
    }
}
