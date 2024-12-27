import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input.
        // Next, the program will prompt the user to enter as many numbers
        // as the value of the first number the user entered.
        // Once the user enters all numbers the program will print
        // their sum and average.
        //
        // Example:
        //
        // How many numbers would you like to enter: 6
        // Enter number 1 of 6: 2
        // Enter number 2 of 6: 3
        // Enter number 3 of 6: 7
        // Enter number 4 of 6: 9
        // Enter number 5 of 6: 11
        // Enter number 6 of 6: 0
        // Sum: 32, Average: 5.333333333333333
        //
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        System.out.println("How many numbers would you like to enter:");
        int userInput1 = scanner.nextInt();
        for (int i = 1; i <= userInput1; i++) {
            System.out.println("Enter number " +i+ " of " + userInput1);
            int userInput2 = scanner.nextInt();
            a += userInput2;
        }
        System.out.println("Sum: " +a+ " Average: " +a/userInput1);
    }
}