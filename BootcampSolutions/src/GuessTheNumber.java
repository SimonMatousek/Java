import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int storedNumber = 8;
        // Write a program that stores a number and the user has to figure it out.
        // The user can input guesses. After each guess the program responds
        // with a message indicating whether the stored number is smaller or
        // greater than the guess.
        // The program ends (exits) when the user finds the stored number
        //
        // Example:
        //
        // Please enter your guess: 3
        // The stored number is greater than 3
        // Please enter your guess: 10
        // The stored number is smaller than 10
        // Please enter your guess: 8
        // You have found the stored number 8
        //

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your guess: ");
        int userInput = scanner.nextInt();
        while (storedNumber != userInput) {
            if (storedNumber < userInput) {
                System.out.println("The stored number is smaller than " +userInput);
            } else if (storedNumber > userInput) {
                System.out.println("The stored number is greater than " +userInput);
            }
            System.out.print("Please enter your guess: ");
            userInput= scanner.nextInt();
        }
        if (storedNumber == userInput) {
            System.out.println("You have found the stored number " +userInput);
        }
    }
}