import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class EncodedLines {
    public static void main(String[] args) {
        // Create a method called `decryptEncoded` that takes a filename string
        // as a parameter and decrypts the file's content.
        // Decryption is the process reversing an encryption, i.e. the process
        // which converts encrypted data into its original form.
        // If the file can't be opened it should print this message: "File not found"
        // The (decrypted) result should be saved in the "output.txt" file (don't change the path).
        // Change the path of the encoded-lines.txt source file to the path
        // where you saved it on your computer.
        // You can find the source file in a link next to this exercise.
        // You have to figure out the encryption logic by yourself.
        decryptEncoded("/home/simon/IdeaProjects/FileIO/outputFiles/encoded-lines.txt");
    }
    public static void decryptEncoded(String filename) {
        try {
            List<String> content = Files.readAllLines(Paths.get(filename));
            for (String s : content) {
                String[] split = s.split("");
                //for (int j = 0; j < split.length; j++) {
                //System.out.println(split[i].toCharArray());
                //}
            }
        } catch (IOException e) {
            System.out.println("Could not find the file");
        }
    }
}
