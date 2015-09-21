import java.util.Scanner;

/**
 * InputOutput.java
 *
 * This is a simple program that will be used to demonstrate
 * conditionals.
 *
 * @author Brad Dennis
 * Created:  09/21/2015
 * Modified: --
 */
public class Conditionals {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        String response;

        System.out.println("Grade Entry System");
        System.out.println("-------------------");
        System.out.println("Enter 'q' or 'Q' to quit.");
        System.out.print("Enter the students final grade as a number: ");
        response = stdIn.nextLine();

        // (!response.equals("q") && !response.equals("Q"))
        // response.equalsIgnoreCase("q")
        while (!(response.equals("q") || (response.equals("Q")))) {

            String grade = "F";
            String feedback = "";
            int numericResponse = Integer.parseInt(response);

            if (numericResponse >= 93) {
                grade = "A";
            } else if (numericResponse >= 89 && numericResponse < 93) {
                grade = "AB";
            } else if (numericResponse >= 85 && numericResponse < 89) {
                grade = "B";
            } else if (numericResponse >= 81 && numericResponse < 85) {
                grade = "BC";
            } else if (numericResponse >= 77 && numericResponse < 81) {
                grade = "C";
            } else if (numericResponse >= 74 && numericResponse < 77) {
                grade = "CD";
            } else if (numericResponse >= 70 && numericResponse < 74) {
                grade = "D";
            }

            switch(grade) {
                case "A":
                    feedback = "Student has performed outstandingly in all regards and is clearly exceptional.";
                    break;
                case "AB":
                    feedback = "Student has performed with excellence.";
                    break;
                case "B":
                    feedback = "Student has shown very high command of course content.";
                    break;
                case "BC":
                    feedback = "Student has done a commendable job dealing with course content.";
                    break;
                case "C":
                    feedback = "Student has an adequate grasp of course content.";
                    break;
                case "CD":
                    feedback = "Student has met fair expectations.";
                    break;
                case "D":
                    feedback = "Student has attained minimal expectations in the course.";
                    break;
                default:
                    feedback = "Student has not attained minimal expectations in the course.";
            }

            System.out.println("The student's grade is: " + grade + " - " + feedback);

            System.out.print("\nEnter next student's grade:");
            response = stdIn.nextLine();
        }


    }
}
