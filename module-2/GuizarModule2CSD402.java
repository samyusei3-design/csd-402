/*
Samuel Guizar
10/29/26
Module 2 Assignment
*/

//This program is a Rock Paper Scissors game

import java.util.Random;
import java.util.Scanner;

public class GuizarModule2CSD402 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Random random = new Random();

            //Generate a random number from 1 to 3
            int computerChoice = random.nextInt(3) + 1;

            //Display game instructions
            System.out.println("Rock Paper Scissors Game");
            System.out.println("Enter 1 for Rock");
            System.out.println("Enter 2 for Paper");
            System.out.println("Enter 3 for Scissors");

            int userChoice;

            //Get user input
            System.out.print("1, 2, or 3? : ");

            if (input.hasNextInt()) {
                userChoice = input.nextInt();

                if (userChoice < 1 || userChoice > 3) {
                    System.out.println(
                        "Error: Please enter 1, 2, or 3."
                    );
                    return;
                }
            } else {
                System.out.println(
                    "Error: Invalid input. Please enter a number."
                );
                return;
            }

            //Convert the computer's number
            String computerSelection;

            switch (computerChoice) {
                case 1:
                    computerSelection = "Rock";
                    break;
                case 2:
                    computerSelection = "Paper";
                    break;
                default:
                    computerSelection = "Scissors";
            }

            //Convert the user's number
            String userSelection;

            switch (userChoice) {
                case 1:
                    userSelection = "Rock";
                    break;
                case 2:
                    userSelection = "Paper";
                    break;
                default:
                    userSelection = "Scissors";
            }

            //Display both selections
            System.out.println("\nYour selection: " + userSelection);
            System.out.println("Computer's selection: " + computerSelection);

            //Determine the winner
            if (userChoice == computerChoice) {
                System.out.println("It's a tie!");
            } else if (
                (userChoice == 1 && computerChoice == 3) ||
                (userChoice == 2 && computerChoice == 1) ||
                (userChoice == 3 && computerChoice == 2)
            ) {
                System.out.println("You win!");
            } else {
                System.out.println("The computer wins!");
            }
        }
    }
}