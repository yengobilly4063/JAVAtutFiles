package com.codz;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit_edit(123 , 143));
//        System.out.println(12%10);

    }


    public static boolean hasSharedDigit(int numX, int numY){
    boolean result = false;
    if ( ((numX < 10) || (numX >99)) || ((numY < 10) || (numY >99)) ){
        return result;
    }
    int lastNumX = 0;
    int lastNumY = 0;

    while ( (numX > 9) || (numY > 9)){
        lastNumX = (numX % 10);
        numX /= 10;
        lastNumY = (numY % 10);
        numY /= 10;
        if ( (lastNumX == lastNumY) || (lastNumX == numY ) || (numX == lastNumY ) || (numX == numY ) ){
            result = true;
        }

    }
    return result;
}

    public static boolean hasSharedDigit_edit(int numX, int numY){
        boolean result = false;
        if ( (numX < 10) || (numY < 10) ){
            return result;
        }
        int lastNumX = 0;
        int lastNumY = 0;
        List<Integer> indexX = new ArrayList<Integer>();
        List<Integer> indexY = new ArrayList<Integer>();

        while ( (numX > 0) || (numY > 0)){
            lastNumX = (numX % 10);
            indexX.add(lastNumX);
            numX /= 10;
            lastNumY = (numY % 10);
            indexY.add(lastNumY);
            numY /= 10;
        }
        for ( int x : indexX){
            for ( int y : indexY){
                if (x == y){
                    result = true;
                }
            }
        }
        return result;
    }
}
