package com.company;

public class Exercise1 {
    public static void main(String[] args) {
        MyLong var0 = new MyLong(123123123L);
        MyLong var1 = new MyLong(-1234123422L);

        if (var0.isEven()) {
            MyLong[] array = {var0, var1};
            System.out.println("var0 is even, the sum is " + MyLong.sum(array));
        }
        if (var1.isEven()) {
            System.out.println("var1 is even, the difference is " + MyLong.difference(var0, var1));
            // var1 is even, the difference is 1357246545
        }
        if (var0.isPositive()) {
            MyLong[] array = {var0, var1};
            System.out.println("var0 is positive, the composition is " + MyLong.multiply(array));
            // var0 is positive, the composition is -151949129884086906
        }
        if (var1.isPositive()) {
            System.out.println("var1 is positive, the quotient is " + MyLong.divide(var0, var1));
        }
    }
}
