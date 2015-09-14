/**
 * Operators.java
 *
 * This is a simple program that will be used to demonstrate
 * data types, variables, constants, and assignments.
 *
 * @author Brad Dennis
 * Created:  09/13/2015
 * Modified: --
 */
public class Operators {

    public static void main(String[] args) {

        // addition
        int x = 5;
        int y = 10;

        //System.out.println(x + y);

        // adding of strings
        String wordOne = "word1";
        String wordTwo = "word2";

        //System.out.println(wordOne + wordTwo);

        // subtraction
        //System.out.println(y - 5);
        //System.out.println(wordTwo - wordOne);

        // multiplication
        //System.out.println(x * y);
        //System.out.println(wordTwo * wordOne);

        //Operator precedence
        double f = 3 / 2 + 1;
        System.out.println(f);

        double g = 3 / (2 + 1);
        System.out.println(g);


        // division
        double a = 5.0/2.0;
        System.out.println(a);

        int b = 4/2;
        System.out.println(b);

        int c = 5/2;
        System.out.println(c);

        double d = 5/2;
        System.out.println(d);



        //Types
        String five = ""+ 5;

        // Type conversion
        int h = 2;
        double i = 2;

        System.out.println (h);
        System.out.println(i);

        //int j = 18.7;
        int k = (int)18.7;

        double l = 2/3;
        double m = (double) 2/3;

        System.out.println(m);
        // unary operators
        // ++ --
        int n = 1;
        System.out.println(n);
        n = n+1;

        System.out.println(n);
        int p = ++n;
        System.out.println(n);


        System.out.println(o);
        System.out.println(p);

        // assignment operators
        // *=, /=, +=, -=, %=
        int q  = 1;
        q += 3;

        q = q + 3;

        //System.out.println(q);


    }
}
