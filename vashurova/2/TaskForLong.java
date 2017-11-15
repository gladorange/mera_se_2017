public class TaskForLong {
    public static void main(String[] args){

        long a = 64L;
        long b = 4L;

        //check parity
        if(a % 2 == 0) System.out.println("Сумма:" + (a + b));   //if the first is even, print sum a+b
        if(b % 2 == 0) System.out.println("Разность:" + (a - b)); //if the second is even, print diff a-b
        if(b==0) {
            System.out.print("Введите число отличное от нуля");
        }else
        if (a > 0) System.out.println(a * b);
        if (b > 0) System.out.println(a / b);
    }
}