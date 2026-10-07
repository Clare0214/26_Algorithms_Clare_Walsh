package utils;

/**
 * Reads integers and displays the largest value.
 */
public class CalMax {

    /**
     * Finds the largest of three integers.
     *
     * @param firstNumber the first integer to compare
     * @param secondNumber the second integer to compare
     * @param thirdNumber the third integer to compare
     * @return the largest of the three integers
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
     * Finds the largest integer in an array.
     *
     * @param numbers the array of integers to search; it must not be empty
     * @return the largest integer in the array
     * @throws IllegalArgumentException if the array is null or empty
     */
    public static int findMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("The array must not be null or empty.");
        }

        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        return largest;
    }

    /**
     * Reads three integers and displays the largest.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        int num1 = InputUtility.getValidInteger("Please enter the first integer: ", 1, Integer.MAX_VALUE);
        int num2 = InputUtility.getValidInteger("Please enter the second integer: ", 1, Integer.MAX_VALUE);
        int num3 = InputUtility.getValidInteger("Please enter the third integer: ", 1, Integer.MAX_VALUE);

        int highestNumber = findMax(num1, num2, num3);
        System.out.println("The highest number is: " + highestNumber);
    }
}