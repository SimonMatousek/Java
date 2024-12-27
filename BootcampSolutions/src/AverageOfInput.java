import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program prompts the user for 5 integers in a row,
        // then it prints their sum and their average:
        //
        // Please enter a number: 3
        // Please enter a number: 7
        // Please enter a number: 1
        // Please enter a number: 6
        // Please enter a number: 5
        // Sum: 22, Average: 4.4
        //
        Scanner scanner= new Scanner(System.in);
        int sum =0;
        int[] number = new int[5];
        for (int i = 0; i<number.length; i++){
            System.out.println("Please enter a number:");
            number[1] = scanner.nextInt();
            sum += number[1];
        }
        System.out.println("Sum:" + sum + ",Average:" + (float) sum/ number.length);
    }
}
