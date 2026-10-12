package apps;

import utils.ArrayUtils;
import utils.InputUtility;

/**
 * Reads two groups of numbers, merges them, and displays the result.
 */
public class NumberMerging {

    /**
     * Runs the program.
     *
     * @params args command-line arguments
     */
    public static void main(String[] args) {
        int[] nums1 = new int[5];
        int[] nums2 = new int[5];

        System.out.println("Enter the first 5 number:");
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = InputUtility.getValidInteger("Number " + (i + 1) + ": ");
        }
        System.out.println("Enter the next 5 numbers: ");
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = InputUtility.getValidInteger("Number " + (i + 1) + ": ");

        }
        int[] merged = ArrayUtils.merge(nums1, nums2);

        System.out.println("Merged numbers:");
        for (int i = 0; i < merged.length; i++) {
            System.out.println("Position " + i + ": " + merged[i]);
        }
    }

}
