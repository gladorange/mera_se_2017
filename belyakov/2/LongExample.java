package javalessons2;

/**
 *
 *
-Написать программу, которая делает следующее:
- У вас есть два числа типа Long (значения чисел можно задать прямо в коде программы)
-  Если первое число четное, то вывести на экран сумму двух чисел
- Если второе число четное, то вывести на экран разность двух чисел
- Если первое число положительное, то вывести на экран произведение двух чисел.
- Если второе число положительное, то вывести на экран частное двух чисел.
 */
public class LongExample {
    public static void main(String[] args) {
        Long first  = new Long(-23);
        Long second = new Long(42);
        
        if (first % 2 == 0)
        {
            System.out.println("first is even. Result: " + (first + second) );
        }
        
        if (second % 2 == 0)
        {
            System.out.println("second is even. Results: " + (first - second) +
            "; " + (second - first) );
        }
        
        if (first > 0)
        {
            System.out.println("first is positive. Result: " + (first * second) );
        }
        
        if (second > 0)
        {
            System.out.println("second is positive. Result: " + (first / second) );
        }
    }
}
