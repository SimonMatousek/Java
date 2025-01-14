package PrintableInterfaceANDComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DominoTest {
    public static void main(String[] args) {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));

        List<Domino> domino = new ArrayList<>();
        domino.add(new Domino(5, 2));
        domino.add(new Domino(4, 6));
        domino.add(new Domino(1, 5));
        domino.add(new Domino(6, 7));
        domino.add(new Domino(2, 4));
        domino.add(new Domino(7, 1));
        Collections.sort(domino);
        for (int i = 0; i < domino.size(); i++) {
            System.out.print("[" + domino.get(i).getLeftSide() + ", " + domino.get(i).getRightSide() + "]");
            if (!(i == domino.size() - 1)) {
                System.out.print(", ");
            }
        }


// the order of your dominoes should look like this: [[1,5], [2,4], [4,6], [5,2], [6,7], [7,1]]
    }
    
}
