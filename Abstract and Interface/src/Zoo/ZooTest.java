package Zoo;
public class ZooTest {
    public static void main(String[] args) {

        Reptile reptile = new Reptile("Crocodile",true);
        Mammal mammal = new Mammal("Koala",70);
        Bird bird = new Bird("Parrot",true);

        System.out.println("How do you breed?");
        System.out.println("A " + reptile.getName() + " is breeding by " + reptile.breed());
        System.out.println("A " + mammal.getName() + " is breeding by " + mammal.breed());
        System.out.println("A " + bird.getName() + " is breeding by " + bird.breed());
    }
}
