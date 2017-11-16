public class loop {
    public static void main(String[] args) {
        int sum = 0;
        int a = 5;
        for (int i = 0; (a > 0) ? (i <= a) : (i >= a); i = a > 0 ? i+1 : i-1){
            if (i % 2 != 0) {
                System.out.println(i);
            } else {
                sum += i;
            }
        }
        System.out.println("сумма четных " + sum);
    }
}