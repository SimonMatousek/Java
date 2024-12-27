import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ProductDatabase1 {
    public static void main (String...args) {
        HashMap<String,Integer> shoppingList = new HashMap<>();
        shoppingList.put("Eggs",200);
        shoppingList.put("Milk",200);
        shoppingList.put("Fish",400);
        shoppingList.put("Apples",150);
        shoppingList.put("Bread",50);
        shoppingList.put("Chicken",550);
        //How much is the Fish
        System.out.println(shoppingList.get("Fish"));
        //Most expensive Product
        Integer biggestValue = 0;
        for (Integer value : shoppingList.values()) {
            if (value > biggestValue) {
                biggestValue = value;
            }
        }
        for (Map.Entry<String,Integer> entry : shoppingList.entrySet()) {
            if (entry.getValue() == biggestValue) {
                System.out.println(entry.getKey());
            }
        }
        //Average Prize
        float i = 0;
        for (Integer value : shoppingList.values()) {
            i += value;
        }
        System.out.println(i/shoppingList.size());
        //How many Products price below 300
        int j = 0;
        for (Integer value : shoppingList.values()) {
            if (value < 300) {
                j += 1;
            }
        }
        System.out.println(j);
        //Is there anything you can buy for exactly 125
        if (shoppingList.containsValue(125)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        Integer smallestValue = 50;
        for (Integer value : shoppingList.values()) {
            if (smallestValue > value) {
                smallestValue = value;
            }
        }
        for (Map.Entry<String,Integer> entry : shoppingList.entrySet()) {
            if (entry.getValue() == smallestValue) {
                System.out.println(entry.getKey());
            }
        }
    }
}
