public class Prog2 {
    public static void main(String args[])
    {
        int a = 35;
        int sum = 0;
        for (int i = 0;i <= a;i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            } else {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
