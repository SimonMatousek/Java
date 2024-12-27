import java.util.Scanner;

public class DrawChessTable {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input and
        // then draws a chess table of the specified size
        //
        // Example:
        //
        // Please enter the chess table size: 8
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the chess table size: ");
        int userInput = scanner.nextInt();
        draw(userInput);

    }

    public static void draw(int size){
        // Write your code to draw the chess table here



    }
}
