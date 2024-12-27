public class Factorial {
    public static void main(String[] args) {

//  Create the usual class wrapper (Factorial) and main method on your own

// - Create a function called `calculateFactorial()`
//   that returns the factorial of its input
//
// - Example: calculateFactorial(5) = 1 * 2 * 3 * 4 * 5 = 120
    int factorial = 5;
    calculateFactorial(factorial);
    }
    public static int calculateFactorial(int factorial) {
        int sum = 1;
        for (int i = 1; i < factorial; i++) {
            sum *= i;
            System.out.print(i + " * ");
        }
        System.out.print(factorial + " = " + sum * factorial);
        return factorial;
    }
}