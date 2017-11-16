public class Fish extends Animal implements VeganAnimal {

    @Override
    public String doNoise() {
        return "";
    }

    @Override
    public void eatVegetable(String vegatable) {
        System.out.println("*Идут пузырьки*");
    }
}
