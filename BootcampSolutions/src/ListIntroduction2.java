import java.util.ArrayList;
import java.util.Collection;

public class ListIntroduction2 {
    public static void main (String...args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("Apple");
        a.add("Avocado");
        a.add("Blueberries");
        a.add("Durian");
        a.add("Lychee");
        ArrayList<String> b = new ArrayList<>();
        b.addAll(a);
        System.out.println( a.contains("Durian"));
        b.remove("Durian");
        a.add(4,"Kiwifruit");
        System.out.println(a.size()== b.size());
        System.out.println(a.indexOf("Avocado"));
        System.out.println(b.indexOf("Durian"));
        System.out.println(a);
        System.out.println(b);
    }
}
