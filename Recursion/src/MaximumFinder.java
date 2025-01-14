import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MaximumFinder {
    public static void main(String[] args) {
        // Write a function which returns the largest element of an array using recursion.
        int[] numbers = {3,2,8,6,7};
        int size = numbers.length;
        System.out.println(maxElement(numbers, size));
    }
    public static Integer maxElement(int []numbers, int size) {
        if(size == 1) {
            return numbers[0];
        }   else {
            if (numbers[0] < numbers[size - 1]) {
                numbers[0] = numbers[size - 1];
            }
            return maxElement(numbers, size - 1);
        }
    }
}
