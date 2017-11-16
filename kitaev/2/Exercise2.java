package com.company;

public class Exercise2 {
    public static void main(String[] args) {
        int num = 6;
        int i = 0;
        int sum = 0;
        while (i < num) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
