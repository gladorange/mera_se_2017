public class array {
    public static void main(String[] args) {
        int a[] = {4, 5, 32, 101, 75, 7, 8, 9, 4, 0};
        int max = 0;
        int idx = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 100)
                break;
            if (a[i] > max) {
                max = a[i];
                idx = i;
            }
        }
        System.out.println(idx);
    }
}