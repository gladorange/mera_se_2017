public class Dog extends Animal implements VeganAnimal, WildAnimal{
    @Override
    public String doNoise() {
        return "Gav";
    }

    @Override
    public void eatVegetable(String vegatable) {
        System.out.println("брыыыыы");
    }

    @Override
    public void eatSomeone(String someone) {
        System.out.println("воу-воу.!гав");
    }
}
