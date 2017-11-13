public class Cat extends Animal implements WildAnimal, VeganAnimal{
    @Override
    public String doNoise() {
        return "Meow!!";
    }

    @Override
    public void eatVegetable(String vegatable) {
        System.out.println("Съел " + vegatable);
    }

    @Override
    public void eatSomeone(String someone) {
        System.out.println("Поймал и съел " + someone);
    }
}
