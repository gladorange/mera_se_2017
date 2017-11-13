public class Prog2 {
    public static void main(String[] args) {
        int a = 10;
        int sumEven = 0;
        for (int i = 0; i <= a; i++)
            if (i % 2 == 1) {
                System.out.print(i + " ");
            } else {
                sumEven = sumEven + i;
            }
        System.out.print("\n" + sumEven);
    }
}