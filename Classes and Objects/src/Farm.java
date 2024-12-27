import java.util.ArrayList;
import java.util.List;

public class Farm {
    /*
    Reuse your Animal class
    Create a Farm class
        it has a list of Animals listOfAnimals
        it has a limit that defines how many animals can be kept in the Farm and can be set when the Farm is created
        it has two methods:
            breed() -> creates a new animal if there's place for it
            sell() -> removes the least hungry animal
     */
    List<Animal> listOfAnimals = new ArrayList<>();
    int limitAnimals;

    public Farm(int limitAnimals) {
        this.limitAnimals = limitAnimals;
    }
    public void breed() {
        if (this.listOfAnimals.size() < this.limitAnimals) {
            this.listOfAnimals.add(new Animal());
        } else {
            System.out.println("Not enough space");
        }
    }
    public void sell() {
        Animal animalForSale = new Animal();
        for (Animal animal : this.listOfAnimals) {
            if (animal.hunger < animalForSale.hunger) {
                animalForSale = animal;
            }
        }
    }

}
