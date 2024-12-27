public class FarmMain {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.eat();
        animal1.eat();
        Animal animal2 = new Animal();
        animal2.play();
        Farm farm = new Farm(2);
        farm.breed();
        farm.breed();
        farm.sell();
        farm.breed();
        farm.breed();
    }
}
