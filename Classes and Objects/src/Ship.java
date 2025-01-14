import java.util.ArrayList;
import java.util.List;

public class Ship {
    List<Pirate> crew = new ArrayList<>();
    Pirate captain;
    public void fillShip(){
        for (int i = 0; i < (int) (Math.random() * 11303 + 1); i++) {
            crew.add(new Pirate());
        }
        captain = new Pirate();
    }
    public void represent() {
        int piratesAlive = 0;
        if (this.captain.dead){
            System.out.println("The captain is dead");
        } else {
            System.out.println("The captain is still alive");
        }
        System.out.println("The captain has consumed " + this.captain.toxic + " Bottles of rum");
        for (Pirate pirate : crew) {
            if (!pirate.dead) {
                piratesAlive++;
            }
        }
        System.out.println(piratesAlive + " are still alive");
    }
    public boolean battle(Ship enemy) {
        int ownAlive = 0;
        int enemyAlive = 0;
        for (int i = 0; i < this.crew.size(); i++) {
            if (!this.crew.get(i).dead) {
                ownAlive++;
            }
        }
        for (int i = 0; i < enemy.crew.size(); i++) {
            if (!enemy.crew.get(i).dead) {
                enemyAlive++;
            }
        }
        if (ownAlive - this.captain.toxic > enemyAlive - enemy.captain.toxic) {
            enemy.lost();
            this.party();
            return true;
        } else if (ownAlive - this.captain.toxic < enemyAlive - enemy.captain.toxic) {
            this.lost();
            enemy.party();
            return false;
        } else {
            enemy.lost();
            this.party();
            return true;
        }
    }
    public void lost() {
        for (int i = 0; i < (int) (Math.random() * this.crew.size()); i++) {
            this.crew.remove(i);
            i--;
        }
    }
    public void party() {
        for (int j = 0; j < (int) (Math.random() * 20); j++) {
            this.captain.drinkSomeRum();
        }
        for (int i = 0; i < crew.size(); i++) {
            for (int j = 0; j < (int) (Math.random() * 10); j++) {
                this.crew.get(i).drinkSomeRum();
            }
        }
    }
}
