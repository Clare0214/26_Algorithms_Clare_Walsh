package apps;

import utils.ArrayUtils;
import utils.InputUtility;

/**
 * Reads ten names and partitions them using a names supplied as the pivot.
 */

public class StringPartitioning {
    /**
     * Runs the program
     *
     * @param args command-line arguments
     */
    public static void main(String[]args) {
        String[] names = new String[10];

        for (int i = 0; i < names.length; i++) {
            names[i] = InputUtility.getValidString("Enter name " + (i + 1) + ":");

        }
        String pivot = InputUtility.getValidString("Enter the pivot name: ");
        String[] partitionedNames = ArrayUtils.partition(names, pivot);

        System.out.println("names in partitioned order");
        for (int i = 0; i < partitionedNames.length; i++) {
            System.out.println("position" + i + ":" + partitionedNames[i]);
        }
    }
}
