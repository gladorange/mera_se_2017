package com.company;

public final class MyLong {
    private final long number;

    public MyLong(long number) {
        this.number = number;
    }

    public boolean isEven() {
        return this.number % 2 == 0;
    }

    public boolean isPositive() {
        return this.number > 0;
    }

    public static long sum(MyLong[] args) {
        long sum = 0;
        for (MyLong item : args) {
            sum += item.number;
        }
        return sum;
    }

    public static long difference(MyLong a, MyLong b) {
        return a.number - b.number;
    }

    public static long multiply(MyLong[] args) {
        long composition = 1;
        for (MyLong item : args) {
            composition *= item.number;
        }
        return composition;
    }

    public static long divide(MyLong a, MyLong b) {
        return a.number / b.number;
    }
}
