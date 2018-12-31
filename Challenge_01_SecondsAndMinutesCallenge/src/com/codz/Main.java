package com.codz;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(61, 0));
        System.out.println(getDurationString(3661));
        System.out.println(getDurationString(3945));


    }


    private static String getDurationString(int minutes, int seconds){
        if ( (minutes < 0) || ((seconds < 0) || (seconds > 59)) ){
            return INVALID_VALUE_MESSAGE;
        }
        int allSeconds = ( (minutes * 60) + seconds );
        int xx = ( allSeconds / 3600 );
        int yy = ( allSeconds % 3600 ) / (60);
        int zz = (( allSeconds % 3600 )%60);

        String hoursString = xx + "h";  //Appending a string to an int converts the int to a STring value
        if (xx < 10){
            hoursString = "0" + hoursString;
        }
        String minsString = yy + "mins";  //Appending a string to an int converts the int to a STring value
        if (yy < 10){
            minsString = "0" + minsString;
        }
        String secsString = zz + "";  //Appending a string to an int converts the int to a STring value
        if (zz < 10){
            secsString = "0" + secsString;
        }

        return ("Total seconds = " + allSeconds + " :: " + hoursString + ", " + minsString + ", " + secsString + "");
    }

    private static String getDurationString( int seconds){
        if ( seconds <  0 ){
            return INVALID_VALUE_MESSAGE;
        }
        int xMins = (seconds / 60);
        int ySecs = (seconds % 60);

        return getDurationString(xMins, ySecs);
//        return "Total seconds = " + seconds + " :: " + xMins + "mins " + ySecs + "secs";
    }

//    private static void addZero(int inputValue){
//        String inputValueString = inputValue + "";
//        if (inputValue < 10){
//            inputValueString = "0" + inputValueString;
//        }
//    }
}
