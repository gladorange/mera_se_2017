/**
 * Task #3
 */
public class MaxIntArrayValue {
    public static void main(String[] args) {

        int[] elements = {-1, -2, 93, -4, 500, -6, -7, -8, -9, -10};

        int max = elements[0];
        int index = -1;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] > 100) {
                break;
            } else {
                if (elements[i] >= max) {
                    max = elements[i];
                    index = i;
                }
            }
        }
        System.out.println(String.format("Max=%d, index=%s", max, index));
    }
}
