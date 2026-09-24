package utils;
import java.util.Scanner;
public class CalMax {
    private static final Scanner SCANNER = new Scanner(System.in);

    /**
     * Prompts the user until they enter a valid integer
     *
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
    public static void main(String[]args){
        int number = getValidInteger("Enter an integer:");
        System.out.println("You entered:" + number);
    }

}
