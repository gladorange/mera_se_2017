public class ConditionForTwoNum {
    public static void main(String[] args) {
        long a = 2;
        long b = 2;

        if (a > 0) {
            System.out.println("The first number " + a + " is positive. The multiplication of two numbers is: " + (a * b));
        }
        if (b > 0) {
            System.out.println("The second number " + b + " is positive. The quotient of two numbers is: " + (a / b));
        }
        if (a % 2 == 0) {
            System.out.println("The first number " + a + " is even. The sum of two numbers is: " + (a + b));
        }
        if (b % 2 == 0) {
            System.out.println("The second number " + b + " is even. The difference between two numbers is: " + (a - b));
        }
    }
}
