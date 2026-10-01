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
    public static void  displayArray(int[]numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("position" + i + ": " + numbers[i]);
        }
    }
        /**
         * prints each string array element along with index
         *
         * @param values the string array whose element will be display
         */
        public static void displayArray(String[]values) {
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
    public static double calcAverage(int[]numbers){
        if(numbers.length == 0) {
            throw new IllegalArgumentException("The array must not be empty.");
        }
        long sum = 0;

        for(int number: numbers ) {
            sum += number;
        }
        return (double) sum / numbers.length;

}
    
}
