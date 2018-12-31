package com.codz;

public class Main {

    public static void main(String[] args) {

        System.out.println(isCatPlaying(true, 35));
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 35));
        System.out.println(isCatPlaying(false, 36));

    }

    private static boolean isCatPlaying(boolean summer, int temperature){
        boolean status = false;
        if ( (summer) && ( (temperature >=25) && (temperature <= 45) )){
            status = true;
        }else if ( (!summer ) && ((temperature >=25) && (temperature <= 35)) ) {
            status = true;
        }
        return status;
    }
}
