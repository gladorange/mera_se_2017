package example;

public class PrototypeExample implements Cloneable {

    private String f1;
    private String f2;
    private String f3;
    private String f4;


    public PrototypeExample clone() {
        PrototypeExample r = new PrototypeExample();
        r.f1 = f1;
        r.f2 = f2;
        r.f3 = f3;
        r.f4 = f4;
        return r;
    }

}
