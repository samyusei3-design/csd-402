/*
Samuel Guizar
10/29/26
Module 2 Assignement
*/

//This program is a Rock paper Scissors game

import java.util.Random;
import java.util.Scanner;

public class GuizarModule2CSD402 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Random random = new Random();

            //Generate a random number from 1 to 3
            int computerChoice = random.nextInt(3) + 1;

            //Display game instructions
            System.out.println("Rock-Paper-Scissors");
            System.out.println("1 = Rock");
            System.out.println("2 = Paper");
            System.out.println("3 = Scissors");

            int userChoice;

            //Get user input
            System.out.print("Enter your choice (1, 2, or 3): ");

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
                System.out.println("Result: It's a tie!");
            } else if (
                (userChoice == 1 && computerChoice == 3) ||
                (userChoice == 2 && computerChoice == 1) ||
                (userChoice == 3 && computerChoice == 2)
            ) {
                System.out.println("Result: You win!");
            } else {
                System.out.println("Result: The computer wins!");
            }
        }
    }
}