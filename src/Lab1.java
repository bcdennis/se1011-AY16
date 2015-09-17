/* 
 * Course: SE-1011
 * Term: Fall 2014
 * Assignment: Lab 1
 * Author: Dr. Chris Taylor
 * Date: 09/14/09
 * Modified: 08/09/14 - updated for Fall 2014
 */

import java.util.Scanner;

/**
 * Class containing the entire program for lab 1 in fall 2014
 *  SE-1011 course. 
 * @author taylor
 * @version 2014-08-09-1.4
 */
public class Lab1 {

    /**
     * Simple program to calculate the amount of money a user
     * will earn in one year.
     * @param args ignored
     */
    public static void main(String[] args) {
        // Create a "reference variable"/object to gather data
        // from the keyboard
        Scanner in = new Scanner(System.in);

        // Request data from the user
        System.out.println("Whats your name?");
        String name = in.nextLine();

        System.out.print("Enter the number of hours worked per week: ");
        int hoursWorked = in.nextInt();
        System.out.print("Enter the number of weeks of vacation taken: ");
        int vacationWeeks = in.nextInt();
        System.out.print("Enter your hourly wage (in dollars): ");
        double hourlyWage = in.nextDouble();

        // Calculate earnings
        double yearlyEarnings = hoursWorked * (52 - vacationWeeks)
                * hourlyWage;

        System.out.println("You will earn $" + yearlyEarnings
                + " in one year.");
    }

}