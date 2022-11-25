/*
 * The hourglass program
 *
 * @author  Devin Jhu
 * @version 1.0
 * @since   2022-11-22
 */

import java.util.Scanner;

/**
* This program makes an Hourglass of stars.
*/
final class Hourglass {

    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Hourglass() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Creates the hourglass.
    *
    * @param userInt the amount of sand in the hourglass
    * @param spaceAmount the amount of extra spaces to centre the sand
    */
    static void hourglass(final int userInt, final int spaceAmount) {
        String output = "";
        int counter1;
        int counter2;
        for (counter1 = 0; counter1 < spaceAmount; counter1++) {
            output += " ";
        }

        for (counter2 = 0; counter2 < userInt; counter2++) {
            output += "* ";
        }
        System.out.println(output);

        if (userInt > 1) {
            hourglass(userInt - 1, spaceAmount + 1);
        }
        System.out.println(output);
    }

    /**
    * This is the main function.
    *
    * @param args this will not be used
    */
    public static void main(final String[] args) {

        // input
        final Scanner userInput = new Scanner(System.in);
        System.out.print("enter hourglass height: ");

        try {
            final int input = userInput.nextInt();
            System.out.println();
            if (input > 1) {
                // process
                hourglass(input, 0);
            } else {
                System.out.println("Not a number");
            }
        } catch (java.util.InputMismatchException ex) {
            System.err.println("not a number");
        }
        System.out.println("\nDone.");
    }
}
