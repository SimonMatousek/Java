package Zoo;

public class Mammal extends Animal{
    int weight;
    public Mammal(String name,int weight) {
        this.setName(name);
        this.weight = weight;
    }
    @Override
    public String breed() {
        return "pushing miniature versions out";
    }

    @Override
    public void run() {
        System.out.println("Im running");
    }
    public int getWeight() {
        return this.weight;
    }
}
