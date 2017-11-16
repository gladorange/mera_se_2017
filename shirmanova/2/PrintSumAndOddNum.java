public class PrintSumAndOddNum {
    public static void main(String[] args) {
        int a = 10;
        int sum = 0;
        for (int i = 1; i <= a ; i++) {
            if (i % 2 != 0) {
                System.out.print(i + ", ");
            } else {
                sum = sum + i;
            }
        }
        System.out.println();
        System.out.println("Sum of all even numbers is: " + sum);
    }
}
