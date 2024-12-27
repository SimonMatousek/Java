import java.util.ArrayList;

public class ShoppingList1 {
    public static void main (String...args) {
        ArrayList<String> products = new ArrayList<>();
        products.add("eggs");
        products.add("milk");
        products.add("fish");
        products.add("apples");
        products.add("bread");
        products.add("chicken");
        if (products.contains("milk")) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        if (products.contains("bananas")) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
