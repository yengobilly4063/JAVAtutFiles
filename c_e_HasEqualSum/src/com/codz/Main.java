package com.codz;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 3));

    }

    public static boolean hasEqualSum(int a, int b, int c){
        boolean result = false;
        if ((a + b) == ( c )){
            result = true;
        }
        return result;
    }
}
