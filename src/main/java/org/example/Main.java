package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Welcome to the Number Guessing Game!\n" +
                "I'm thinking of a number between 1 and 100.\n" +
                "You have 5 chances to guess the correct number.\n" +
                "\n" +
                "Please select the difficulty level:\n" +
                "1. Easy (10 chances)\n" +
                "2. Medium (5 chances)\n" +
                "3. Hard (3 chances)\n" +
                "\n" +
                "Enter your choice: ");

        Scanner input = new Scanner(System.in);
        String difficulty = input.nextLine();
    }
}