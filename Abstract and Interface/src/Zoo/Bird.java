package Zoo;

public class Bird extends Animal{
    private boolean hasFeathers;
    public Bird(String name,boolean hasFeathers) {
        this.setName(name);
        this.hasFeathers = hasFeathers;
    }
    @Override
    public String breed() {
        return "laying eggs";
    }

    @Override
    public void run() {
        System.out.println("Im running or flying");
    }
}
