package utils;
import java.util.Scanner;
public class CalMax {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static String[] args;

    /**
     * Prompts the user until they enter a valid integer
     * <p>
     * if the user does not enter a number an error message is displayed and
     * the user is prompted agian using the original prompt.
     *
     * @param prompt the text displayed when asking the user for an integer
     * @return the validated integer entered by the user
     */
    public static int getValidInteger(String prompt) {
        while (true) {
            System.out.println(prompt);
            String input = SCANNER.nextLine();
            try {
                return Integer.parseInt(input.trim());
            } catch (NumberFormatException exception) {
                System.out.println("Inappropriate input. Please enter a number.");
            }
        }
    }

    /**
     * Demonstrates the getValidInteger method.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        int number = getValidInteger("Enter an integer:");
        System.out.println("You entered:" + number);
    }

    /**
     * Finds and returns the largest of three integers
     *
     * @param firstNumber  the first integer to compare
     * @param secondNumber the second integer to compare
     * @param thirdNumber  the third integer to compare
     * @return thr largest of the three integers
     */
    public static int findMax(int firstNumber, int secondNumber, int thirdNumber) {
        int largest = firstNumber;

        if (secondNumber > largest) {
            largest = secondNumber;
        }
        if (thirdNumber > largest) {
            largest = thirdNumber;
        }
        return largest;
    }
}