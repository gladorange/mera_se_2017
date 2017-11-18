/**
 * Task #2,
 * here input parameter as command line parameter
 */
public class OddNumericEvenSum {
    public static void main(String[] args) {
        if (args.length == 1) {
            try {
                int number = Integer.parseInt(args[0]);
                System.out.print(String.format("Odd numbers of %d: ", number));

                int sum = 0;
                for (int i = 1; i <= number; i++) {
                    if (i % 2 != 0) {
                        System.out.print(String.format("%d ", i));
                    } else {
                        sum += i;
                    }
                }

                System.out.print(String.format("\nSum of even numbers of %d: %d ", number, sum));
            } catch (NumberFormatException e) {
                System.out.println(String.format("Invalid format of input parameters:\n%s", e));
            }
        } else {
            System.out.println("Expect 1 input parameter");
        }
    }
}
