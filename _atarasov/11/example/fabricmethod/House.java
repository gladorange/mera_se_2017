package example.fabricmethod;

public class House {

    private String walls;
    private String windows;
    private String floors;

    public House(String walls, String windows, String floors) {
        this.walls = walls;
        this.windows = windows;
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "House{" + "walls='" + walls + '\'' + ", windows='" + windows + '\'' + ", floors='" + floors + '\''
                + '}';
    }
}
