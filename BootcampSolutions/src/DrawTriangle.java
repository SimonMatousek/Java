import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input and
        // then draws a triangle of the specified height
        //
        // Example:
        //
        // Please enter the triangle height: 4
        // *
        // **
        // ***
        // ****
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the triangle height");
        int userInput = scanner.nextInt();
        draw(userInput);
    }

    public static void draw(int height) {
        // Write your code to draw the triangle here
        for (int i1 = 0; i1 < height; i1++) {

            for (int i2 = 0; i2 < i1+1; i2++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}