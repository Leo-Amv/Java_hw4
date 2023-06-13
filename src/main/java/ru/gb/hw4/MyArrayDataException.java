package ru.gb.hw4;

public class MyArrayDataException extends IllegalStateException {
    private final int i;
    private final int j;

    public MyArrayDataException(int dataI, int dataJ, String msg) {
        super(msg);
        this.i = dataI;
        this.j = dataJ;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}
