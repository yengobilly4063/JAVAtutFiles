package com.codz;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(9, 30));


    }

    public static int getGreatestCommonDivisor(int first, int second){
        if ( (first < 10) || (second < 10) ){
            return -1;
        }
        int findDivisors = 0;
        int result = 0;

        List<Integer> divFirstValue = new ArrayList<Integer>();
        List<Integer> divSecondValue = new ArrayList<Integer>();

        //Collect divisors of first
        for (int i=1; i<=first; i++){
            findDivisors = first%i;
            if ( findDivisors == 0){
                divFirstValue.add(i);
            }
        }

        //Collect divisors of first
        for (int i=1; i<=second; i++){
            findDivisors = second % i;
            if ( findDivisors == 0){
                divSecondValue.add(i);
            }
        }

        //Compair Divsiors of First and Second Value
        for ( int x : divFirstValue ){
            for ( int y : divSecondValue ){
                if ( x == y ){
                    result = x;
                }
            }
        }
//        System.out.println(divFirstValue);
//        System.out.println(divSecondValue);

        return result;
    }

}
