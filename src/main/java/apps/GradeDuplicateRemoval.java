package apps;

import java.util.Arrays;
import utils.ArrayUtils;
import utils.InputUtility;

public class GradeDuplicateRemoval {
    public static void main(String[]args){
        int size = InputUtility.getValidInteger("How many grades? ");

        while(size < 0 ) {
            size = InputUtility.getValidInteger("please enter zero or a positive number:");
        }
        int[] grades = new int[size];

        for (int i = 0; i < grades.length; i++){
            grades[i] = InputUtility.getValueInteger("Enter grade " + (i + 1) + " (0-100): ", 0, 100);
    }

}

