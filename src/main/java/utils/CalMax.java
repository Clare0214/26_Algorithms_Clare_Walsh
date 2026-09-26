package utils;
import java.util.Scanner;
import java.util.Scanner;

/**
 * Provides methods for reading integers and finding the largest value.
 */
public class CalMax {

    private static final Scanner SCANNER = new Scanner(System.in);

    /**
     * Prompts the user until they enter a valid integer.
     * <p>
     * If the user enters something that is not a number, an error message is
     * displayed and they are prompted again.
     *
     * @param prompt the message displayed to the user
     * @return the valid integer entered by the user
     */
    public static int getValidInteger(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = SCANNER.nextLine();

            try {
                return Integer.parseInt(input.trim());
            } catch (NumberFormatException exception) {
                System.out.println("Inappropriate input. Please enter a number.");
            }
        }
    }

    /**
     * Finds the largest of three integers.
     *
     * @param firstNumber  the first number to compare
     * @param secondNumber the second number to compare
     * @param thirdNumber  the third number to compare
     * @return the largest of the three numbers
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

    /**
     * Runs the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        int num1 = getValidInteger("Please enter the first integer: ");
        int num2 = getValidInteger("Please enter the second integer: ");
        int num3 = getValidInteger("Please enter the third integer: ");

        int highestNumber = findMax(num1, num2, num3);

        System.out.println("The highest number is: " + highestNumber);
    }

    /**
     * finds the largest number in an array of integers
     *
     * @param numbers the array of integers to search it must not be empty
     * @return the largest number in the array
     * @throws IllegalArgumentException if the array is empty
     *
     */
    public static int findMax(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("The array must not be empty.");
        }

        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        return largest;
    }
}

