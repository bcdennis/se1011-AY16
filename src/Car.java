/**
 * Course: SE-1011
 * Term: Fall 2015
 * Author: Dr. Brad Dennis
 * Date: 10/23/15
 */

/**
 * Class that represents a simple Car.
 */
public class Car {

    private static final String DEFAULT_MAKE = "Audi";
    private static final String DEFAULT_COLOR = "Black";
    private static final int DEFAULT_YEAR = 2015;

    private String make;
    private String color;
    private int year;

    /**
     * Default constructor, sets defaults for the car.
     */
    public Car() {
        this(DEFAULT_MAKE, DEFAULT_COLOR, DEFAULT_YEAR);
    }

    /**
     * Parameterized constructor.
     *
     * @param make The make of the car.
     * @param color The model of the car.
     * @param year The year of the car.
     */
    public Car(String make, String color, int year) {
        this.make = make;
        this.color = color;
        this.year = year;
    }

    /**
     * Makes a copy of the car.
     *
     * @return
     */
    public Car copy() {
        Car copy = new Car();
        copy.setMake(getMake());
        copy.setColor(getColor());
        copy.setYear(getYear());

        return copy;
    }

    /**
     * Compares this instance against another to see if they are equal.
     *
     * @param otherCar The other car to compare against.
     * @return boolean If the other car is equal.
     */
    public boolean equals(Car otherCar) {
        return getMake().equals(otherCar.getMake())
                && getColor().equals(otherCar.getColor())
                && getYear() == otherCar.getYear();
    }

    /**
     * Crashes into another car by combining paint colors.
     *
     * @param secondCar  The other car that got crashed into.
     */
    public void crash(Car secondCar) {
        String temp = secondCar.getColor();
        secondCar.setColor(getColor()+ temp);
        setColor(getColor() + temp);
    }

    /**
     * Three car pile-up.
     *
     * @param secondCar The second car in the crash.
     * @param thirdCar  The third car in the crash.
     */
    public void crash(Car secondCar, Car thirdCar) {
        crash(secondCar);
        crash(thirdCar);
    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
