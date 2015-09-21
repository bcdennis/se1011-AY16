/**
 * InputOutput.java
 *
 * This is a simple program that will be used to demonstrate
 * more Input Output.
 *
 * @author Brad Dennis
 * Created:  09/17/2015
 * Modified: --
 */
import javax.swing.JOptionPane;
import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {
        // Variable declarations
        Scanner in = new Scanner(System.in);
        int integer;
        long longInteger;
        float realNumber;
        double doubleReal;
        String string1;
        String string2;
/*
        // Prompts for user input
        System.out.println("Enter an integer, a long integer, "
                + "a floating-point ");
        System.out.println("number, another floating-point number, "
                + "and a string.");
        System.out.println("Separate each with a blank or return.");

        // Read in values
        integer = in.nextInt();
        longInteger = in.nextLong();
        realNumber = in.nextFloat();
        doubleReal = in.nextDouble();
        string1 = in.nextLine();
        System.out.println("Now enter another value.");
        string2 = in.next();

        System.out.println("Here is what you entered: ");
        System.out.println(integer + " " + longInteger + " " + realNumber +
                " " + doubleReal + " " + string1 +
                " and " + string2);
*/

        //String escapeChars = "\tHeading\tColumn\t\r\n\"Row\"";
        //System.out.println(escapeChars);



        // We can also interact with the user via a GUI
        String input = JOptionPane.showInputDialog("Please enter a number");

        int userValue = Integer.parseInt(input);
        int newValue = userValue * 10;


        JOptionPane.showMessageDialog(null, "Your number times ten is equal to " + newValue);
    }
}
