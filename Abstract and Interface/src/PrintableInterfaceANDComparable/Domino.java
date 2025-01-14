package PrintableInterfaceANDComparable;

public class Domino implements Printable, Comparable {
    private int leftSide;
    private int rightSide;
    public Domino(int leftSide, int rightSide) {
        this.leftSide = leftSide;
        this.rightSide = rightSide;
    }
    @Override
    public void printAllFields() {
        System.out.println("Domino left side: " + this.leftSide + ", right side: " + this.rightSide);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
    public int getLeftSide() {
        return leftSide;
    }
    public int getRightSide() {
        return rightSide;
    }
}
