package example.fabricmethod;

public class BrickHouse extends House{
    private boolean warm;

    public BrickHouse(boolean warm) {
        super("Кирпич","40", "10");
        this.warm = warm;
    }

    @Override
    public String toString() {
        return "Домик из кирпича" + (warm ? " с теплом " : "");
    }
}
