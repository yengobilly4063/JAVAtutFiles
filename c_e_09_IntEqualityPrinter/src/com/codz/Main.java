package com.codz;

public class Main {

    private static String INVALID_VALUE_MESSAGE = "Invalid value";
    private static String EQUAL_NUMBERS = "All numbers are Equal";
    private static String DIFFERENT_NUMBERS = "All numbers are Different";
    private static String TWO_NUMBERS_SAME = "Two of the numbers are same";


    public static void main(String[] args) {

        printEqual(1, -1, 2);
        printEqual(1, 2, 2);
        printEqual(1, 3, 2);
        printEqual(2, 2, 2);

    }

    private static void printEqual ( int a, int b, int c){
        if ( ( a < 0) || ( b < 0) || ( c < 0 )){
            System.out.println(INVALID_VALUE_MESSAGE);
        }else if ( (a == b ) && ( b == c) ){
            System.out.println(EQUAL_NUMBERS);
        }else if ( (a != b) && ( b != c) && (a != c) ) {
            System.out.println(DIFFERENT_NUMBERS);
        }else {
            System.out.println(TWO_NUMBERS_SAME);
        }

    }
}
