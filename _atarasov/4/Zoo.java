import java.util.ArrayList;

public class Zoo {
    ArrayList<Animal> animals = new ArrayList<>();

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal fish = new Fish();

        Zoo z = new Zoo();
        z.animals.add(dog);
        z.animals.add(cat);
        z.animals.add(fish);

        for (Animal animal : z.animals) {
            System.out.println(animal.doNoise());

            if (animal instanceof VeganAnimal) {
                VeganAnimal vegan = (VeganAnimal) animal;
                vegan.eatVegetable("Морковка");
            }

            if (animal instanceof WildAnimal) {
                ((WildAnimal) animal).eatSomeone("Мармелад");
            }
        }

    }
}
