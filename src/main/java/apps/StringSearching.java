package apps;

import java.util.Arrays;
import utils.InputUtility;
import utils.StringUtilities;
public class StringSearching {
    public static void main(String[] args) {
        int size = InputUtility.getValidInteger("Enter the size of the array: ");

        while (size < 0) {
            size = InputUtility.getValidInteger("Size cannot be negative. Enter the size again: ");
        }
        String[] text = new String[size];

        for (int i = 0; i < text.length; i++) {
            text[i] = InputUtility.getValidString("Enter text for position " + i + ": ");
        }
        System.out.println("Array:" + Arrays.toString(text));

        String value = InputUtility.getValidString("Enter the text to find: ");

        long startTime = System.nanoTime();
        int position = StringUtilities.linearSearch(text, value);
        long endTime = System.nanoTime();

        long timeTaken = endTime - startTime;
        System.out.println("Search time: " + timeTaken + " nanoseconds");

        if (position == -1) {
            System.out.println("\"" + value + "\" was not found.");
        } else {
            System.out.println("\"" + value + "\" was found at position " + position + ".");
        }
    }
}

