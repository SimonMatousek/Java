package Garden_Application;

public class Tree {

    float waterAmount;
    String color;

    public Tree(String color) {
        this.color = color;
    }
    public void needWater() {
        if (this.waterAmount < 10) {
            System.out.println("The " + this.color + " tree needs water");
        } else {
            System.out.println("The " + this.color + " tree doesn't need water");
        }
    }
    public void watering(float water) {
        this.waterAmount += water * 0.4f;
    }
}
