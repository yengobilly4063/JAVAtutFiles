package com.codz;

public class Main {
    private static String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        pringYearsAndDays(525600);
        pringYearsAndDays(527040);
        pringYearsAndDays(528480);
        pringYearsAndDays(561600);

    }

    private static void pringYearsAndDays(long minutes){
        if ( minutes < 0 ){
            System.out.println(INVALID_VALUE_MESSAGE);
        }
        long YY = ( minutes / 525600 );
        long ZZ = ((minutes % 525600) / (1440) );

        System.out.println(minutes + " min = " + YY + " y and " + ZZ +" d" );
    }
}
