package apps;

import java.util.Arrays;
import utils.ArrayUtils;
import utils.InputUtility;

/**
 * Reads numbers into an array, removes duplicates, and reports how many removed
 */
public class NumberDuplicateRemoval {
    /**
     * Runs the program
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        int size = InputUtility.getValidInteger("Enter the size of the array: ");

        while (size < 0) {
            size = InputUtility.getValidInteger("Size cannot be negative enter the size agian: ");
        }

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = InputUtility.getValidInteger("Enter Number" + (i + 1) + ":");
        }
        System.out.println("Original array:" + Arrays.toString(numbers));

        int[] uniqueNumbers = ArrayUtils.deduplicate(numbers);

        System.out.println("Array with duplicates removed:" + Arrays.toString(uniqueNumbers));
        System.out.println("number of duplicates removed:" + (numbers.length - uniqueNumbers.length));
    }
}


