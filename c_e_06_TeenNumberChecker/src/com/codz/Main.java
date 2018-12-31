package com.codz;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasTeen(13, 11, 20));
    }

    public static boolean hasTeen(int age1, int age2, int age3){
        boolean result = false;
        if ( (age1 >=13 && age1 <= 19) || (age2 >=13 && age2 <= 19) || (age3 >=13 && age3 <= 19)){
            result = true;
        }
        return result;
    }
}
