package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int NUMBERS_SIZE = 12;
    public static final int MAX = NUMBERS_SIZE - 1;
    public static final int DEFAULT_RETURN_VALUE = -1;
    public static final int INITIAL = -1;
    private final int[] numbers = new int[NUMBERS_SIZE];

    private int total = INITIAL;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == INITIAL;
    }

    public boolean isFull() {
        return total == MAX;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_RETURN_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_RETURN_VALUE;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }

    public int[] getNumbers() {
        return numbers;
    }
}
