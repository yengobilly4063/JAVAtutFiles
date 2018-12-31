package com.codz;

public class Main {

    public static void main(String[] args) {
        System.out.println(isOdd(3));
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
        System.out.println(sumOdd(10, 5));

    }

    private static boolean isOdd(int number){
        boolean results = true;
        if (number <=0){
            results = false;
        }else{
            if ( (number % 2) == 0){
                results = false;
            }else{
                results = true;
            }
        }
        return results;
    }

    private static int sumOdd(int start, int end){
        int sum = 0;
        if ( (start <= 0) || (end < start) ){
            return -1;
        }else{
            for (int i=start; i<=end; i++){
                if ( isOdd(i) ){
                    sum += i;
                }
            }
            return sum;
        }
    }
}
