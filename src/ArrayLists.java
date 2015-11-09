/**
 * SE1011
 * Fall 2015
 * Arrays Lecture
 * Name: Brad Dennis
 * Created:  11/09/2015
 */

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;

/**
 * A simple class used to demo ArrayLists.
 * See http://msoe.us/taylor/tutorial/se1011/arrayList
 *
 */
public class ArrayLists {

    public static void main(String[] args) {

        // An ArrayList is a collection like arrays, but can only store references.
        int[] integers;
        integers = new int[5];

        // or a collection of references
        ArrayList<String> references;
        references = new ArrayList<>();

        //recall how we initialized an array of ints?
        Random rand = new Random();

        for (int i = 0; i < integers.length; i++) {
            integers[i] = rand.nextInt(integers.length);
        }


        /*

        String[] strings = {"Dennis"
                , "Hasker"
                , "Taylor"
                , "Schilling"
                , "Urbain"
                , "Rebenistch"
                , "Hornick"};
        */
        // for an ArrayList
        references.add("Dennis");
        references.add("Hasker");
        references.add("Schilling");
        references.add("Urbain");
        references.add("Rebenistch");
        references.add("Hornick");


        for (int i =0; i < integers.length; i++) {
            System.out.println(integers[i]);
        }

        for (int i = 0; i < references.size(); i++){
            System.out.println(references.get(i));
        }


        for(String s: references) {
            System.out.println(s);
        }

        while (!references.isEmpty()) {
            references.remove(0);
        }

        System.out.println(references);

        references.add("Dennis");
        references.add("Hasker");
        references.add("Schilling");
        references.add("Urbain");
        references.add("Rebenistch");
        references.add("Hornick");

        references.clear();

        System.out.println(references);



        //printStrings(strings, System.out);
        System.out.println(references);

        System.out.println();

        ArrayList<String> copyOfStrings = new ArrayList<String>();
        //copyStrings(strings, copyOfStrings);
        copyOfStrings = (ArrayList<String>)references.clone();

        System.out.println(copyOfStrings);

//        strings[strings.length] = "NewProf";

//        strings = resizeStrings(strings, 10);
//        printStrings(strings, System.out);

        references.add("New Prof");
        copyOfStrings.remove(1);

        System.out.println(references);
        System.out.println();

        System.out.println(copyOfStrings);

        /*
        if (searchStrings(strings, "Hornick")) {
            System.out.println("Hornick appears in the array.");
        } else {
            System.out.println("Hornick does not appear in the array.");
        }
        */

        if (references.contains("Hornick")) {
            System.out.println("Hornick appears in the array.");
        } else {
            System.out.println("Hornick does not appear in the array.");
        }

        // where is Hornick?  (lastIndexOf)
        int hornickIndex = references.indexOf("Hornick");

        //unsetString(strings, "Hornick");
        references.remove(hornickIndex);
        // alternatively
        references.add("Hornick");
        references.remove("Hornick");


        if (references.contains("Hornick")) {
            System.out.println("Hornick appears in the array.");
        } else {
            System.out.println("Hornick does not appear in the array.");
        }



    }

    private static void initializePrimitives(int[] array) {


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
