/*
3. Написать программу:
Есть массив типа int, размер 10 элементов. Все 10 элементов заполняются в коде программы вручную. Нужно найти самый
большой элемент в массиве и вывести его индекс.
Если в массиве встречается элемент больше 100, то числа после этого элемента не рассматриваются (используйте break)

Например,
Массив [1,5,10,2,3,3,3,3,3,-2] = должно выывести "2" - это индекс десятки. Не забываем, что индексы начинаются с нуля.
 */
public class TaskForArray {
    public static void main(String[] args){
        int[] arr = {0, 1, 5, 7, 9, 11, 13, 15, 23, 28};
        int maxNum = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 100) break;
            else
                if(arr[i]>maxNum) maxNum=arr[i];
                index = i;
        }
        System.out.print(index);
    }
}
