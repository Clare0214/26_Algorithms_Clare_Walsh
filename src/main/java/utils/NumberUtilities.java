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
}
