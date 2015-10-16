/**
 * Complex.java
 *
 * This is a simple program that will be used to demonstrate
 * OOP.
 *
 * @author Brad Dennis
 * Created:  10/16/2015
 * Modified: --
 */

import java.util.Scanner;


public class ComplexDriver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Get first number
        System.out.println("Enter a complex number in the form: 3.0 + 4.3i");
        Complex firstComplex = new Complex(in.nextLine());

        // Get second number
        System.out.println("Enter a complex number in the form: 3.0 + 4.3i");
        Complex secondComplex = new Complex(in.nextLine());



        // Calculate result of multiplying two numbers
        Complex answer = firstComplex.times(secondComplex);

        System.out.println(firstComplex + " * " + secondComplex + " = " + answer);

        Complex thirdComplex = secondComplex;
        System.out.print("c2 reference: ");
        System.out.println(secondComplex);

        System.out.print("c3 reference: ");
        System.out.println(thirdComplex);

        secondComplex.setReal(9.0);
        System.out.print("c2 reference: ");
        System.out.println(secondComplex);

        System.out.print("c3 reference: ");
        System.out.println(thirdComplex);

        //suppose we want to see if two objects are equal?
        System.out.println(firstComplex.equals(secondComplex));

        // suppose we wanted to swap the imaginary components of c1 & c2?
        firstComplex.swapReal(secondComplex);

        System.out.print("c1 reference: ");
        System.out.println(firstComplex);

        System.out.print("c2 reference: ");
        System.out.println(secondComplex);


    }
}
