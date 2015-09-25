import java.util.Scanner;

/**
 * ClassExercise.java
 *
 * This is a program that displays logical and comparison operators.
 *
 * @author Brad Dennis
 * Created:  09/17/2015
 * Modified: --
 */
public class ClassExercise {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.println("\tJava Operators");
        System.out.println("--------------------------");

        System.out.println("Menu:");
        System.out.println("Enter '1' for Logical Operators.");
        System.out.println("Enter '2' for Comparison Operators");
        System.out.println("Enter '3' to display the menu.");
        System.out.println("Enter '0' to exit.");
        System.out.println("--------------------------");

        int menuChoice = -1;

        while (menuChoice != 0) {
            System.out.print("\nEnter choice: ");
            menuChoice = stdIn.nextInt();
            switch (menuChoice) {

                case 1:
                    System.out.print("Enter in the first value ('true' or 'false'): ");
                    boolean firstBoolean = stdIn.nextBoolean();
                    System.out.print("Enter in the second value ('true' or 'false'): ");
                    boolean secondBoolean = stdIn.nextBoolean();

                    System.out.println("x\ty\tx && y\tx || y\t!x\t\t!y\t\t!(x || y)\t!x && !y\tx || x\tx && x\tx || !x\t\tx && !x");
                    System.out.println("----------------------------------------------------------------------------------------------");
                    System.out.print(firstBoolean + "\t");
                    System.out.print(secondBoolean + "\t");
                    System.out.print((firstBoolean && secondBoolean) + "\t");
                    System.out.print((firstBoolean || secondBoolean) + "\t");
                    System.out.print(!firstBoolean + "\t");
                    System.out.print(!secondBoolean + "\t");
                    System.out.print(!(firstBoolean || secondBoolean) + "\t\t");
                    System.out.print((!firstBoolean && !secondBoolean) + "\t");
                    System.out.print((firstBoolean || firstBoolean) + "\t");
                    System.out.print((firstBoolean && firstBoolean) + "\t");
                    System.out.print((firstBoolean || !firstBoolean) + "\t");
                    System.out.println((firstBoolean && !firstBoolean));
                    break;
                case 2:
                    System.out.print("Enter in the first integer: ");
                    int firstInt = stdIn.nextInt();
                    System.out.print("Enter in the second integer: ");
                    int secondInt = stdIn.nextInt();

                    System.out.println("x\ty\tx < y\tx <= y\t x != y\t x == y\t x >= y\t x > y");
                    System.out.println("---------------------------------------------------------------");
                    System.out.print(firstInt + "\t");
                    System.out.print(secondInt + "\t");
                    System.out.print((firstInt < secondInt) + "\t");
                    System.out.print((firstInt <= secondInt) + "\t");
                    System.out.print((firstInt != secondInt) + "\t");
                    System.out.print((firstInt == secondInt) + "\t");
                    System.out.print((firstInt >= secondInt) + "\t");
                    System.out.println((firstInt > secondInt));
                    break;
                case 3:
                    System.out.println("Menu:");
                    System.out.println("Enter '1' for Logical Operators.");
                    System.out.println("Enter '2' for Comparison Operators");
                    System.out.println("Enter '3' to display the menu.");
                    System.out.println("Enter '0' to exit.");
                    System.out.println("--------------------------");
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
            }
        }
    }
}
