package example.fabricmethod;

public class HouseBuilder {

    public House makeHouse() {
        House r = new House("Бревна", "4", "1");
        return r;
    }
    public House makeBrickHouse() {
        House r = new BrickHouse(false);
        return r;
    }

}
