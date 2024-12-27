public class ReverseString {
    public static void main(String... args) {
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a string which is passed as parameter
        // The method should return the reversed string
        // Pass the `toBeReversed` variable to this method to check if it works well
        // At first, solve this task using the `charAt()` function
        // Try other solutions when you are done

        System.out.println(reverse(toBeReversed));
        System.out.println(reverse2(toBeReversed));
    }

    public static String reverse (String input) {
        StringBuilder inputChange = new StringBuilder(input);
        String output = "";
        for (int i = input.length()-1; i > - 1; i--  ) {
            output += inputChange.charAt(i);
        }
        return output;
    }

    public static StringBuilder reverse2 (String input) {
        StringBuilder inputChange = new StringBuilder(input);
        return inputChange.reverse();
    }


}
