package CharSequence;

import java.util.stream.IntStream;

public class Gnirts implements CharSequence{
    String string;
    public Gnirts(String string) {
        this.string = string;
    }

    @java.lang.Override
    public int length() {
        return this.string.length();
    }

    @java.lang.Override
    public char charAt(int index) {
        return this.string.charAt(this.string.length() - 1 - index);
    }

    @java.lang.Override
    public java.lang.CharSequence subSequence(int start, int end) {
        return this.string.subSequence(end, start);
    }

    @java.lang.Override
    public boolean isEmpty() {
        return CharSequence.super.isEmpty();
    }

    @java.lang.Override
    public IntStream chars() {
        return  CharSequence.super.chars();
    }

    @java.lang.Override
    public IntStream codePoints() {
        return CharSequence.super.codePoints();
    }
}
