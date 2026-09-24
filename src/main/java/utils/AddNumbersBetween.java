package utils;
import java.util.Scanner;

/**
 * Adds all interger values between two numbers, including both endpoints.
 */
public class AddNumbersBetween {
    /**
     * Starts the program
     *
     * @param args command-line arguments
     */
 public static void main(String[]args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter the first number:");
     int firstNumber = scanner.nextInt();

     System.out.print("Enter the second number:");
     int secondNumber = scanner.nextInt();

     int smallest = Math.min(firstNumber, secondNumber);
     int largest = Math.max(firstNumber, secondNumber);

     int sum = 0;

     for (int number = smallest; number <= largest; number++) {
         sum += number;
     }
     System.out.println("sum:" + sum);

     scanner.close();
 }
}
