package utils;
import java.util.Scanner;

/**
 * Utility class for validating user input
 */

public class InputUtility {
    private static final Scanner SCANNER = new Scanner(System.in);

    /**
     * prompts the user until they enter a valid integer
     * <p>
     * if the user does not enter a number, an error message is displayed and
     * the user is prompted again using the same prompt
     *
     * @param prompt the text displayed when asking the user for an integer
     * @return the validated integer entered by the user
     */
    public static int getValidInteger(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = SCANNER.nextLine();
            try {
                return Integer.parseInt(input.trim());
            } catch (NumberFormatException e) {
                System.out.println("Inappropriate input. Please enter a number.");
            }
        }
    }
    /**
     * Prompts the user to enter a line of text.
     *
     * @param prompt the text displayed when asking for input
     * @return the line entered by the user
     */
    public static String getValidString(String prompt){
        System.out.print(prompt);
        return SCANNER.nextLine();
    }

    /**
     * Prompts the user until they enter a number within the specified inclusive range
     * <p>
     * if the user enters a value that is not a number,or if the number falls
     * outside the allowed range, the user is informed and prompted again using the same prompt.
     * the lower and upper boundary values are both allowed.
     *
     * @param prompt     the text displayed when asking the user for an integer
     * @param lowerlimit the smallest allowable value, inclusive
     * @param upperlimit the largest allowable value, inclusive
     * @return the validated integer entered by the user
     * @throws IllegalArgumentException if the lower limit is greater than the upper limit
     */
    public static int getValueInteger(String prompt, int lowerlimit, int upperlimit) {
        if (lowerlimit > upperlimit) {
            throw new IllegalArgumentException("Lower limit cannot be greater than upper limit.");
        }
        while (true) {
            System.out.print(prompt);
            String input = SCANNER.nextLine();

            try {
                int value = Integer.parseInt(input.trim());

                if (value >= lowerlimit && value <= upperlimit) {
                    return value;
                }
                System.out.println("the value is outside the allowable range:" + lowerlimit + " to" + upperlimit + "inclusive");
            } catch (NumberFormatException e) {
                System.out.println("Inappropriate input. Please enter a number.");
            }
        }

    }
}
