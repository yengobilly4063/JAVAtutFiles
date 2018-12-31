package com.codz;

public class Main {

    public static void main(String[] args) {

//        int value = 0;
//        if (value == 1){
//            System.out.println("Value was 1");
//        }else if ( value == 2){
//            System.out.println("Value was 2");
//        }else{
//            System.out.println("Value was neither 1 nor 2");
//        }

//        int switchValue = 3;
//
//        switch ( switchValue ){
//            case 1:         //if statement
//                System.out.println("Value is 1");
//                break;
//            case 2:         //else if statement
//                System.out.println("Value was 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("Was a 3 or 4 or 5");
//                System.out.println("Actually it was a " + switchValue);
//                break;
//            default:        //else statement
//                System.out.println("Value was neither 1, 2, 3, 4, nor 5");
//                break;
//        }
        //More code here

        //Challenge
        char singleLetter = 'D'; //could be from A, B, C, D or E

        switch ( singleLetter ) {
            case 'A':
                System.out.println("Letter found is " + singleLetter);
                break;
            case 'B':
                System.out.println("Letter found is " + singleLetter);
                break;
            case 'C': case 'D': case 'E':
                System.out.println("Letter found is " + singleLetter);
                break;
            default:
                System.out.println(singleLetter + " not found !!");
        }

        System.out.println("");

        String month = "jAnuary";

        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "October":
                System.out.println("Oct");
                break;
            default:
                System.out.println("Not sure");
        }

    }
}
