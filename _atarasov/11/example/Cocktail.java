package example;

public class Cocktail {
    private String liquid;
    private String content;
    private String toppin;

    public Cocktail(String liquid, String content, String toppin) {

        this.liquid = liquid;
        this.content = content;
        this.toppin = toppin;
    }

    public String getLiquid() {
        return liquid;
    }

    public String getContent() {
        return content;
    }

    public String getToppin() {
        return toppin;
    }

    @Override
    public String toString() {
        return "коктейли из " + liquid + " наполненный " + content + ", а наверху у него" + toppin;
    }

    public static class CocktailBuilder {
        private String liquid;
        private String content;
        private String toppin;


        public CocktailBuilder() {
            liquid = "Вода";
        }

        public CocktailBuilder(String liquid) {
            this.liquid = liquid;
        }

        public CocktailBuilder addContent(String content) {
            this.content = content;
            return this;
        }

        public CocktailBuilder addToping(String toping) {
            this.toppin = toping;
            return this;
        }


        public Cocktail build() {
            return new Cocktail(liquid, content, toppin);
        }

    }


}
