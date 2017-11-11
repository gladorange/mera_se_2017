package com.company;

public class Exercise3 {
    public static void main(String[] args) {
        int[] array = {1, 5, 10, 2, 3, 3, 3, 3, 3, -2};
        int max = array[0];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (array[i] > 100) {
                break;
            }
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        System.out.println(index);
    }
}
