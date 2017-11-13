public class HW2_2 {
    public static void main(String args[])
    {
        int boundary = 19;
        int res=0;

        for (int i=0; i< boundary; i++)
        {
            if(i % 2 != 0)
                System.out.print(" " + i );
        }

        System.out.print("\n");

        for (int i = 0; i< boundary; i++)
        {
            if(i % 2 == 0)

                res += i;
        }

        System.out.println(res);
    }
}