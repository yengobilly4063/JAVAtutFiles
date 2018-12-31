package com.codz;

public class Main {
    private static String INVALID_INPUT_MESSAGE = "Invalid input entered";

    public static void main(String[] args) {
        System.out.println("==IF==");
        getDaysInMonth_withIF(1, 2020);
        getDaysInMonth_withIF(2, 2018);
        getDaysInMonth_withIF(2, 2018);
        getDaysInMonth_withIF(-1, 2020);
        getDaysInMonth_withIF(1, -2020);
        System.out.println("\n==SWITCH==");
        getDaysInMonth_withSWITCH(1, 2020);
        getDaysInMonth_withSWITCH(2, 2020);
        getDaysInMonth_withSWITCH(2, 2018);
        getDaysInMonth_withSWITCH(-1, 2020);
        getDaysInMonth_withSWITCH(1, -2020);

//        System.out.println(getDaysInMonth(1, -2020));
    }


    public static boolean isYearLeap(int year){
        boolean result = false;
        if ((year >= 1) && (year <= 9999)){
            if (((year % 4 == 0) && ((year % 100) != 0 )) || (year % 400 == 0)) {
                result = true;
            }else{
                result = false;
            }
        }
        return result;

    }

    public static int getDaysInMonth_withIF(int month, int year){
        if (month < 1 || month > 12 || year < 1 || year > 9999){
            System.out.println(INVALID_INPUT_MESSAGE);
            return -1;
        }else{
            if ( (month == 2) ){
                if (isYearLeap(year)){
                    System.out.println("28 days and " + year + " is a leap year");
                }else{
                    System.out.println("29 days");
                }

            }else if ( (month == 4) || (month == 6) || (month == 9) || (month == 11) ){
                System.out.println("30 days");
            }else{
                System.out.println("31 days");
            }
            return 1;
        }
    }

    public static int getDaysInMonth_withSWITCH(int month, int year){
        if (month < 1 || month > 12 || year < 1 || year > 9999){
            System.out.println(INVALID_INPUT_MESSAGE);
            return -1;
        }else{
            switch (month){
                case 2:
                    if (isYearLeap(year)){
                        System.out.println("28 days since " + year + " is a leap year");
                    }else{
                        System.out.println("29 days");
                    }
                    break;
                case 4: case 6: case 9: case 11:
                    System.out.println("31 days");
                    break;
                default:
                    System.out.println("31 days");
                    break;
            }
            return 1;
        }

    }
}
