public class mainSharpie {
    public static void main(String[] args) {
        Sharpie sharpie = new Sharpie("Pink",10000000,100);
        System.out.println("InkAmount before: " + sharpie.inkAmount);
        sharpie.use();
        System.out.println("InkAmount after: " + sharpie.inkAmount);

        //Sharpie set exercise:
        Sharpie sharpie1 = new Sharpie("Pink",10,40);
        Sharpie sharpie2 = new Sharpie("Green",20,0);
        SharpieSet sharpieSet = new SharpieSet();
        sharpieSet.add(sharpie1);
        sharpieSet.add(sharpie2);
        System.out.println("Sharpies before:" + sharpieSet.listOfSharpies);
        sharpieSet.removeTrash();
        System.out.println("Sharpies after:" + sharpieSet.listOfSharpies);
    }
}
