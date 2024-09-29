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

        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        String difficulty = input.nextLine();

        int randomNumber = rand.nextInt(100)+1;

        switch (difficulty) {
            case "1" :
                System.out.println("Easy (10 chances).");
            case "2" :
                System.out.println("Medium (5 chances)");
            case "3" :
                System.out.println("Hard (3 chances)");
        }
    }
}