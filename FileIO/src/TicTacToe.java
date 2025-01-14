import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;


public class TicTacToe {
    public static void main(String[] args) {
        // Write a method `calculateTicTacResult` which takes a filename as a parameter,
        // and returns "X", "O" or "Draw" based on the input file's content
        // The file contains a finished Tic-Tac-Toe match
        // See the examples in draw.txt, win-x.txt, win-o.txt

        System.out.println(calculateTicTacResult("/home/simon/IdeaProjects/FileIO/outputFiles/win-o.txt"));
        // Should print "O"

        System.out.println(calculateTicTacResult("/home/simon/IdeaProjects/FileIO/outputFiles/win-x.txt"));
        // Should print "X"

        System.out.println(calculateTicTacResult("/home/simon/IdeaProjects/FileIO/outputFiles/words.txt"));
        // Should print "Draw"
    }
    public static String calculateTicTacResult(String fileName) {
        try {
            List<String> content = Files.readAllLines(Paths.get(fileName));
            String aString = content.toString();
            char[] aChar = aString.toCharArray();
            int x = 0;
            int o = 0;
            for (char temp : aChar) {
                if (Objects.equals(aChar,"X")) {
                    x++;
                } else {
                    o ++;
                }
            }
            if (x > o) {
                System.out.println("X");
            } else if (x < o) {
                System.out.println("O");
            } else {
                System.out.println("Draw");
            }
        } catch (Exception e) {
            System.out.println("Help");
        }
        return "";
    }
}
