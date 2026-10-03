package utils;

/**
 * Provides utility methods for working with arrays
 */
public class ArrayUtils {
    /**
     * prints each element along with its index
     *
     * @param numbers the integer array whose elements will be displayed
     */
    public static void displayArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("position" + i + ": " + numbers[i]);
        }
    }

    /**
     * prints each string array element along with index
     *
     * @param values the string array whose element will be display
     */
    public static void displayArray(String[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.println("Position " + i + ": " + values[i]);
        }
    }

    /**
     * Calculates the average of the integers in an array
     *
     * @param numbers the integer array to average; it must not be empty
     * @return the average of the array's elements
     * @throws IllegalArgumentException if the array is empty
     */
    public static double calcAverage(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("The array must not be empty.");
        }
        long sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;


    }

    /**
     * Finds the largest integer in an array
     *
     * @param numbers the integer array to search; it must not be empty
     * @return the largest integer in the array
     * @throws IllegalArgumentException if the array is empty
     */
    public static int findMax(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("The array must not by empty");
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
     * finds the string that comes last alphabetically in an array, ignoring case.
     *
     * @param words the string array to search
     * @return the string that comes last alphabetically
     * @throws IllegalArgumentException if the array is null, empty or contains null
     */
    public static String findMax(String[] words) {
        if (words == null || words.length == 0) {
            throw new IllegalArgumentException("the array must not be null or empty");
        }
        if (words[0] == null) {
            throw new IllegalArgumentException("the array must not contain null.");
        }
        String last = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i] == null) {
                throw new IllegalArgumentException("the array must not contain null");
            }
            if (words[i].compareToIgnoreCase(last) > 0) {
                last = words[i];
            }
        }
        return last;
    }

    /**
     * Finds the smallest integer in an array
     *
     * @param numbers the integer array to search
     * @return the smallest integer in the array
     * @throws IllegalArgumentException if the array is null or empty
     */
    public static int findMin(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("the array must not be null or empty");
        }
        int smallest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    /**
     * Finds the string that comes first alphabetically in an array, ignoring case.
     *
     * @param words the string array to search
     * @return the string that comes first alphabetically
     * @throws IllegalArgumentException if the array is null,empty or contains null
     */
    public static String findMin(String[] words) {
        if (words == null || words.length == 0) {
            throw new IllegalArgumentException("The array must not be null or empty ");
        }
        if (words[0] == null) {
            throw new IllegalArgumentException("the array must not contain null");
        }
        String first = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i] == null) {
                throw new IllegalArgumentException(" the array must not contain null ");
            }
            if (words[i].compareToIgnoreCase(first) < 0) {
                first = words[i];
            }
        }
        return first;
    }
    /**
     * Counts how many times a value appears in an integer array
     *
     * @param nums the integer array to search
     * @param value the integer value to count
     * @return the number of times value appears in nums
     */
    public static int count(int[]nums, int value){
        int frequency = 0;

        for(int num: nums) {
            if (num == value) {
                frequency++;
            }
        }
        return frequency;
    }
}