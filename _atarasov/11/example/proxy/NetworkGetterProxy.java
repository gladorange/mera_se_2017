package example.proxy;

public class NetworkGetterProxy implements NetworkGetter{

    NetworkGetterImpl realObject;
    String value;


    public NetworkGetterProxy(NetworkGetterImpl realObject) {
        this.realObject = realObject;
    }

    @Override
    public String get() {
        if (value == null) {
            value = realObject.get();
        }
        return value;
    }
}
