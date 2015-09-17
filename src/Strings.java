/**
 * Strings.java
 *
 * This is a simple program that will be used to demonstrate
 * Strings.
 *
 * @author Brad Dennis
 * Created:  09/13/2015
 * Modified: --
 */
public class Strings {

    public static void main(String[] args) {

        String firstString;

        //System.out.println(firstString);

        firstString = new String();
        System.out.println(firstString);


        String secondString = "";
        System.out.println(secondString);


        //http://docs.oracle.com/javase/8/docs/api/index.html?java/lang/String.html
        String thirdString = "I had dogs named Jazz and Abby.";
        System.out.println(thirdString.length());
        System.out.println(thirdString.charAt(12));
        System.out.println(thirdString.substring(2,5));


    }
}
