package example.templatemethod;

import example.Cocktail;

public abstract class AbstractCocktailMaker  {

    final public Cocktail createCocktail() {
        Cocktail cocktail = new Cocktail(getLiquid(), getContent(), getTopping());
        if (cocktail.getContent().equals("Хлеб")) {
            System.out.println("А может поесть?");
        }
        return cocktail;
    }

    protected abstract String getContent();

    protected abstract String getLiquid();

    protected abstract String getTopping();
}
