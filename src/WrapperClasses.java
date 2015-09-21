import java.math.BigInteger;

/**
 * WrapperClasses.java
 *
 * This is a simple program that will be used to demonstrate
 * Wrapper Classes.
 *
 * @author Brad Dennis
 * Created:  09/17/2015
 * Modified: --
 */
public class WrapperClasses {

    public static void main(String[] args) {
        //Casting Review

        // declaration
        double examWeight;
        double examAverage;
        double labWeight;
        double labAverage;

        // initialization
        examWeight = .60;
        examAverage = 88;   //What type of casting is this?

        labWeight = .40;
        labAverage = 93;    // and this?

        // What's wrong with this?
        int finalGrade = (int) (examWeight * examAverage + labWeight * labAverage);

        // declaration and initialization
        int exam1 = 90;
        int exam2 = 84;
        int total = exam1 + exam2;

        // Why does this work?
        double average = (double) total/2;

        // What do we do if our values are in Strings?
        String examOne = "90";
        String examTwo = "84";

        //total = examOne + examOne;
        //total = (int) (examOne + examTwo);

        total = Integer.parseInt(examOne) + Integer.parseInt(examTwo);

        //There are 8 of these wrapper classes, one for each number data type.
        //https://docs.oracle.com/javase/tutorial/java/data/numberclasses.html
    }
}
