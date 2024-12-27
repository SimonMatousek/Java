import java.util.ArrayList;
import java.util.Collections;

public class PersonalFinance {
    public static void main (String...args) {
        ArrayList<Integer> expenses = new ArrayList<>();
        expenses.add(500);
        expenses.add(1000);
        expenses.add(1250);
        expenses.add(175);
        expenses.add(800);
        expenses.add(120);
        int total = 0;
        for (int i = 0; i < expenses.size(); i++) {
            total += expenses.get(i);
        }
        System.out.println(total);
        System.out.println(Collections.max(expenses));
        System.out.println(Collections.min(expenses));
        float average = 0;
        int quotient = 0;
        for (int i = 0; i < expenses.size();i++) {
            average += expenses.get(i);
            quotient += 1;
        }
        System.out.println(average/quotient);
    }
}
