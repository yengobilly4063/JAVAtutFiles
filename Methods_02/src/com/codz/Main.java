package com.codz;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was = " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        calculateScore(gameOver, score, levelCompleted, bonus);

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was = " + highScore);


        //Challenge
        int playerPosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Bill", playerPosition);

        playerPosition = calculateHighScorePosition(900);
        displayHighScorePosition("yengo", playerPosition);

        playerPosition = calculateHighScorePosition(400);
        displayHighScorePosition("arnold", playerPosition);

        playerPosition = calculateHighScorePosition(50);
        displayHighScorePosition("achwe", playerPosition);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }


    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName.toUpperCase() + ", your current position is =" + playerPosition + "=" +
                " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
//        if (playerScore >= 1000){
//            return 1;
//        }else if (playerScore >= 500){
//            return 2;
//        }else if (playerScore >= 100){
//            return 3;
//        }
//        return 4;
        int position = 4;   //assuming position 4 will return
        if (playerScore >= 1000) {
            position = 1;
        }else if (playerScore >= 500){
            position = 2;
        }else if (playerScore >= 100){
            position = 3;
        }
        return position;

    }
}
