package com.codz;

public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("Bill", 5000);
        System.out.println("new score is " + newScore);

        calculateScore(300);

        calculateScore();

        System.out.println(" // Challenge ");

        double centimeters = calFeetAndInchestoCentimeters(0, 10);
        if (centimeters < 0){
            System.out.println("Invalid parameters");
        }
        calFeetAndInchestoCentimeters(100);


    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("UnNamedPlayer scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("NoPlayerName and no player scored.");
        return 0;
    }

    //Challenge
    public static double calFeetAndInchestoCentimeters(double feetValue, double inchesValue){
        if ( (feetValue < 0) || ((inchesValue < 0) || (inchesValue > 12)) ){
            System.out.println("Invalid feet and inches parameters");
            return -1;
        }
        double centimeters = (feetValue * 30.48);
        centimeters += (inchesValue * 2.54);
        System.out.println(feetValue + " feet, " + inchesValue + " inches = " + centimeters + "cm");
        return 1;
    }

    public static double calFeetAndInchestoCentimeters(double inchesValue){
        if ((inchesValue < 0)){
            return -1;
        }
        double feet = (int)(inchesValue / 12 );
        double remainingInches = (int)(inchesValue % 12 );
        System.out.println(inchesValue + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calFeetAndInchestoCentimeters(feet, remainingInches);
    }


}
