package utils;
import java.util.Scanner;
/**
 * reads numbers until -1 is entered, then displays their sum and average
 */

public class SumandAverage {
/**
 * start the program
 *
 * @param args command-line arguments
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double sum = 0;
    int count = 0;
    double number;
    System.out.println("Enter numbers (-1 to stop):");

    do {
        number = scanner.nextDouble();

        if (number != -1) {
            sum += number;
            count++;
        }
    } while (number != -1);
    System.out.println("Sum: " + sum);

    if (count > 0) {
        double average = sum / count;
        System.out.println("Average: " + average);
    } else {
        System.out.println("Average: No numbers were entered.");
    }
    scanner.close();
}


}
