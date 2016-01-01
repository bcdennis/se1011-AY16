import java.security.cert.*;

/**
 * Scratch.java
 *
 * This is a simple program that will be used to demonstrate
 * as a scratch pad for the review.
 *
 * @author Brad Dennis
 * Created:  11/12/2015
 * Modified: --
 */
public class Scratch {


    public Scratch() {
        this(1);

        //do stuff

    }

    public Scratch(int a) {

    }


    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        y = ++x;
        y = x++;

        int[] xs = {1,0,2,4};
        int[] ys = {0,3, 4, 1};

        for (int z : xs) {
            System.out.println(z);
            if (z == 2) {
                break;
            }
        }

        for (int i = 0 ; i < xs.length; i++){

            int temp = xs[0];
            xs[0] = ys[0];
            ys[0] = temp;

        }


    }
}









