import java.sql.SQLOutput;

public class SumDigits {
    public static void main(String[] args) {
        // Given a non-negative integer n, return the sum of its digits recursively
        // (without loops).
        //
        // Hint
        //
        // Mod (%) by 10 yields the rightmost digit (e.g. 126 % 10 is 6)
        //
        // Divide (/) by 10 removes the rightmost digit (e.g. 126 / 10 is 12).
        int number = 0;
        System.out.println(digitAdder(number));
    }
    public static int digitAdder(int n) {
        if (n <= 1) {
            return 0;
        }else {
            return n % 10 + digitAdder(n / 10);
        }
    }
}
