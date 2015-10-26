/**
 * Course: SE-1011
 * Term: Fall 2015
 * Author: Dr. Brad Dennis
 * Date: 10/23/15
 */

/**
 * Driver for the car class.
 */
public class CarDriver {

    public static void main(String[] args) {

        Car camaro;
        camaro = new Car();
        camaro.setMake("Chevy");


        camaro.setYear(2015);
        camaro.setColor("Yellow");

        Car copyOfCamaro;
        copyOfCamaro = camaro;

        System.out.println(copyOfCamaro == camaro);

        copyOfCamaro.setColor("Red");

        System.out.println(copyOfCamaro.getColor());
        System.out.println(camaro.getColor());

        camaro.setColor("Yellow");
        System.out.println(copyOfCamaro.getColor());
        System.out.println(camaro.getColor());

        copyOfCamaro = camaro.copy();

        System.out.println(copyOfCamaro == camaro);
        System.out.println(copyOfCamaro.equals(camaro));
        copyOfCamaro.setColor("Red");

        //garbage collection
        camaro = copyOfCamaro;

        Car anotherCar = new Car("Ford", "Green", 1998);
    }
}
