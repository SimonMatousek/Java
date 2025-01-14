public class Power {
    public static void main(String[] args) {
        // Given base and n that are both 1 or more, write a recursive method (no loops)
        // which returns the value of base to the n-th power, so powerN(3, 2) is 9 (3 squared).
        int base = 13;
        int exponent = 0;
        System.out.println(power(base,exponent));
    }
    public static int power(int base, int exponent) {
        if (exponent <= 0 || base < 2) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else {
            return base * power(base, exponent - 1);
        }
    }
}
