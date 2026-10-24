//Samuel Guizar
//10/24/26
//Module 1.3

//This program calculates the energy needed to heat water in joules

import java.util.Scanner;

public class CalculateEnergy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Using try for error handling
        try {   

            //Prompt user for amount of water in kilograms
            System.out.print("Please enter the amount of water in kilograms: ");
            double mass = input.nextDouble();

            //Check if mass is more than 0
            if (mass <= 0) {
                System.out.println("Error: Amount of water must be more than zero.");
                return;

            }

            //Prompt user for initial temperature in Celsius
            System.out.print("Enter the initial temperature in Celsius: ");
            double initialTemperature = input.nextDouble();

            //Prompt user for final temperature in Celsius
            System.out.print("Enter the final temperature in Celsius: ");
            double finalTemperature = input.nextDouble();

            //Calculate the energy in Joules needed to heat the water
            double energy = mass * (finalTemperature - initialTemperature) * 4184;

            //Display the result
            System.out.println("The energy needed is " + energy + " Joules.");
        
        //Using catch for error handling
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Please enter valid numbers");
        } finally {

            input.close();

        }
    }
}