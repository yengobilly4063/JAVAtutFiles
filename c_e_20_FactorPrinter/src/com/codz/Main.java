package com.codz;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        printFactors(32);

    }


    public static void printFactors(int number){
        if (number < 0){
            System.out.println("Invalid Value");
        }

        List<Integer> factorCollector = new ArrayList<Integer>();

        for (int i = 1; i <= number; i++ ){
            if ( ( number % i ) == 0){
                factorCollector.add(i);
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        System.out.println("List colection of Factors of " + number + " are : \n\t->" + factorCollector);
    }


}
