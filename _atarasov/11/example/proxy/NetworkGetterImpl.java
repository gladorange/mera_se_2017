package example.proxy;

public class NetworkGetterImpl implements NetworkGetter {
    @Override
    public String get() {
        System.out.println("Лезем в сеть");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "Какой-то результат";
    }
}
