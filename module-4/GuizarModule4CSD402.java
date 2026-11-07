/*
Samuel Guizar
11/7/26
Module 4 Assignment
*/

/* This program uses four overloaded methods to calculate the
 average of arrays containing short, int, long, and double values */


public class GuizarModule4CSD402 {

    public static void main(String[] args) {

        //Create arrays with different data types and sizes
        short[] shortArray = {10, 20, 30};
        int[] intArray = {15, 25, 35, 45};
        long[] longArray = {100, 200, 300, 400, 500};
        double[] doubleArray = {2.5, 4.5, 6.5, 8.5, 10.5, 12.5};

        //Display short array and average
        System.out.println("Short Array:");
        for (short number : shortArray) {
            System.out.print(number + " ");
        }
        System.out.println("\nAverage: " + average(shortArray));

        //Display int array and average
        System.out.println("\nInt Array:");
        for (int number : intArray) {
            System.out.print(number + " ");
        }
        System.out.println("\nAverage: " + average(intArray));

        //Display long array and average
        System.out.println("\nLong Array:");
        for (long number : longArray) {
            System.out.print(number + " ");
        }
        System.out.println("\nAverage: " + average(longArray));

        //Display double array and average
        System.out.println("\nDouble Array:");
        for (double number : doubleArray) {
            System.out.print(number + " ");
        }
        System.out.println("\nAverage: " + average(doubleArray));
    }

    //Calculate the average of short array
    public static short average(short[] array) {
        short total = 0;

        for (short number : array) {
            total += number;
        }

        return (short) (total / array.length);
    }

    //Calculate the average of int array
    public static int average(int[] array) {
        int total = 0;

        for (int number : array) {
            total += number;
        }

        return total / array.length;
    }

    //Calculate the average of long array
    public static long average(long[] array) {
        long total = 0;

        for (long number : array) {
            total += number;
        }

        return total / array.length;
    }

    //Calculate the average of double array
    public static double average(double[] array) {
        double total = 0;

        for (double number : array) {
            total += number;
        }

        return total / array.length;
    }
}