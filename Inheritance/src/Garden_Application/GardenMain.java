package Garden_Application;

public class GardenMain {
    public static void main(String[] args) {
        Flower flower1 = new Flower("yellow");
        Flower flower2 = new Flower("blue");
        Tree tree1 = new Tree("purple");
        Tree tree2 = new Tree("orange");
        Garden garden = new Garden();

        garden.addFlower(flower1);
        garden.addFlower(flower2);
        garden.addTree(tree1);
        garden.addTree(tree2);

        flower1.needWater();
        flower2.needWater();
        tree1.needWater();
        tree2.needWater();

         garden.watering(40);
        flower1.needWater();
        flower2.needWater();
        tree1.needWater();
        tree2.needWater();

        garden.watering(70);
        flower1.needWater();
        flower2.needWater();
        tree1.needWater();
        tree2.needWater();
    }
}
