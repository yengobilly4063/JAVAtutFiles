package com.codz;

public class Main {

    public static void main(String[] args) {
        boolean isNice;
        System.out.println(isNice);

    }

    public static void BarkingDog(boolean barking, int halfOfDay){
            if (halfOfDay >= 8 && halfOfDay <=22){
                barking = true;
            }else if (halfOfDay >= 0  && halfOfDay <= 23) {
                barking = false;
            }
            
    }
}
