public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a program which prints the multiplication table for a specified
        // number
        //
        // Example:
        // The number 15 should print:
        //
        // 1 * 15 = 15
        // 2 * 15 = 30
        // 3 * 15 = 45
        // 4 * 15 = 60
        // 5 * 15 = 75
        // 6 * 15 = 90
        // 7 * 15 = 105
        // 8 * 15 = 120
        // 9 * 15 = 135
        // 10 * 15 = 150
        print(15);
    }

    public static void print(int number) {
        // write your code here for printing the table
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+ "*" +number+ "=" +i * number);
        }
    }
}
