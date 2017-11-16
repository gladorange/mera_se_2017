public class Comparison3 {
    public static void main(String[] arguments) {
        int[] sequence = {5, 6, 12, 3, 25, 114, -8, 0, 4, 11};
        int theBiggestIndex = 0;
        for (int i = 1; i < sequence.length; i++) {
            if (sequence[i] > sequence[theBiggestIndex]) {
                theBiggestIndex = i;
            }
            if (sequence[i] >= 100) {
                break;
            }
        }
        System.out.println("Index of the biggest number: " + theBiggestIndex);

    }
}
