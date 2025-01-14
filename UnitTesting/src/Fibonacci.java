public class Fibonacci {
    public int showFibonacciSequence(int index) {
        int n1 = 0;
        int n2 = 1;
        if (index == 2) {
            return 1;
        }else if (index == 1) {
            return 0;
        } else {
            int n3 = 0;
            for (int i = 2; i < index; i++) {
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
            }
            return n3;
        }
    }
}