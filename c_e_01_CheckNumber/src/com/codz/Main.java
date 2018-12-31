package com.codz;

public class Main {

    public static void main(String[] args) {
        checkNumber(1);
    }

    public static void checkNumber(int number){
        if (number > 0){
            System.out.println(number + " is a POSITIVE number !");
            System.out.println("positive");
        }else if (number < 0){
            System.out.println(number + " is a NEGATIVE number");
            System.out.println("negative");
        }else {
            System.out.println("zero");
        }

    }
}
