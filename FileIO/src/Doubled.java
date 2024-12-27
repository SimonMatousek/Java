import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class Doubled {

    public static void main(String[] args) {
        // Create a method called `decryptDoubled` that takes a filename string
        // as a parameter and decrypts the file's content.
        // Decryption is the process reversing an encryption, i.e. the process
        // which converts encrypted data into its original form.
        // If the file can't be opened it should print this message: "File not found"
        // The (decrypted) result should be saved in the "output.txt" file (don't change the path).
        // Change the path of the duplicated-chars.txt source file to the path
        // where you saved it on your computer.
        // You can find the source file in a link next to this exercise.
        Path filePath = Paths.get("/home/simon/IdeaProjects/FileIO/.idea/Files/outputDuplicated-chars.txt");
        Path filePathOriginal = Paths.get("/home/simon/IdeaProjects/FileIO/originalFiles/duplicated-chars.txt");
        try {
            List<String> content = (Files.readAllLines(filePathOriginal));
            Files.write(filePath, content);
        } catch (Exception e) {
            System.out.println("I'm confused");
        }
        decryptDoubled("/home/simon/IdeaProjects/FileIO/.idea/Files/outputDuplicated-chars.txt");
    }
    public static void decryptDoubled(String filename) {
        try {
            List<String> content = Files.readAllLines(Paths.get(filename));
            for (int i = 0; i < content.size(); i++) {
                String[] characters = content.get(i).split("");
                String EndofLine = "";
                for (int j = 0; j < characters.length; j ++) {
                    if (j % 2 == 0) {
                        EndofLine += characters[j];
                    }
                }
                content.set(i, EndofLine);
            }
            Files.write(Paths.get(filename), content);
            System.out.println(Files.readAllLines(Paths.get(filename)));
        } catch (Exception e) {
            System.out.println("decryptDoubled failed");
        }
    }
}
