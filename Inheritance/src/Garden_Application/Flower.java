package Garden_Application;

public class Flower {

    float waterAmount;
    String color;

    public Flower(String color) {
        this.color = color;
    }
    public void needWater() {
        if (this.waterAmount < 5) {
            System.out.println("The " + this.color + " Flower needs water");
        } else {
            System.out.println("The " + this.color + " Flower doesn't need water");
        }
    }
    public void watering(float water) {
        this.waterAmount += water * 0.75f;
    }
}
