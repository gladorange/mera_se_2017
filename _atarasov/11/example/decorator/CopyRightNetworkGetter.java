package example.decorator;

import example.proxy.NetworkGetter;

public class CopyRightNetworkGetter implements NetworkGetter {
    NetworkGetter getter;

    public CopyRightNetworkGetter(NetworkGetter getter) {
        this.getter = getter;
    }

    @Override
    public String get() {
        return getter.get() + " Этот текст получен с помощью CopyRightNetworkGetter";
    }

}
