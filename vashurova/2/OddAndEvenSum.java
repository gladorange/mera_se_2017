/* Написать программу:
- У вас есть одно число (значения числа можно задать прямо в коде программы вручную)
- На экран нужно вывести все нечетные числа от 0 до введенного числа.
- На экран нужно вывести сумму всех четных от 0 до введенного числа.
 */
public class OddAndEvenSum {
    public static void main(String[] args) {
        int a = 12;
        int sum = 0;
        for(int i=0; i<=a; i++ ){
            if (i==0)  System.out.print(i + " ");
            if (i % 2 == 1) System.out.print(i + " ");
            else sum += i;
        }
        System.out.print("\nSum: " + sum);
    }
}