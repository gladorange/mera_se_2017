/*
 * 1st task
 */
public class BasicExpressionsWithLong {

    public static void main(String[] args) {
        Long x1 = 42L;
        Long x2 = -17L;

        if (x1 % 2 == 0) {
            Long sum = x1 + x2;
            System.out.println(sum);
        }

        if (x2 % 2 == 0) {
            Long sub = x1 - x2;
            System.out.println(sub);
        }

        if (x1 > 0) {
            Long mul = x1 * x2;
            System.out.println(mul);
        }

        if (x2 > 0) {
            Long div = x1 / x2;
            System.out.println(div);
        }
    }
}
