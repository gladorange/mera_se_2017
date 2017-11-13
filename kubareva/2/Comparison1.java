public class Comparison1 {
    public static void main(String[] arguments) {
        long value1 = 279;
        long value2 = 135;
        if (value1 % 2 == 0) {
            System.out.println(value1 + value2);
        }
        if (value2 % 2 == 0) {
            System.out.println(value1 - value2);
        }
        if (value1 > 0) {
            System.out.println(value1 * value2);
        }
        if (value2 > 0) {
            System.out.println(value1 / value2);
        }
    }
}
