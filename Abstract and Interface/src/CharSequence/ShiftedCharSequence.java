package CharSequence;

import java.util.stream.IntStream;

public class ShiftedCharSequence implements CharSequence{
    String string;
    int shift;
    public ShiftedCharSequence(String string, int shift) {
        this.string = string;
        this.shift = shift;
    }

    @Override
    public int length() {
        return this.string.length();
    }

    @Override
    public char charAt(int index) {
        return this.string.charAt(index + this.shift);
    }

    @Override
    public boolean isEmpty() {
        return CharSequence.super.isEmpty();
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return this.string.subSequence(start + this.shift, end + this.shift);
    }

    @Override
    public IntStream chars() {
        return CharSequence.super.chars();
    }

    @Override
    public IntStream codePoints() {
        return CharSequence.super.codePoints();
    }
}
