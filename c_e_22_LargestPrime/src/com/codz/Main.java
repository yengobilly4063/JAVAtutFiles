package com.codz;
//NOT FINISHED

public class Main {

    public static void main(String[] args) {
        System.out.println("Largest prime Factor is " + getLargestPrime(21));

    }


    public static int getLargestPrime(int  number){

        int largestPrimeFactor = 0;

        if (number < 2){
            return -1;
        }
        for (int i = 2; i<number; i++){
            if ( number%i == 0){
                number /= i;
                if ( number == 1 ){
                    largestPrimeFactor = i;
                }else{
                    i++;
                }
            }
        }
        return largestPrimeFactor;
    }
}
