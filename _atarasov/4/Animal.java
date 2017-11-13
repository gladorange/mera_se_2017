abstract public class Animal {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract public String doNoise();

    @Override
    public String toString() {
        return name;
    }
}
