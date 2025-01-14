public class Strings {
    public static void main(String[] args) {
        // Given a string, write a recursive (no loops) method which returns
        // a new string with the lowercase 'x' chars changed to 'y' chars.

        String word = "xylophone";
        System.out.println(changeChar(word));
    }
    public static String changeChar(String word) {
        if (!word.contains("x")) {
            return word;
        } else {
            return changeChar(word.replace("x","y"));
        }
    }
}
