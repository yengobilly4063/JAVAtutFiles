package com.codz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int min = 0;
//        int counter = 1;
        boolean first = true;

        while ( true ){
            System.out.print("Enter number : ");
            boolean isAnInt = scanner.hasNextInt();
            if ( isAnInt ){
                int number = scanner.nextInt();
//                if ( counter == 1){
                if ( first){
                    first = false;
                    min = number;
                    max = number;
                }
                if ( number > max ){
                    max = number;
                }else if ( number < min ){
                    min = number;
                }
//                counter ++;
            }else {
                System.out.println("closing app ... ");
                break;
            }

            scanner.nextLine();
        }
        System.out.println("\n==Results==");
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);

        scanner.close();
    }
}
