import java.util.Random;
import java.util.Scanner;

/**
 * Created by Brad on 10/28/2015.
 */
public class Chap8 {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        System.out.println("This program draws a square.");
        System.out.print("Enter the size of the square to draw: ");

        int size = stdIn.nextInt();
        stdIn.nextLine();

        if (size < 1) {
            System.out.println("Cannot make a zero or negative sized square.  Exiting.");
        }

        System.out.print("Do you want the square to be solid? (y/n) ");

        String response = stdIn.nextLine();

        if (!(response.equalsIgnoreCase("y") || response.equalsIgnoreCase("n"))) {
            System.out.println("Only 'y' or 'n' are permitted.  Exiting.");
        }

        for (int i = 0; i < size; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 1; i < size - 1; i++)
            System.out.print("*");
            for (int j = 1; j < size - 1; j++) {
                if (response.equalsIgnoreCase("y")) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            System.out.println("*");
        }

        for (int i = 0; i < size; i++) {
            System.out.print("*");
        }
        System.out.println();

    }
}
