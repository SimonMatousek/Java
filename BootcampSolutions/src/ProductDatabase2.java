import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ProductDatabase2 {
    public static void main (String...args) {
        HashMap<String,Integer> shoppingList = new HashMap<>();
        shoppingList.put("Eggs",200);
        shoppingList.put("Milk",200);
        shoppingList.put("Fish",400);
        shoppingList.put("Apples",150);
        shoppingList.put("Bread",50);
        shoppingList.put("Chicken",550);
        ArrayList<Integer> lessthan = new ArrayList<>();
        for (Integer value : shoppingList.values()) {
            if (value < 201) {
                lessthan.add(value);
            }
        }
        for (Map.Entry<String,Integer> entry : shoppingList.entrySet()) {
            if (Objects.equals(entry, lessthan)) {
                System.out.println(entry.getKey());
            }
        }
        ArrayList<Integer> greaterthan = new ArrayList<>();
        for (Integer values : shoppingList.values()) {
            if (values > 150) {
                greaterthan.add(values);
            }
        }
        System.out.println(greaterthan);
    }
}
