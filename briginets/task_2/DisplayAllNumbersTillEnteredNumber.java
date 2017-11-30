public class DisplayAllNumbersTillEnteredNumber {
    public static void main(String[] args) {
        int number = 25;
        int sumFrom0 = 0;

        System.out.print("Нечетные числа от 0 до " + number + ": ");
        {
            for (int i = 1; i <= number; i++)
                if (i % 2 != 0) {
                    System.out.print(i + "; ");
                }
                else {
                    sumFrom0 = sumFrom0 += i;
                }
        }
        System.out.print("\n" + "Сумма четных чисел равна: " + sumFrom0);
    }
}

