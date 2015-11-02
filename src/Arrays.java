/**
 * SE1011
 * Fall 2015
 * Arrays Lecture
 * Name: Brad Dennis
 * Created:  10/12/2015
 */

import java.io.PrintStream;
import java.util.Random;

/**
 * A simple class used to demo Arrays.
 *
 */
public class Arrays {

    public static void main(String[] args) {

        // An array is a collection of primitives
        int[] integers;
        integers = new int[20];

        // or a collection of references
        String[] references;
        references = new String[20];


        for (int i =0; i < integers.length; i++) {
            //System.out.println(integers[i]);
        }

        for (int i = 0; i < references.length; i++){
            //System.out.println(references[i]);
        }

        initializePrimitives(integers);

        for (int i =0; i < integers.length; i++) {
            System.out.println(integers[i]);
        }

        String[] strings = {"Dennis"
                , "Hasker"
                , "Taylor"
                , "Schilling"
                , "Urbain"
                , "Rebenistch"
                , "Hornick"};

        printStrings(strings, System.out);
        System.out.println();

        String[] copyOfStrings = new String[strings.length];
        copyStrings(strings, copyOfStrings);
        printStrings(copyOfStrings, System.out);

//        strings[strings.length] = "NewProf";

        strings = resizeStrings(strings, 10);
        printStrings(strings, System.out);

        if (searchStrings(strings, "Hornick")) {
            System.out.println("Hornick appears in the array.");
        } else {
            System.out.println("Hornick does not appear in the array.");
        }

        unsetString(strings, "Hornick");

        if (searchStrings(strings, "Hornick")) {
            System.out.println("Hornick appears in the array.");
        } else {
            System.out.println("Hornick does not appear in the array.");
        }

        //printStrings(strings, System.out);


        swap(strings, 1, 2);
        printStrings(strings, System.out);
          
    }

    private static void initializePrimitives(int[] array) {

        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(array.length);
        }
    }

    private static void printStrings(String[] strings, PrintStream out) {

        for (int i = 0; i < strings.length; i++) {
            out.println(strings[i]);
        }
    }

    private static void copyStrings(String[] source, String[] destination) {
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
    }

    private static String[] resizeStrings(String[] source, int newSize) {
        String[] resizedArray = new String[newSize];
        copyStrings(source, resizedArray);

        return resizedArray;
    }

    private static boolean searchStrings(String[] haystack, String needle) {
        boolean isFound = false;
        for (String string : haystack) {
            if (string != null && string.equals(needle)) {
                isFound = true;
                break;
            }
        }

        return isFound;
    }

    private static void unsetString(String[] haystack, String needle) {
        for (int i = 0; i < haystack.length; i++ ) {
            if (haystack[i] != null && haystack[i].equals(needle)) {
                haystack[i] = null;
            }
        }
    }



    private static void swap(String[] source, int original, int target) {
        String temp = source[original];
        source[original] = source[target];
        source[target] = temp;
    }
}
