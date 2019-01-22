package com.codz;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue + "\n");

        int [] myIntArray = new int[5];
        int [] anotherIntArray = myIntArray;

        System.out.println("MyIntArray = " + Arrays.toString(myIntArray));
        System.out.println("AnotherIntArray = " + Arrays.toString(anotherIntArray));

        anotherIntArray[0] = 1;
        System.out.println("after change MyIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change AnotherIntArray = " + Arrays.toString(anotherIntArray));

        anotherIntArray = new int[]{4,5,6,7,8};
        modifyArray(myIntArray);
        System.out.println("after modify MyIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after modify AnotherIntArray = " + Arrays.toString(anotherIntArray));

    }


    private static void modifyArray(int[] array){
        array[0] = 2;
        array = new int[] { 1,2, 3,4, 5};
    }
}
