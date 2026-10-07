package apps;
import utils.ArrayUtils;
import utils.InputUtility;

/**
 * Reads numbers into an array,growing it when the user want the user want to add more.
 */

public class AddNumbersToArray {
    /**
     * Runs the programs.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        int size = InputUtility.getValidInteger("How many numbers should the array initially hold? ",1, Integer.MAX_VALUE);

        int[] numbers = new int[size];
        int numberCount = 0;

        while (true) {
            while (numberCount < numbers.length) {
                numbers[numberCount] = InputUtility.getValidInteger("Enter number " + (numberCount + 1) + ": ", 1, Integer.MAX_VALUE);
                numberCount++;
            }
            String answer;
            while (true) {
                answer = InputUtility.getValidString("The array is full. would you like to add more numbers? (yes/no):").trim();

                if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")) {
                    break;
                }
                System.out.println("Please enter yes or no.");
            }
            if (answer.equalsIgnoreCase("no")) {
                break;
            }
            numbers = ArrayUtils.grow(numbers);
        }
        System.out.println("numbers entered:");
        for (int i = 0; i < numberCount; i++) {
            System.out.println((i + 1) + "." + numbers[i]);
        }
    }
}

