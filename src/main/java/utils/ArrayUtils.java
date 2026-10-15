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
     * @param nums  the integer array to search
     * @param value the integer value to count
     * @return the number of times value appears in nums
     */
    public static int count(int[] nums, int value) {
        int frequency = 0;

        for (int num : nums) {
            if (num == value) {
                frequency++;
            }
        }
        return frequency;
    }

    /**
     * Returns the element that appears most frequently in an integer array
     *
     * @param nums the integer array to search
     * @return the most frequent element; if multiple elements share the highest
     * frequency, returns the one appearing first in the array
     * @throws IllegalArgumentException if nums is null or empty
     */
    public static int getMostFrequent(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("the array must not be null or empty.");
        }
        int mostFrequent = nums[0];
        int highestFrequency = count(nums, mostFrequent);

        for (int i = 1; i < nums.length; i++) {
            int frequency = count(nums, nums[i]);

            if (frequency > highestFrequency) {
                mostFrequent = nums[i];
                highestFrequency = frequency;
            }
        }
        return mostFrequent;
    }

    /**
     * Counts how many elements in an integer array are greater than a value.
     *
     * @param nums  the integer array to search
     * @param value the number to compare each array element agianst
     * @return the number of elements greater than value
     */
    public static int countGreater(int[] nums, int value) {
        int count = 0;

        for (int number : nums) {
            if (number > value) {
                count++;
            }
        }
        return count;
    }

    /**
     * Counts the elements in an integer array that are greater than its average.
     *
     * @param nums the integer array to check; it must not be empty
     * @return the number of elements greater than the array's average
     * @throws IllegalArgumentException if nums is empty
     */
    public static int countGreaterThanAverage(int[] nums) {
        double average = calcAverage(nums);
        int count = 0;

        for (int number : nums) {
            if (number > average) {
                count++;
            }
        }
        return count;
    }

    public static int[] grow(int[] nums) {
        int[] largerArray = new int[nums.length + 10];

        for (int i = 0; i < nums.length; i++) {
            largerArray[i] = nums[i];
        }

        return largerArray;
    }
    public static String[] resize(String[]text,int newSize) {
        String[] resizedArray = new String[newSize];
        int elementsToCopy = Math.min(text.length, newSize);

        for (int i = 0; i < elementsToCopy; i++) {
            resizedArray[i] = text[i];
        }
        return resizedArray;
    }

    /**
     * Combines two integers arrays into a new array without sorting the elements
     *
     * @param nums1 the first integer array
     * @param nums2 the second integer array
     * @return a new array containing all elements of nums1 followed by all elements of nums2
     */
    public static int[]merge(int[]nums1,int[]nums2) {
        int[] merged = new int[nums1.length + nums2.length];

        for (int i = 0; i < nums1.length; i++) {
            merged[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            merged[nums1.length + i] = nums2[i];
        }
        return merged;
    }
    /**
     * Merges two ascending integer arrays into one ascending array
     *
     * @param nums1 the first array, sorted in ascending order
     * @param nums2 the second array, sorted in ascending order
     * @return a new ascending array containing all elements from both arrays
     */
    public static int[] orderedMerge(int[] nums1, int[]nums2){
        int[] merged = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                merged[k] = nums1[i];
                i++;
            } else {
                merged[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i < nums1.length) {
            merged[k] = nums1[i];
            i++;
            k++;
        }
        while(j < nums2.length) {
            merged[k] = nums2[j];
            j++;
            k++;
        }
        return merged;

    }
    /**
     * Mergers two case-insensitively sorted string arrays into one sorted array
     *
     * @param text1 the first string array, sorted alphabetically
     * @param text2 the second string array, sorted alphabetically
     * @return a new array containing all strings in case-insensitive alphabetical order
     */
    public static String[]orderedMerge(String[]text1,String[]text2){
        String[]merged = new String[text1.length + text2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < text1.length && j < text2.length) {
            if (text1[i].compareToIgnoreCase(text2[j]) <= 0) {
                merged[k] = text1[i];
                i++;
            } else {
                merged[k] = text2[j];
                j++;
            }
            k++;
        }
        while(i < text1.length) {
            merged[k]= text1[i];
            i++;
            k++;
        }
        while(j < text2.length) {
            merged[k] = text2[j];
            j++;
            k++;
        }
        return merged;

    }
    /**
     * partitions the values into thoses greater than the pivot followed by those
     * less than or equal to the pivot, preserving their order within each group.
     *
     * @param nums the integer array to partition
     * @param pivot the value used to divide the array
     * @return a new array with values greater than the pivot first, followed by values less than or equal to the pivot
     * @throws IllegalArgumentException if nums is null
     */
    public static int[]partition(int [] nums, int pivot){
        if(nums == null) {
            throw new IllegalArgumentException("the array must not be null.");
        }
        int[]greaterBuffer = new int[nums.length];
        int[]lesserOrEqualBuffer = new int[nums.length];
        int greaterCount = 0;
        int lesserOrEqualCount = 0;

        for(int num : nums) {
            if (num > pivot) {
                greaterBuffer[greaterCount++] = num;
            } else {
                lesserOrEqualBuffer[lesserOrEqualCount++] = num;
            }
        }
        int[]greaterValues = new int [greaterCount];
        int[]lesserOrEqualValues = new int[lesserOrEqualCount];

        for(int i = 0; i < greaterCount; i ++ ) {
            greaterValues[i] = greaterBuffer[i];
        }
        for(int i = 0; i < lesserOrEqualCount; i++ ) {
            lesserOrEqualValues[i] = lesserOrEqualBuffer[i];
        }
        return merge(greaterValues, lesserOrEqualValues);
    }
}

