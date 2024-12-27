import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        Path filePath = Paths.get("/home/simon/IdeaProjects/FileIO/.idea/Files/countLines.txt");
        List<String> content = Arrays.asList("1","2","3","4");
        try {
            Files.write(filePath, content);
        } catch (IOException e) {
            System.out.println("Could not write File!");
        }
        System.out.println(countLines("countLines.txt"));
    }
    public static int countLines(String filename) {
        try {
            Path filepath = Paths.get("/home/simon/IdeaProjects/FileIO/.idea/Files/" + filename);
            List<String> list = Files.readAllLines(filepath);
            return list.size();
        } catch (IOException e) {
            return 0;
        }
    }
}
