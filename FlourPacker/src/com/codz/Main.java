package com.codz;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(1,0,5));

    }



    public static boolean canPack(int bigCount, int smallCount, int goal){
        boolean result = false;
        int sum = bigCount + smallCount;
        if ( (bigCount<0) || (smallCount<=0) ){
            return result;
        }
        if ( ((bigCount*5) + (smallCount)) >= goal || ( (bigCount*5)==(goal)) ){
            result = true;
        }



        return result;
    }
}
