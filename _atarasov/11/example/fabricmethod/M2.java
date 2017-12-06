package example.fabricmethod;

public class M2 {

    public static void main(String[] args) {
        HouseBuilder b = new HouseBuilder();
        System.out.println(b.makeHouse());
        System.out.println(b.makeBrickHouse());
    }
}
