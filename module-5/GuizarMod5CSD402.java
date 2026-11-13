/* 
Samuel Guizar
11/11/26
Module 5 Assignment
*/

/*
This program has methods that find the largest and smallest values
then returns the location of those values
*/

public class GuizarMod5CSD402 {

    //Finds location of largest value in a double array and returns the row and column
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = {0, 0};
        double largest = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] > largest) {
                    largest = arrayParam[row][col];
                    location[0] = row;
                    location[1] = col;
                }
            }
        }

        return location;
    }

    //Finds location of largest value in a integer array and returns the row and column
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = {0, 0};
        int largest = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] > largest) {
                    largest = arrayParam[row][col];
                    location[0] = row;
                    location[1] = col;
                }
            }
        }

        return location;
    }

    //Finds location of smallest value in a double array and returns the row and column
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = {0, 0};
        double smallest = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] < smallest) {
                    smallest = arrayParam[row][col];
                    location[0] = row;
                    location[1] = col;
                }
            }
        }

        return location;
    }

    //Finds location of smallest value in a integer array and returns the row and column
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = {0, 0};
        int smallest = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] < smallest) {
                    smallest = arrayParam[row][col];
                    location[0] = row;
                    location[1] = col;
                }
            }
        }

        return location;
    }


 //Tests the four methods and displays their results
    public static void main(String[] args) {

        int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        double[][] decimals = {
            {1.5, 2.5, 3.5},
            {4.5, 5.5, 6.5},
            {7.5, 8.5, 9.5}
        };

        int[] largestInt = locateLargest(numbers);
        int[] smallestInt = locateSmallest(numbers);

        int[] largestDouble = locateLargest(decimals);
        int[] smallestDouble = locateSmallest(decimals);

        System.out.println("Largest integer location: ["
                + largestInt[0] + ", " + largestInt[1] + "]");

        System.out.println("Smallest integer location: ["
                + smallestInt[0] + ", " + smallestInt[1] + "]");

        System.out.println("Largest double location: ["
                + largestDouble[0] + ", " + largestDouble[1] + "]");

        System.out.println("Smallest double location: ["
                + smallestDouble[0] + ", " + smallestDouble[1] + "]");
    }
}