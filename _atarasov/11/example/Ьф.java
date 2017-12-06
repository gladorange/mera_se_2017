package example;

import example.Cocktail.CocktailBuilder;

public class Ьф {
    public static void main(String[] args) {
        Cocktail b = new CocktailBuilder("Молоко")
                .addContent("шоколад")
                .addToping("Вишенка")
                .build();

        System.out.println(b.toString());

        Cocktail b2= new CocktailBuilder().addContent("Хлеб").build();

        System.out.println(b2);


    }
}
