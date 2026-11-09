package apps;

import java.util.Arrays;
import utils.ArrayUtils;
import utils.InputUtility;

public class GradeDuplicateRemoval {
    public static void main(String[]args) {
        int size = InputUtility.getValidInteger("How many grades? ");

        while (size < 0) {
            size = InputUtility.getValidInteger("please enter zero or a positive number:");
        }
        int[] grades = new int[size];

        for (int i = 0; i < grades.length; i++) {
            grades[i] = InputUtility.getValueInteger("Enter grade " + (i + 1) + " (0-100): ", 0, 100);
        }
        showResults("Your grades", grades);

        showResults("Repeated values ", new int[]{72, 65, 72, 90, 65});
        showResults("No duplicates", new int[]{55, 68, 81});
        showResults("Single value", new int[]{77});
        showResults("Empty array", new int[0]);
    }
    private static void showResults(String title, int[] grades){
        int[] grownResult = ArrayUtils.deduplicate(grades);
        int[] blankDeletedResult =ArrayUtils.filterDuplicates(grades);

        int[] sortedCopy = new int[grades.length];
        for(int i = 0; i < grades.length; i++) {
            sortedCopy[i] = grades[i];
        }
        Arrays.sort(sortedCopy);
        int[] sortedresult = ArrayUtils.sortedDeduplicate(sortedCopy);

        System.out.println("\n" + title);
        System.out.println("original:" + Arrays.toString(grades));

        System.out.println("Array Growth:" + Arrays.toString(grownResult));
        System.out.println("Duplicates removed:" +(grades.length - grownResult.length));

        System.out.println("Blank deletion:" + Arrays.toString(blankDeletedResult));
        System.out.println("sorted deduplicaticated:" + Arrays.toString(sortedresult));

        System.out.println("Duplicates removed:" +(sortedCopy.length - sortedresult.length));


    }
}

