public class Sharpie {
    String color;
    int width;
    int inkAmount;

    public Sharpie(String color, int width, int inkAmount) {
        this.color = color;
        this.width = width;
        this.inkAmount = inkAmount;
    }

    public int use() {
        this.inkAmount -= 10;
        return this.inkAmount;
    }

}
