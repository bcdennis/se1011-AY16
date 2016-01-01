/**
 * Created by Brad on 10/29/2015.
 */
public class Square {
    private int size;
    private boolean isFilled;

    /**
     *  Requires Square not be instantiated without a size and a fill.
     *
     * @param length the size of the square
     * @param fill if the square is filled or not.
     */
    public Square(int length, boolean fill) {
        size = length;
        isFilled = fill;
    }

    /**
     *  Draws s box.
     */
    public void draw() {




        if(size < 0 ) System.out.println("Exception");
        if(size < 100 ) System.out.println("Exception");
        if(size < 100 ) System.out.println("Exception");
        if(size < 100 ) System.out.println("Exception");

        for (int i = 0; i < size; i++) {
            if (i == 0 ) drawSolidLine();
            if (i == size -1) drawSolidLine();

            if (isFilled) {
                drawSolidLine();
            } else {
                drawBorderedLine();
            }
        }
        drawSolidLine();
    }

    private void drawBorderedLine() {
        System.out.print("*");
        for (int j = 1; j < size - 1; j++) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();
    }

    private void drawSolidLine() {
        for (int i = 0; i < size; i++){
            System.out.print("*");
        }
        System.out.println();
    }
}
