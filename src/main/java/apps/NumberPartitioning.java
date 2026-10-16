package apps;

import utils.ArrayUtils;
import utils.InputUtility;

/**
 * reads ten grades, groups passing grades first, and displays the pass count.
 */
public class NumberPartitioning {
    /**
     * Runs the program
     *
     * @param args command-line arguments
     */
    public static void main(String[] args ) {
        int[] grades = new int[10];

        for (int i = 0; i < grades.length; i++) {
            grades[i] = InputUtility.getValidInteger("enter grade" + (i + 1) + ":");
        }
        int passPivot = 39;
        int[] paritionedGrades = ArrayUtils.partition(grades, passPivot);

        System.out.println("grades in partition order:");
        for (int i = 0; i < paritionedGrades.length; i++) {
            System.out.println("Position " + i + ": " + paritionedGrades[i]);
        }
        int lastPassingSlot = -1;
        for (int i = 0; i < paritionedGrades.length; i++) {
            if (paritionedGrades[i] > passPivot) {
                lastPassingSlot = i;
            } else {
                break;
            }
        }
        int passedCount = lastPassingSlot + 1;
        System.out.println("Number of subjects passed: " + passedCount);
    }

}
