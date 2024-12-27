import java.util.*;

public class Matchmaking {
    public static void main(String... args) {

        List<String> girls = new ArrayList<>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        List<String> boys = new ArrayList<>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // If someone has no pair, he/she should be added to the list on his/her own
        // Expected output: [Eve-Joe, Ashley-Fred, Claire-Tom, Kat-Todd, Jane-Neef, Jeff]

        System.out.println(match(girls, boys));
    }
    public static List match (List<String> tempgirls, List<String> tempboys) {
        List<String> boysAndGirls = new ArrayList<>(Arrays.asList());
        for (int i = 0; i < tempboys.size() - 1;i++) {
            boysAndGirls.add(tempboys.get(i));
            boysAndGirls.add(tempgirls.get(i));
        }
        boysAndGirls.add(tempboys.getLast());
        return boysAndGirls;
    }
}