package com.codz;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        int sum = 0;
        List results = new ArrayList ();
        for (int i=1; i<=1000; i++){
            if ( (i%3==0) && (i%5==0) ){
                results.add(i);
                sum+=i;
                count++;
                if (count == 5){
                    break;
                }
            }
        }
        System.out.println("The numbers divisible by both 3 and 5 are \n" + results);
        System.out.println("Count = " + count);
        System.out.println("Sum = " + sum);
    }
}
