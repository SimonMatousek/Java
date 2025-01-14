import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Logs {
    public static void main(String[] args){
        // Write a method `getUniqueIpAddresses` which accepts a path to `log.txt`
        // as a parameter and returns an array of unique IP addresses.
        // Write a method `getRequestRatio` which accepts a path to `log.txt`
        // as a parameter and returns the ratio of GET to POST requests.
        // If the specified file cannot be found the methods should return an empty
        // array and 0.0 respectively (and raise no errors).
        // Change the path of the log.txt source file to the path
        // where you saved it on your computer.
        // You can find the source file in a link next to this exercise.
        System.out.println(String.join(System.lineSeparator(), getUniqueIpAddresses("originalFiles/log.txt")));
        System.out.println(getRequestRatio("originalFiles/log.txt"));
    }
    public static String[] getUniqueIpAddresses(String pathName) {
        List<String> content;
        String[] out;
        String[] ifFail = {"0"};
        try {
            content = Files.readAllLines(Paths.get(pathName));
            out = new String[content.size()];
            for (int i = 0; i < content.size(); i++) {
                out[i] = content.get(i);
            }
            return out;
        } catch (Exception e) {
            return ifFail;
        }
    }
    public static String getRequestRatio(String pathName) {
        try {
            int get = 0;
            int post = 0;
            List<String> content = Files.readAllLines(Paths.get(pathName));
            for (String line : content) {
                String[] splited = line.split("");
                if (splited[splited.length - 4].equals("S")) {
                    post ++;
                } else {
                    get ++;
                }
            }
            return "GET:" + get + " POST: " + post;
        } catch (Exception e) {
            return "0.0";
        }
    }
}
