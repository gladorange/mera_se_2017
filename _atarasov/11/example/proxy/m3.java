package example.proxy;

import example.decorator.CopyRightNetworkGetter;

public class m3 {

    public static void main(String[] args) {
    /*    NetworkGetter g = new NetworkGetterImpl();


        // медленно
        g.get();
        g.get();
        g.get();


        g = NetworkBuilderFactory.createGetter();


        // быстро
        System.out.println(g.get());
        System.out.println(g.get());
        System.out.println(g.get());*/

        NetworkGetter loggingGetter = NetworkBuilderFactory.createLoggingGetter();
        System.out.println("Ответ:" + loggingGetter.get());

        CopyRightNetworkGetter g = new CopyRightNetworkGetter(loggingGetter);
        System.out.println("Ответ:" + g.get());


    }
}
