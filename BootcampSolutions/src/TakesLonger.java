public class TakesLonger {
    public static void main(String... args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occurred. Please fix it!
        // Insert the words "always takes longer than" between the words "It" and "you" using the StringBuilder class!

        StringBuilder quoteChange = new StringBuilder(quote);
        System.out.println(quote.indexOf("y"));
        quoteChange.insert(21,"always takes longer than ");
        System.out.println(quoteChange);
    }
}