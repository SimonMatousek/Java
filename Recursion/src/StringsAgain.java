public class StringsAgain {
    public static void main(String[] args) {
        // Given a string, write a recursive (no loops) method which returns
        // a new string with the lowercase 'x' chars removed.
        String text = "xylophonexx";
        char toRemove = 'x';
        System.out.println(removeChar(text,toRemove));
    }
    public static String removeChar(String text, char x) {
        if (text.length() == 0) {
            return "";
        } else if (text.charAt(0) == x){
            return removeChar(text.substring(1), x);
        }
        return text.charAt(0) + removeChar(text.substring(1), x);
    }
}
