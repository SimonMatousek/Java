package Flyable;

import Zoo.Animal;

public class Bird extends Animal implements Flyable {
    @Override
    public void land() {
        System.out.println("A bird with the color " + this.color + " is landing");
    }

    @Override
    public void fly() {
        System.out.println("A bird that is: " + this.age + " years old is landing");
    }

    @Override
    public void takeOff() {
        System.out.println("A bird is taking off");
    }

    @Override
    public String breed() {
        return "A bird is laying eggs";
    }

    @Override
    public void run() {
        System.out.println("The bird could also be flying");
    }
}
