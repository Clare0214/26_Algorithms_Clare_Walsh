package apps;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import utils.InputUtility;
import utils.NumberUtilities;

/**
 * Reads numbers into an array, removes duplicates, and reports how many removed
 */
public class NumberDuplicateRemoval {
    /**
     * Runs the program
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        int size = InputUtility.getValidInteger("Enter the size of the array: ");

        while (size < 0) {
            size = InputUtility.getValidInteger("Size cannot be negative enter the size agian: ");
        }

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = InputUtility.getValidInteger("Enter Number" + (i + 1) + ":");
        }
        System.out.println("Original array:" + Arrays.toString(numbers));

        int[] uniqueNumbers = NumberUtilities.filter(numbers);

        System.out.println("Array with duplicates removed:" + Arrays.toString(uniqueNumbers));
        System.out.println("number of duplicates removed:" + (numbers.length - uniqueNumbers.length));

        String fileName = InputUtility.getValidString("Enter the name or path of a file containing numbers: ");
        int[] fileNumbers = new int[0];

        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNext()) {
                if (!fileScanner.hasNextInt()) {
                    System.out.println("The file contains a non-integer value: " + fileScanner.next());
                    return;
                }
                int number = fileScanner.nextInt();
                int[] largerArray = new int[fileNumbers.length + 1];

                for (int i = 0; i < fileNumbers.length; i++) {
                    largerArray[i] = fileNumbers[i];
                }
                largerArray[fileNumbers.length] = number;
                fileNumbers = largerArray;
            }
        } catch (FileNotFoundException exception) {
            System.out.println("could not find the file:" + fileName);
            return;
        }

        Arrays.sort(fileNumbers);
        int[] uniqueFileNumber = NumberUtilities.sortedDeduplicate(fileNumbers);

        System.out.println("Sorted numbers from file:" + Arrays.toString(fileNumbers));
        System.out.println("Numbers without duplicates: " + Arrays.toString(uniqueFileNumber));
        System.out.println("Duplicates removed:" + (fileNumbers.length - uniqueFileNumber.length));
    }
}
