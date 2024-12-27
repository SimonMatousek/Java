import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    /*
    Reuse your Sharpie class
    Create SharpieSet class
        it contains a list of Sharpie, named listOfSharpies
        it has a method that adds a new Sharpie to the set: add(sharpie)
        it has a method that returns the number of usable Sharpies: countUsable() -> sharpie is usable if it contains ink
        it has a method that removes all unusable Sharpies: removeTrash()
    Test your class by adding usable and unusable sharpies, then call the removeTrash() function
    Test your class also by having 3 unusable sharpies only, then call the removeTrash() function
     */
    List<Sharpie> listOfSharpies = new ArrayList<>();

    public void add(Sharpie sharpie) {
        this.listOfSharpies.add(sharpie);
    }
    public int countUsable(){
        int usable = 0;
        for (Sharpie sharpie : this.listOfSharpies){
            if (sharpie.inkAmount > 0) {
                usable ++;
            }
        }
        return usable;
    }
    public void removeTrash() {
        for (Sharpie sharpie : this.listOfSharpies) {
            if (sharpie.inkAmount == 0) {
               // this.listOfSharpies.remove(sharpie);
            }
        }
    }
}
