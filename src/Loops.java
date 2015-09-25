import java.util.Scanner;

/**
 * Loops.java
 *
 * This is a simple program that will be used to demonstrate
 * more while, do-while, & for loops.
 *
 * @author Brad Dennis
 * Created:  09/25/2015
 * Modified: --
 */
public class Loops {

    public static void main(String[] args) {

        // Exercises:  http://msoe.us/taylor/se1011/wk3-3

        //Exercise 9
        //Suppose you are making a game that needs to control a character on the screen.
        //The following key mappings should be used: a - left, s - down, w - up, d - right.
        // Write a program that accepts a string of characters and generates a sequence of moves.

        Scanner stdIn = new Scanner(System.in);
        System.out.print("Enter in your moves ('w' 'a' 's' 'd'): ");
        String moves = stdIn.nextLine();

        System.out.println("\nwhile loop");
        System.out.println("--------------");
        int index = 0;
        while (index < moves.length()) {
            char move = moves.charAt(index);
            switch(move) {
                case 'w':
                    System.out.println("up");
                    break;
                case 'a':
                    System.out.println("left");
                    break;
                case 's':
                    System.out.println("down");
                    break;
                case 'd':
                    System.out.println("right");
                    break;
            }

            index++;
        }

        // while with a break
        System.out.println("\nwhile with break");
        System.out.println("--------------");
        index = 0;
        while (true) {
            char move = moves.charAt(index);
            switch(move) {
                case 'w':
                    System.out.println("up");
                    break;
                case 'a':
                    System.out.println("left");
                    break;
                case 's':
                    System.out.println("down");
                    break;
                case 'd':
                    System.out.println("right");
                    break;
            }

            index++;
            if (index >= moves.length() ) {
                break;
            }

        }


        //do while loop
        System.out.println("\ndo-while loop");
        System.out.println("--------------");
        index = 0;
        do {
            char move = moves.charAt(index);
            switch(move) {
                case 'w':
                    System.out.println("up");
                    break;
                case 'a':
                    System.out.println("left");
                    break;
                case 's':
                    System.out.println("down");
                    break;
                case 'd':
                    System.out.println("right");
                    break;
            }

            index++;
        } while (index < moves.length());

        //for loop
        System.out.println("\nfor loop");
        System.out.println("--------------");
        for (int i = 0; i < moves.length(); i++) {
            char move = moves.charAt(i);

            switch(move) {
                case 'w':
                    System.out.println("up");
                    break;
                case 'a':
                    System.out.println("left");
                    break;
                case 's':
                    System.out.println("down");
                    break;
                case 'd':
                    System.out.println("right");
                    break;
            }
        }


    }
}
