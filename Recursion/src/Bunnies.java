public class Bunnies {
    public static void main(String[] args) {
        // We have a number of bunnies and each bunny has two big floppy ears. Write
        // a recursive method (no loops or multiplication) which takes the number of
        // bunnies as its sole parameter and returns the total number of ears
        // the bunnies have. The method should be able to handle invalid input
        // (e.g. negative numbers)
        int number = 50;
        System.out.println(bunnieEars(number));
    }
    public static int bunnieEars(int n) {
        if (n == 0) {
            return 0;
        } else  if (n <= 1) {
            return 2;
        } else {
            return 2 + bunnieEars(n - 1);
        }
    }
}
