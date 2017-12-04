package mera.education;

/**
 * Hello world!
 *
 */
@SomeAnnotation
public class App 
{
    public int sum(int one, int second) {
        if (one == Integer.MAX_VALUE || second == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Too bin number");
        }
        return one + second;
    }

    public static void main(String[] args) {
        Singl instance = Singl.getINSTANCE();
    }
}
