package example.adapter;

public class m4 {

    public static void main(String[] args) {
        Bird cr = new Crow();
        cr.fly();

        Pinguin p = new Pinguin();
        Bird bird = new PinuinAdapter(p);

        bird.fly();
    }

    public static class PinuinAdapter implements Bird {

        Pinguin pinguin;

        public PinuinAdapter(Pinguin pinguin) {
            this.pinguin = pinguin;
        }

        @Override
        public void fly() {
            for (int i = 0; i < 5; i++) {
                pinguin.walk();
            }
        }
    }

}
