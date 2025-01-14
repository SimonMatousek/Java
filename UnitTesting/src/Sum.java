public class Sum {
    public int sum(int[] toBeAdded) {
        int sum = 0;
        for (int i = 0; i < toBeAdded.length; i++) {
            sum += toBeAdded[i];
        }
        return sum;
    }
}
