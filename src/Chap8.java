import java.util.Random;
import java.util.Scanner;

/**
 * Created by Brad on 10/28/2015.
 */
public class Chap8 {

    public static void main(String[] args) {

        Scanner si = new Scanner(System.in);
        System.out.println("This program draws a square.");
        System.out.print("Enter the size of the square to draw: ");
        int sz = si.nextInt();
        si.nextLine();
        if (sz < 1)
            System.out.println("Cannot make a zero or negative sized square.  Exiting.");

        System.out.print("Do you want the square to be solid? (y/n) ");
        String rsp = si.nextLine();

        if (!(rsp.equalsIgnoreCase("y") || rsp.equalsIgnoreCase("n"))) System.out.println("Only 'y' or 'n' are permitted.  Exiting.");
        for (int i = 0; i < sz; i++)
            System.out.print("*");
            System.out.println();

        for (int i = 1; i < sz - 1; i++)
            System.out.print("*");
            for (int j = 1; j < sz - 1; j++) {
            if (rsp.equalsIgnoreCase("y"))
            {
            System.out.print("*");
            } else
            {
            System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int counter = 0; counter < sz; counter++)
            System.out.print("*");
        System.out.println();

    }
}
