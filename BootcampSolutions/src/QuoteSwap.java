import java.util.*;

public class QuoteSwap {
    public static void main(String... args) {

        List<String> list = Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand.");

        // Accidentally I messed up this quote from Richard Feynman
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // To do this: create a method called "swapQuote()"
        // it should return a sentence formed from the words separated by a single space

        // Expected output: "What I cannot create, I do not understand."
        System.out.print(swapQuote(list));
    }
    public static List<String> swapQuote(List<String> list){
        Collections.swap(list,2,5);
        return list;
    }
}