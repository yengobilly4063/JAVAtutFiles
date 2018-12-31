package com.codz;

public class Main {
    public static String INVALID_VALUE = "Invalid Value";

    public static void main(String[] args) {

        numberToWords(100100);

    }


    public static void numberToWords(int number){
        if (number < 0){
            System.out.println(INVALID_VALUE);
        }

        int reverseNumber = reverse(number);

        int lasDigit = 0;
        while ( reverseNumber != 0 ){
            lasDigit = reverseNumber%10;
            reverseNumber /= 10;
            switch (lasDigit){
                case 0:
                    System.out.print(" Zero ");
                    break;
                case 1:
                    System.out.print(" One ");
                    break;
                case 2:
                    System.out.print(" Two ");
                    break;
                case 3:
                    System.out.print(" Three ");
                    break;
                case 4:
                    System.out.print(" Four ");
                    break;
                case 5:
                    System.out.print(" Five ");
                    break;
                case 6:
                    System.out.print(" Six ");
                    break;
                case 7:
                    System.out.print(" Seven ");
                    break;
                case 8:
                    System.out.print(" Eight ");
                    break;
                case 9:
                    System.out.print(" Nine ");
                    break;
            }
        }

        if (getDigitCount(reverse(number)) < getDigitCount(number)){
            int difference = ( (getDigitCount(number)) - (getDigitCount(reverse(number))) );
            endingZero(difference);
        }
    }

    public static int reverse(int number){
//        if (number<0){
//            number = -(number);
//        }
        int reversedNumber = number%10;
        number /= 10;

        while ( number != 0){
            reversedNumber = ( (reversedNumber * 10) + (number%10) );
            number /= 10;
        }

        return reversedNumber;
    }

    public static int getDigitCount(int number){
        int count = 0;
        if (number<0){
            return -1;
        }
        if (number == 0){
            return 1;
        }

        while ( number != 0 ){
            number /= 10;
            count++;
        }


        return count;
    }

    public static void endingZero(int number){
        for (int i = 1; i<=number; i++){
            System.out.print("Zero ");
        }
    }

}
