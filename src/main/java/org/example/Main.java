package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("""
                Welcome to the Number Guessing Game!
                I'm thinking of a number between 1 and 100.
                You have 5 chances to guess the correct number.
                
                Please select the difficulty level:
                1. Easy (10 chances)
                2. Medium (5 chances)
                3. Hard (3 chances)
                
                Enter your choice: \s""");

        Scanner input = new Scanner(System.in);
        String difficulty = input.nextLine();


        switch (difficulty) {
            case "1" :
                guessDifficulty("Easy", 10);
                break;
            case "2" :
                guessDifficulty("Medium", 5);
                break;
            case "3" :
                guessDifficulty("Hard", 3);
                break;
        }
    }

    private static void guessDifficulty(String difficulty, int chances) {
        System.out.println("Great! You have selected the "+ difficulty + " difficulty level." +
                "\nLet's start the game!");

        Random rand = new Random();
        int randomNumber = rand.nextInt(100)+1;
        System.out.println(randomNumber);
        int counter = 0;

        while (chances != 0) {
            System.out.print("\nEnter your guess: ");
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();

            chances --;
            counter ++;

            if (randomNumber < number) {
                System.out.println("Incorrect! The number is less than " + number);
            } else if (randomNumber > number) {
                System.out.println("Incorrect! The number is greater than " + number);
            } else {
                System.out.println("Congratulations! You guessed the correct number in " + counter + "attemps.");
                chances = 0;
            }
        }
    }
}