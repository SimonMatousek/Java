package Garden_Application;

import java.util.ArrayList;
import java.util.List;

public class Garden {

    List<Flower> listOfFlower = new ArrayList<>();
    List<Tree> listOfTree = new ArrayList<>();

    public void addFlower(Flower flower) {
        this.listOfFlower.add(flower);
    }
    public void addTree(Tree tree) {
        this.listOfTree.add(tree);
    }
    public void watering(float amount) {
        int flowerWater = 0;
        int treeWater = 0;

        for (Flower flower : this.listOfFlower) {
            if (flower.waterAmount < 5) {
                flowerWater ++;
            }
        }
        for (Tree tree : this.listOfTree) {
            if (tree.waterAmount < 10) {
                treeWater ++;
            }
        }
        amount /= flowerWater + treeWater;
        for (Flower flower : this.listOfFlower) {
            if (flower.waterAmount < 5) {
                flower.waterAmount += amount * 0.75f;
            }
        }
        for (Tree tree : this.listOfTree) {
            if (tree.waterAmount < 10) {
                tree.waterAmount += amount * 0.4f;
            }
        }

    }
}
