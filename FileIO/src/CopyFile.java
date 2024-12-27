import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class CopyFile {
    // Write a `copy` function that copies the contents of a file into another file.
    // The function should take two filenames (strings) as parameters:
    //  - path and name of the source file
    //  - path and name of the target file
    // It should return a boolean that shows whether the copy was successful or not.
    public static void main(String[] args) {
        Path copyFileOriginal = Paths.get("/home/simon/IdeaProjects/FileIO/.idea/Files/copyFileOriginal");
        Path copyFileTarget = Paths.get("/home/simon/IdeaProjects/FileIO/.idea/Files/copyFileTarget");
        List<String> content = Arrays.asList("Duck1", "Duck2", "Duck3", "Duck4", "Duck5");
        try {
            Files.write(copyFileOriginal, content);
        } catch (IOException e) {
            System.out.println("You have failed");
        }
        copy("copyFileOriginal", "copyFileTarget");
    }
    public static void copy(String original, String target) {
        Boolean didItWork = false;
        try {
            List<String> sourceAsList = Files.readAllLines(Paths.get("/home/simon/IdeaProjects/FileIO/.idea/Files/" + original));
            List<String> targetAsList = Files.readAllLines(Paths.get("/home/simon/IdeaProjects/FileIO/.idea/Files/" + target));
            for (String Oneline: sourceAsList) {
                targetAsList.add(Oneline);
            }
            Files.write(Paths.get("/home/simon/IdeaProjects/FileIO/.idea/Files/" + target), targetAsList);
            System.out.println(didItWork = true);
        } catch (IOException e) {
            System.out.println("Could not read Files or get Path");
            System.out.println(didItWork);
        }
    }
}
