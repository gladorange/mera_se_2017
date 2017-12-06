package example.proxy;

import example.decorator.LogingNetworkGetter;

public class NetworkBuilderFactory {


    public static NetworkGetter createGetter() {
        return new NetworkGetterProxy(new NetworkGetterImpl());
    }

    public static NetworkGetter createLoggingGetter() {
        return new LogingNetworkGetter(new NetworkGetterImpl());
    }
}
