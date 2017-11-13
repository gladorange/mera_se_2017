package javalessons2;

/**
Есть массив типа int, размер 10 элементов. Все 10 элементов заполняются в коде программы вручную.
Нужно найти самый большой элемент в массиве и вывести его индекс.
Если в массиве встречается элемент больше 100, то числа после этого элемента не рассматриваются 
 */
public class ArrayExample {
    public static void main(String[] args) {
        int numbers[] = {100, 2, 1, 54, 65, -23, 1, 101, 120, 99};

        int maxNumber      = numbers[0];
        int maxNumberIndex = 0;

        for (int i = 0; i < numbers.length; ++i )
        {
            if (numbers[i] > 100)
            {
                maxNumber      = numbers[i];
                maxNumberIndex = i;
                break;
            }
            
            if (numbers[i] > maxNumber)
            {
                maxNumber      = numbers[i];
                maxNumberIndex = i;
            }
        }
        
        System.out.println("Max number index is: " + maxNumberIndex);
    }    
}
