package example.templatemethod;

public class WaterBreadMaker extends AbstractCocktailMaker {
    @Override
    protected String getContent() {
        return "Хлеб";
    }

    @Override
    protected String getLiquid() {
        return "вода";
    }

    @Override
    protected String getTopping() {
        return "соль";
    }
}
