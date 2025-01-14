import java.util.HashMap;

public class CountLetters {
    public HashMap<String,Integer> countLetters(String text) {
        HashMap<String,Integer> countTheLetters = new HashMap<>();
        String[] splited = text.split("");
        for (int i = 0; i < splited.length; i++) {
            if (countTheLetters.containsKey(splited[i])) {
                countTheLetters.replace(splited[i], countTheLetters.get(splited[i]) + 1);
            } else {
                countTheLetters.put(splited[i], 1);
            }
        }
        return countTheLetters;
    }
}
