package com.codz;

public class Main {

    public static void main(String[] args) {

//        System.out.println(1234%10);

//        System.out.println(isPalindrome(3231));
//        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
//        System.out.println((0-1)<0);
        System.out.println(isPalindrome1(-121));
        System.out.println(0*10);

//        System.out.println(0-2);

    }


    private static boolean isPalindrome(int number){
        if (number < 0){
            number = -(number);
        }
        boolean result = false;
        int numberOrigin = number;
        int lastDigit1 = number%10;
        int lastDigit2;
        int reverse = lastDigit1;
        number /= 10;


        while (number < 0){
            lastDigit2 = number%10;
            number /= 10;
            reverse = (lastDigit1*10) + lastDigit2;
            lastDigit1 = reverse;
        }
        if (numberOrigin == reverse){
            result = true;
        }

        return result;
    }

    public static boolean isPalindrome1(int number){

        int compareNumber = number;
        int lastDigit = 0;
        int reversed = 0;

        while (number != 0){
            lastDigit = number%10;

            reversed = (reversed*10) + lastDigit;

            number /= 10;

            if(compareNumber == reversed){
                return true;
            }

        }
        return false;

    }
}
