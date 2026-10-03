package apps;
import utils.ArrayUtils;
import utils.InputUtility;

/**
 * Reads ten grades and displays their average as the GPA
 */
public class ArrayManipulation {
    /**
     * Reads ten grades and then ten pieces of text, then displays the average,
     * highest grade, and text that comes last alphabetically.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        int[] grades = new int[10];

        for (int i = 0; i < grades.length; i++) {
            grades[i] = InputUtility.getValidInteger("Enter grade" + (i + 1) + ":");

        }
        System.out.println("GPA(average grade):" + ArrayUtils.calcAverage(grades));
        System.out.println("Higest grade:"+ ArrayUtils.findMax(grades));
        System.out.println("Lowest grade:" + ArrayUtils.findMin(grades));

        String[]words = new String[10];

        for(int i = 0; i < words.length; i++) {
            words[i] = InputUtility.getValidString("Enter text" + (i + 1) + ":");
        }
        System.out.println("First alphabetically"+ ArrayUtils.findMin(words));
        System.out.println("Last alphabetically: " +ArrayUtils.findMax(words));
    }

}
