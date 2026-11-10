package apps;

import java.util.Arrays;
import utils.InputUtility;
import utils.NumberUtilities;

public class NumericSearching {
    public static void main(String[]args) {
        int size = InputUtility.getValidInteger("Enter the size of the array: ");

        while (size < 0) {
            size = InputUtility.getValidInteger("Size cannot be negative. Enter the size again: ");
        }
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = InputUtility.getValidInteger("Enter number " + (i + 1) + ": ");
        }
        System.out.println("Array: " + Arrays.toString(numbers));

        int value = InputUtility.getValidInteger("Enter the value to find: ");

        long startTime = System.nanoTime();
        int position = NumberUtilities.linearSearch(numbers, value);
        long endTime = System.nanoTime();

        long timeTaken = endTime - startTime;
        System.out.println("search time: " + timeTaken + "nanoseconds");

        if (position == -1) {
            System.out.println(value + " was not found in the array.");
        } else {
            System.out.println(value + " was last found at position " + position + ".");
        }
    }
}
