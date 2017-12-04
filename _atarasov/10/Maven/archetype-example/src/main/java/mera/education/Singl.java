package mera.education;

public class Singl {

    private Singl() {

    }

    static Singl INSTANCE = new Singl();

    public synchronized static Singl getINSTANCE() {
        return INSTANCE;
    }
}
