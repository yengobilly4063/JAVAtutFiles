package com.codz;

public class Main {

    public static void main(String[] args) {

        System.out.println(isLeapYear(2000));

    }

    public static boolean isLeapYear(int year){
        boolean leapYear = false;
        if ((year >= 1) && (year <= 9999)){
            if (((year % 4 == 0) && ((year % 100) != 0 )) || (year % 400 == 0)) {
                leapYear = true;
            }else{
                leapYear = false;
            }
        }
        return leapYear;
    }
}
