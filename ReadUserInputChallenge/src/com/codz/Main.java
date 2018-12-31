package com.codz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int counter = 0;
            int sum = 0;

            while ( true ){
                int order = counter + 1;
                System.out.print("Enter number #" + order + ": ");

                boolean isAnInt = scanner.hasNextInt();

                if ( isAnInt ){
                    int number = scanner.nextInt();
                    counter++;
                    sum += number;
                    if ( counter == 10 ){
                        break;
                    }
                }else {
                    System.out.println("Invalid Number");
                }
                scanner.nextLine(); //Handle end of line enter key
            }

        System.out.println("The sum = " + sum);

            scanner.close();

    }


//    public static int getUserInput( int count ){
//
//        int number = 0;
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter number #" + count + ": ");
//
//        int tempNumber = scanner.nextInt();
//
//        boolean hasNextInt = scanner.hasNextInt();
//
//        scanner.close();
//
//        if ( hasNextInt ){
//            number = tempNumber;
//            return number;
//        }else {
//            System.out.println("Invalid Number");
//            getUserInput(count);
//        }
//        return number;
//    }
}
