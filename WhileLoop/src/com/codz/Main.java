package com.codz;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        int count = 1;
//        while( count != 6){
//            System.out.println("Count is = " + count);
//            count++;
//        }
//
//        count = 1;
//        while (true){
//            if (count == 6){
//                break;
//            }
//            System.out.println("Count is = " + count);
//            count++;
//        }

//        int count = 6;
//        do{
//            System.out.println("Count value was " + count);
//            count++;
//            if (count>100){
//                break;
//            }
//        }while (count != 6);


//        int number = 4;
//        int finishNumebr = 20;
//
//        while (number <= finishNumebr){
//            number++;
//            if( !isEvenNumber(number) ){
//                continue;
//            }
//            System.out.println("Even number " + number);
//        }
        //CHALLENGE
        int number = 4;
        int finishNumebr = 20;
        int count = 0;
        List nums = new ArrayList ();


        while (number <= finishNumebr){
            number++;
            if( !isEvenNumber(number) ){
                continue;
            }

            System.out.println("Even number " + number);
            nums.add(number);
            count++;

            if ( count == 5 ){
                break;
            }
        }
        System.out.println("Total even numbers found = " + count);
        System.out.println(nums);


        int num = 0;
        while (num < 15){
            num++;

            if (num <= 5){
                System.out.println("Skipping num " + num);
                continue;
            }

            System.out.println("Number = " + num);

            if (num >= 10){
                System.out.println("Breaking at " + num);
                break;
            }
        }

    }




    //CHALLENGE
    private static boolean isEvenNumber(int number){
        boolean results = false;
        if (number <1){
            return results;
        }else{
            if ( (number%2)==0 ){
                results = true;
            }
        }
        return results;
    }

}
