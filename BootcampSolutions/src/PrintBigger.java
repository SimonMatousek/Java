import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one.
        // If they are equal, it prints the second one.
        //
        // Example
        //
        // Please enter a number: 5
        // Please enter a number: 13
        // 13
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int userInput1 = scanner.nextInt();
        System.out.println("Please enter a number");
        int userInput2 = scanner.nextInt();
        if (userInput1 > userInput2){
            System.out.println(userInput1);
        } else if (userInput1 < userInput2) {
            System.out.println(userInput2);
        } else if (userInput1 == userInput2) {
            System.out.println(userInput2);
        }
    }
}
