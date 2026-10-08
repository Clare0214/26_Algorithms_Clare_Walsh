package apps;

import utils.ArrayUtils;
import utils.InputUtility;

/**
 * Collects words, grow the array when needed, and copies the words to keep.
 */

public class WordArrayManager {
    /**
     * Runs the program
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        String[] words = new String[10];
        int wordCount = 0;
        String answer;

        while (true) {
            answer = InputUtility.getValidString("Would you like to enter a word?(yes/no):").trim();

            while (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no")) {
                System.out.println("please enter yes or no");
                answer = InputUtility.getValidString("would you like to enter a word?(yes/ no): ").trim();
            }
            if (answer.equalsIgnoreCase("no")) {
                break;
            }
            if (wordCount == words.length) {
                words = ArrayUtils.resize(words, words.length + 10);
            }
            words[wordCount] = InputUtility.getValidString("Enter a word: ");
            wordCount++;
        }
        System.out.println("words entered:");
        for (int i = 0; i < wordCount; i++) {
            System.out.println((i + 1) + ". " + words[i]);
        }
        int wordsToKeep = InputUtility.getValidInteger("How many words you to keep?", 0, wordCount);

        String[] keptWords = ArrayUtils.resize(words, wordsToKeep);

        System.out.println("words kept:");
        for (int i = 0; i < keptWords.length; i++) {
            System.out.println((i + 1) + ". " + keptWords[i]);
        }
    }
}
