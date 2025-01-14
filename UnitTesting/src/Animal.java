public class Animal {
    int hunger;
    int thirst;

    public Animal() {
        this.hunger = 50;
        this.thirst = 50;
    }
    public int eat(){
        this.hunger --;
        return this.hunger;
    }
    public int drink() {
        this.thirst --;
        return this.thirst;
    }
    public void play() {
        this.hunger ++;
        this.thirst ++;
    }
}
