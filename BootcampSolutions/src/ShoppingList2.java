import java.awt.geom.QuadCurve2D;
import java.util.HashMap;
import java.util.Map;

public class ShoppingList2 {
    public static void main (String...args) {
        HashMap<String,Double>shoppingPrices = new HashMap<>();
        shoppingPrices.put("Milk",1.07);
        shoppingPrices.put("Rice",1.59);
        shoppingPrices.put("Eggs",3.14);
        shoppingPrices.put("Cheese",12.60);
        shoppingPrices.put("Chicken Breasts",9.40);
        shoppingPrices.put("Apples",2.31);
        shoppingPrices.put("Tomato",2.58);
        shoppingPrices.put("Potato",1.75);
        shoppingPrices.put("Onion",1.10);

        HashMap<String,Integer> bobsList = new HashMap<>();
        bobsList.put("Milk",3);
        bobsList.put("Rice",2);
        bobsList.put("Eggs",2);
        bobsList.put("Cheese",1);
        bobsList.put("Chicken Breasts",4);
        bobsList.put("Apples",1);
        bobsList.put("Tomato",2);
        bobsList.put("Potato",1);

        HashMap<String,Integer> alicesList = new HashMap<>();
        alicesList.put("Rice",1);
        alicesList.put("Eggs",5);
        alicesList.put("Chicken Breast",2);
        alicesList.put("Apples",1);
        alicesList.put("Tomato",10);

        for (String key : bobsList.keySet()) {
        }
    }
}
