public class FindIndex {
    public static void main(String[] args) {
        int m[] = {-1, -2, -3, 0, 200, -6, -7, 300, -9, -10};
        int max = m[0];
        int index = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] > max) {
                max = m[i];
                index = i;
            }
            if (m[i] > 100) {
                break;
            }
        }
        System.out.println(index);
    }
}

