import java.util.Arrays;
import java.util.Comparator;

public class SwapElements {
    public static void main(String[] args) {
        // - Create an array variable named `orders`
        //   with the following content: `["first", "second", "third"]`
        // - Swap the first and the third element of `orders` programmatically
        // - Print the swapped array into the console:
        //   [third, second, first]
    String[] orders = {"first", "second", "third"};
    //print the list in another way
    Arrays.sort(orders, 0,orders.length, Comparator.comparing(String::toString).reversed());
        for (int i = 0; i < orders.length; i++) {
            System.out.print(" " + orders[i] + " ");
        }
    }
}
