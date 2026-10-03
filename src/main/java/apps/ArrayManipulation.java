package apps;
import utils.ArrayUtils;
import utils.InputUtility;

/**
 * Reads ten grades and displays their average as the GPA
 */
public class ArrayManipulation {
    /**
     * Runs the program
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        int[] grades = new int[10];

        for (int i = 0; i < grades.length; i++) {
            grades[i] = InputUtility.getValidInteger("Enter grade" + (i + 1) + ":");

        }
        double gpa = ArrayUtils.calcAverage(grades);
        System.out.println("GPA (average grade):" + gpa);

    }

}
