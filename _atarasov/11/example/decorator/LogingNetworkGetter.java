package example.decorator;

import example.proxy.NetworkGetter;

public class LogingNetworkGetter implements NetworkGetter {

    NetworkGetter networkGetter;

    public LogingNetworkGetter(NetworkGetter networkGetter) {
        this.networkGetter = networkGetter;
    }

    @Override
    public String get() {
        System.out.println("Лезу в сеть из декоратора");

        long before = System.nanoTime();
        String s = networkGetter.get();
        long after = System.nanoTime() - before;
        System.out.println("Запрос занял" + after + " наносекунд");
        return s;
    }
}
