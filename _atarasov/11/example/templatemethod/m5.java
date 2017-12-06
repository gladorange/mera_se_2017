package example.templatemethod;

public class m5 {

    public static void main(String[] args) {
        AbstractCocktailMaker с = new ChocolateMilk();
        AbstractCocktailMaker с1 = new WaterBreadMaker();

        System.out.println(с.createCocktail());
        System.out.println(с1.createCocktail());
    }



}
