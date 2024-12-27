import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {
        Path filePath  = Paths.get("/home/simon/IdeaProjects/FileIO/.idea/Files/writeSingleLine.txt");
        List<String> content = Arrays.asList("1","2","3","4");
        try {
            Files.write(filePath, content);
        } catch (IOException e) {
            System.out.println("Could not write the file");
        } catch (Exception e) {
            System.out.println("Unknown Error");
        }
        try {
            List<String> list = Files.readAllLines(filePath);
            list.add("Simon");
            Files.write(filePath, list);
            System.out.println(Files.readAllLines(filePath));
        } catch (IOException e) {
            System.out.println("could not manipulate File");
        }
    }
}
