package example.templatemethod;

public class ChocolateMilk extends AbstractCocktailMaker {
    @Override
    protected String getContent() {
        return "шоколад";
    }

    @Override
    protected String getLiquid() {
        return "Молоко";
    }

    @Override
    protected String getTopping() {
        return "Вишенка";
    }
}
