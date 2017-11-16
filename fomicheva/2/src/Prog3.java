public class Prog3 {
    public static void main(String args[])
    {
        int [] arrayInt = {5, 8, 12, 75, 23, 10, 30, 55, 11, 17, 7};
        int maxInd = 0;
        for (int i = 1;i < 10;i++) {
            if (arrayInt[i] > arrayInt[maxInd]) {
                maxInd = i;
            }
            if (arrayInt[i] > 100 ) {
                break;
            }
        }
        System.out.println("Индекс максимального элемента:" + maxInd);

    }
}
