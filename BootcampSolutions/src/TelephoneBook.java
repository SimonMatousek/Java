import java.security.Key;
import java.util.HashMap;

public class TelephoneBook {
    public static void main (String...args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("William A. Lathan","405-709-1865");
        map.put("John K. Miller","402-247-8568");
        map.put("Hortensia E. Foster","606-481-6467");
        map.put("Amanda D. Newland","319-243-5613");
        map.put("Brooke P. Askew","307-687-2982");

        System.out.println(map.get("John K. Miller"));
        for (String key : map.keySet()) {
            if (map.get(key) == "307-687-2982") {
                System.out.println(key);
            }
        }
        if (map.containsKey("Chris E. Myer")) {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
