package Zoo;

public abstract class Animal {
    private String name;
    protected int age;
    protected String color;
    protected boolean deadly;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract String breed();
    public abstract void run();
}

