package com.codz;

public class Main {
    private static String INVALID_VALUE_MESSAGE = "Invalid day";
    public static void main(String[] args) {

        printDayOfTheWeek(1);

    }o

    private static void printDayOfTheWeek( int day){
//        if ( day <0 || day > 6){
//            System.out.println(INVALID_VALUE_MESSAGE);
//        }
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println(INVALID_VALUE_MESSAGE);

        }
    }
}
