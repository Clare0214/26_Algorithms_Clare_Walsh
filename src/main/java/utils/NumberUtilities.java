package utils;

public class NumberUtilities {
    public static int[] filter(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("the array must not be null");
        }

        int[] filtered = nums.clone();
        boolean[] isBlank = new boolean[filtered.length];

        //Mark duplicate entries as blank
        for (int i = 0; i < filtered.length; i++) {
            for (int j = 0; j < i; j++) {
                if (!isBlank[j] && filtered[i] == filtered[j]) {
                    isBlank[i] = true;
                    break;
                }
            }
        }
        //count the entries that are not blank
        int remainingCount = 0;
        for (boolean blank : isBlank) {
            if (!blank) {
                remainingCount++;
            }
        }
        //copy non-blank entries into a correctly sized array
        int[] result = new int[remainingCount];
        int resultIndex = 0;

        for (int i = 0; i < filtered.length; i++) {
            if (!isBlank[i]) {
                result[resultIndex] = filtered[i];
                resultIndex++;
            }
        }
        return result;
    }

    public static int[] sortedDeduplicate(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("The array must not be null.");
        }
        if (nums.length == 0) {
            return new int[0];
        }
        int uniqueCount = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                uniqueCount++;
            }
        }
        int[] result = new int[uniqueCount];
        result[0] = nums[0];

        int resultIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                result[resultIndex] = nums[i];
                resultIndex++;
            }
        }
        return result;
    }
    //Searching for Data in Unsorted Arrays – Standard Linear Search

    /**
     * Searches the array for a value and returns its last position
     *
     * @param nums  the to search
     * @param value the value to locate
     * @return the last position of value, or -1 if ir is not found
     */
    //Searching for data in a numeric array using standard linear search
    public static int linearSearch(int[] nums, int value) {
        int position = -1;
        int iterations = 0;

        for (int i = 0; i < nums.length; i++) {
            iterations++;

            if (nums[i] == value) {
                position = i;
            }
        }
        System.out.println("Number of iterations:" + iterations);
        return position;
    }
}

