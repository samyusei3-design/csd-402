/*
Samuel Guizar
10/31/26
Module 3 Assignment
*/

public class GuizarModule3CSD402 {
    public static void main(String[] args) {

        //Controls rows
        for (int row = 1; row <= 7; row++) {

            String left = "";
            String right = "";
            int number = 1;

            //Build numbers up to the middle
            for (int column = 1; column < row; column++) {
                left += number + " ";
                number *= 2;
            }

            //Middle number
            String middle = String.valueOf(number);

            //Build numbers after middle
            number /= 2;

            for (int column = row - 1; column >= 1; column--) {
                right += number;
                number /= 2;

                if (column > 1) {
                    right += " ";
                }
            }

            //Calculate spaces before numbers
            int padding = 14 - left.length();

            for (int space = 0; space < padding; space++) {
                System.out.print(" ");
            }

            //Print left side, middle, right side
            System.out.print(left + middle);

            if (!right.isEmpty()) {
                System.out.print(" " + right);
            }

            //Calculate spaces before @ symbol
            int lineLength = padding + left.length()
                    + middle.length();

            if (!right.isEmpty()) {
                lineLength += 1 + right.length();
            }

            for (int space = lineLength; space < 31; space++) {
                System.out.print(" ");
            }

            //Print @ symbol
            System.out.println("@");
        }
    }
}