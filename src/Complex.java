import java.util.Scanner;

/**
 * Represents complex numbers.  Objects from the class are immutable,
 * i.e., their value cannot change once they are created.
 * @author taylor
 * @version 2012.11.09_1
 * @revised 2015.10.16
 */
public class Complex {

    private static final double DEFAULT_REAL = 0.0;
    private static final double DEFAULT_IMAGINARY = 0.0;

    private double real;
    private double imaginary;


    /**
     * Default constructor of a complex number with real and
     * imaginary components of zero
     */
    public Complex() {
        this(DEFAULT_REAL);
    }

    /**
     * Constructor of a complex number with an imaginary component of zero
     * @param real The value of the real component
     */
    public Complex(double real) {
        this(real, DEFAULT_IMAGINARY);
    }

    /**
     * Constructor for a fully specified complex number
     * @param real The value of the real component
     * @param imaginary The value of the imaginary component
     */
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    /**
     * Constructor that accepts a string representation of a
     * complex number
     * @param num String representation of a complex number
     */
    public Complex(String num) {
        double real = 0.0;
        double imaginary = 0.0;
        num = num.replace("(", "").replace(")", "");

        if(num.contains(" + ") || num.contains(" - ")) {
            // Both real and imaginary components present, e.g., "2.0 - 2.0i"
            Scanner parser = new Scanner(num.substring(0, num.length()-1));
            real = parser.nextDouble();
            parser.next();
            imaginary = parser.nextDouble();
            if(num.contains(" - ")) {
                imaginary = -imaginary;
            }
        } else if(num.contains("i")) {
            // imaginary component only, e.g., "3.8i"
            Scanner parser = new Scanner(num.substring(0, num.length()-1));
            imaginary = parser.nextDouble();
        } else {
            // real component only, e.g., "-5.6"
            Scanner parser = new Scanner(num);
            real = parser.nextDouble();
        }
        this.real = real;
        this.imaginary = imaginary;
    }

    public void setReal(double real){
        this.real = real;
    }

    public double getReal() {
        return this.real;
    }

    public void setImaginary(double imaginary){
        this.imaginary = imaginary;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    /**
     * The String representation of the complex number
     * This may be in cartesian or polar form depending on
     * the value of the class variable isPolar.
     * @see Object#toString()
     * @return String representation of the object
     */
    public String toString(){
        String answer;
        if(this.imaginary ==0.0) {
            answer = Double.toString(real);
        } else if(this.real==0.0) {
            answer = imaginary + "i";
        } else if(this.imaginary <0.0) {
            answer = "(" + real + " - " + (-imaginary) + "i)";
        } else {
            answer = "(" + real + " + " + imaginary + "i)";
        }
        return answer;
    }

    /**
     * Calculates the sum of the object and a real value
     * @param addend The value to be added to the real component of the complex number
     * @return A new complex number containing the sum of the object and the specified
     * real component
     */
    public Complex plus(double addend) {
        return new Complex(this.real + addend, this.imaginary);
    }

    /**
     * Calculates the sum of two complex numbers
     * @param addend Number to be added
     * @return the result of the sum of two complex numbers
     */
    public Complex plus(Complex addend) {
        return new Complex(this.real + addend.real, this.imaginary + addend.imaginary);
    }

    /**
     * Calculates the difference of two complex numbers
     * @param subtrahend Number to be subtracted
     * @return the result of taking away the specified value from the object
     */
    public Complex minus(Complex subtrahend) {
        return new Complex(real - subtrahend.real, imaginary - subtrahend.imaginary);
    }

    /**
     * Compares two complex numbers to see if they are equal
     * @param that The complex number to compare
     * @return true if the objects share the same value, otherwise false
     */
    public boolean equals(Complex that) {
        return this.real==that.real && this.imaginary ==that.imaginary;
    }

    /**
     * Returns the magnitude of the complex number
     * @return the magnitude of the complex number
     */
    public double getMagnitude() {
        return Math.sqrt(Math.pow(real, 2) + imaginary * imaginary);
    }

    /**
     * Returns the angle of the complex number in degrees
     * @return the angle of the complex number in degrees
     */
    public double getAngle() {
        return Math.toDegrees(Math.atan(imaginary /real));
    }


    /**
     * Calculates the product of two complex numbers
     * @param multiplicand Number to be multiplied
     * @return the result of the product of two complex numbers
     */
    public Complex times(Complex multiplicand) {
        return new Complex(this.real * multiplicand.real - imaginary * multiplicand.imaginary,
                imaginary * multiplicand.real + real * multiplicand.imaginary);
    }

    /**
     * Calculates the result of dividing the passed complex number
     * into the calling number
     * @param divisor Number to be used as the divisor
     * @return the result of the division
     */
    public Complex dividedBy(Complex divisor) {
        double magnitude = getMagnitude() / divisor.getMagnitude();
        double angle = Math.toRadians(getAngle() - divisor.getAngle());
        return new Complex(magnitude * Math.cos(angle), magnitude * Math.sin(angle));
    }

}