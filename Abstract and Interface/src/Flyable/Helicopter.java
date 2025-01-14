package Flyable;

public class Helicopter extends Vehicle implements Flyable {
    @Override
    public void land() {
        System.out.println("A Helicopter with the color " + this.color + " is landing");
    }

    @Override
    public void fly() {
        System.out.println("A Helicopter from " + this.brand + " is flying");
    }

    @Override
    public void takeOff() {
        System.out.println("A Helicopter with the height: " + this.height + " is taking off");
    }
}
