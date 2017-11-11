public interface VeganAnimal {

    void eatVegetable(String vegatable);

    default boolean isHungry() {
        return true;
    }
}
