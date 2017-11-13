package javalessons2;

/**
- У вас есть одно число (значения числа можно задать прямо в коде программы вручную) 
- На экран нужно вывести все нечетные числа от 0 до введенного числа.
- На экран нужно вывести сумму всех четных от 0 до введенного числа. 
*
*/
public class LoopExample {
    public static void main(String[] args) {
        int number = 11;
        int sum = 0;
        System.out.print("Odd numbers:");
        
        for (int i = 1; i <= number; ++i)
        {
            if (i % 2 == 1)
            {
                System.out.print(" " + i);
            }
            
            else
            {
                sum += i;
            }
        }
        
        System.out.println(". Sum of even numbers is " + sum);
    }
}
