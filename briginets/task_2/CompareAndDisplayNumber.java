public class CompareAndDisplayNumber {

    public static void main(String[] args) {
        long number1 = 20L;
        long number2 = 35L;

        if (number1 % 2 == 0) {
            System.out.println(number1 + " четное, сумма " + number1 +
                    " и " + number2 + " равна " + (number1 + number2));
        }

        if (number2 % 2 == 0) {
            System.out.println(number2 + " четное, разность " + number1 +
                    " и " + number2 + " равна " + (number1 - number2));
        }

        if (number1 > 0) {
            System.out.println(number1 + " положительное, произведение " + number1 +
                    " и " + number2 + " равно " + (number1 * number2));
        }
        if (number1 > 0) {
            System.out.println(number2 + " положительное, частное " + number1 +
                    " и " + number2 + " равно " + ((double)number1 / number2));
        }
    }
}
