import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.function.Function;

public class Maps {




    public static void main(String[] args) {

        Comparator<String> stringComparator = (o1, o2) -> o1.compareToIgnoreCase(o2);
        Map<String, List<String>> recipes = new TreeMap<>(stringComparator);

        String borsh = "борщ";
        List<String> productsForBorsh = Arrays.asList("капуста", "мясо", "вода","картошка");

        String zapekanka = "запеканка";
        List<String> productsForZapekanka = Arrays.asList("творог", "масло", "яйца");

        recipes.put(borsh, productsForBorsh);
        recipes.put(zapekanka, productsForZapekanka);

        List<String> prod = recipes.get("борщ");
        System.out.println("Продукты для борща");
        for (String s : prod) {
            System.out.println(s);
        }


        System.out.println("Продукты для каши");
        for (String s : recipes.getOrDefault("каша", Arrays.asList("молоко"))) {
            System.out.printf(s);
        }

        System.out.println("Продукты для яицницы");
        Function<String, List<String>> stringListFunction = (str) -> Arrays.asList(str, "Вода");

        for (String s : recipes.computeIfAbsent("Яичница", stringListFunction)) {
            System.out.println(s);
        }

        System.out.println("Ключи");
        Iterator<String> iterator = recipes.keySet().iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.equals("Яичница")) {
                iterator.remove();
            } else {
                System.out.println(s);
            }

        }

        for (Entry<String, List<String>> stringListEntry : recipes.entrySet()) {
            System.out.println(stringListEntry.getKey());
            System.out.println("=");
            System.out.println(stringListEntry.getValue());
        }

    }

}
