public class Comparison2 {
    public static void main(String[] arguments) {
        long value = 5;
        long sum = 0;
        for (int i = 1; i <= value; i++) {
            if (i % 2 != 0) {
                System.out.print(i+",");
            } else {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
