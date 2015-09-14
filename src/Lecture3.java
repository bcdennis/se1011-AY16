/**
 * Lecture3.java
 *
 * This is a simple program that will be used to demonstrate
 * data types, variables, constants, and assignments.
 *
 * @author Brad Dennis
 * Created:  09/11/2015
 * Modified: --
 */
public class Lecture3 {

    public static void main(String[] args) {
        final double SPEED_OF_LIGHT = 3.14159;

        int demoVariable = 6;
        //demoVariable = demoVariable + SPEED_OF_LIGHT;
        System.out.println(demoVariable);

        String msoe = "MSOE";
        String msoe2 = msoe;

        msoe = "not msoe";

        System.out.println(msoe2);
    }
}
