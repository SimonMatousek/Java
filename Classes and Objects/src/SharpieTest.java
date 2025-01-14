public class SharpieTest {
    public static void main(String[] args) {
        SharpieSet sharpieSet = new SharpieSet();
        /*
        sharpieSet.add(new Sharpie("pink",10,30));
        sharpieSet.add(new Sharpie("Black",10,0));
        sharpieSet.removeTrash();
         */
        sharpieSet.add(new Sharpie("pink",10,0));
        sharpieSet.add(new Sharpie("Black",10,0));
        sharpieSet.add(new Sharpie("pink",19,0));
        sharpieSet.removeTrash();
    }
}
