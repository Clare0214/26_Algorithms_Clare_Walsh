package apps;

import utils.InputUtility;
import utils.StringUtilities;

/**
 * Reads a sentence, removes repeated words and displays the result
 */
public class StringDuplicateRemoval {
    public static void main(String[]args){
        String text = InputUtility.getValidString("Enter a line of text:");
        String trimmedText = text.trim();

        String[]words;
        if(trimmedText.isEmpty()) {
            words = new String[0];
        }else {
            words = trimmedText.split("\\s+");
        }
        String[] uniqueWords = StringUtilities.deduplicate(words);

        System.out.println("Text without duplicate words: " + String.join("",uniqueWords));
    }
}
