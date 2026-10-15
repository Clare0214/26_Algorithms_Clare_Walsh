package apps;

import java.util.Arrays;
import utils.ArrayUtils;
import utils.InputUtility;

/**
 * Reads two groups of words,sorts and merges them, then displays the result.
 */
public class StringMerging {
    /**
     * Runs the program
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        String[] text1 = new String[5];
        String[] text2 = new String[5];

        System.out.println("Enter the first 5 words");
        for (int i = 0; i < text1.length; i++) {
            text1[i] = InputUtility.getValidString("Word" + (i + 1) + ":");
        }
        System.out.println("Enter the next 5 words:");
        for (int i = 0; i < text2.length; i++) {
            text2[i] = InputUtility.getValidString("word " + (i + 1) + ":");
        }
        Arrays.sort(text1, String.CASE_INSENSITIVE_ORDER);
        Arrays.sort(text2, String.CASE_INSENSITIVE_ORDER);

        String[] merged = ArrayUtils.orderedMerge(text1, text2);

        System.out.println("words in alphabetical order:");
        for (int i = 0; i < merged.length; i++) {
            System.out.print("position " + i + ": " + merged[i]);
        }
    }
}
