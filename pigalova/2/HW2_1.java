package HW2;

public class HW1 {
    public static void main(String args[]) {
        long num1 = 20;
        long num2 = -12;


        if ((num1%2) == 0)
        {
            //result = num1 + num2;
            System.out.print(num1 + num2 + "\n");
        }

        if ((num2%2) == 0)
        {
            //result = num1 - num2;

            System.out.print(num1 - num2 +"\n");
        }

        if (num1>0)
        {
            System.out.print(num1*num2 + "\n");
        }

        if (num2> 0)
        {
            System.out.print(num1 / num2 + "\n");
        }


    }

}
