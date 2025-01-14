public class ReverseList {
    public static void main(String[] args) {
        // - Create an array variable named `numbers`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements of `numbers` programmatically
        // - Print the elements of the reversed `numbers`:
        //   [7, 6, 5, 4, 3]
    int[] number = {3,4,5,6,7};

        for(int i = 0; i < number.length / 2; i++)
        {
            int temp = number[i];
            number[i] = number[number.length - i - 1];
            number[number.length - i - 1] = temp;
        }
    for (int i = 0; i < number.length; i++) {
        System.out.print(number[i] + ", ");
    }

    }
}
