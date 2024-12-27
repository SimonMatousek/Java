import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReversedOrder {
    public static void main(String[] args)  {
        // Create a method called `decryptReversed` that takes a filename string
        // as a parameter and decrypts the file's content.
        // Decryption is the process reversing an encryption, i.e. the process
        // which converts encrypted data into its original form.
        // If the file can't be opened it should print this message: "File not found"
        // The (decrypted) result should be saved in the "output.txt" file (don't change the path).
        // Change the path of the reversed-order.txt source file to the path
        // where you saved it on your computer.
        // You can find the source file in a link next to this exercise.
        Path filepathOriginal = Paths.get("/home/simon/IdeaProjects/FileIO/originalFiles/reversed-order.txt");
        Path filepathOutput = Paths.get("/home/simon/IdeaProjects/FileIO/.idea/Files/outputReversed-order.txt");
        try {
            List<String> content = Files.readAllLines(filepathOriginal);
            Files.write(filepathOutput, content);
        } catch (IOException e) {
            System.out.println("Could not copy Content");
        }
        decryptReversed("src/main/resources/static/reversed-order.txt");
    }
        public static void decryptReversed (String fileName) {
            StringBuilder inputChange = new StringBuilder(fileName);
            List<String> content = new ArrayList<>();
            try {
                for (int i = fileName.length() - 1; i > 0; i--) {

                }
                Files.write(Paths.get(fileName), content.toString().getBytes());

            } catch (IOException e) {
                System.out.println("failed");
            }
        }
}