public class one {
    public static void main(String[] args) {
        long a = 5;
        long b = -8;
        if (a%2 == 0) {
            System.out.println("a четное. сумма " + (a+b));
        }
        if (b%2 == 0) {
            System.out.println("b четное. разность " + (a-b));
        }
        if (a > 0) {
            System.out.println(a*b);
        }
        if (b > 0) {
            System.out.println((double)a/b);
        }
    }
}