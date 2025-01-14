package Zoo;

public class Reptile extends Animal{
    private boolean isLayingEggs;
    public Reptile(String name, boolean isLayingEggs) {
        this.setName(name);
        this.isLayingEggs = isLayingEggs;
    }
    @Override
    public String breed() {
        if(isLayingEggs) {
            return "laying eggs";
        } else {
            return "pushing miniature versions out";
        }
    }

    @Override
    public void run() {
        System.out.println("Im running right now");
    }

    public boolean isLayingEggs() {
        return isLayingEggs;
    }

    public void setLayingEggs(boolean layingEggs) {
        isLayingEggs = layingEggs;
    }
}
