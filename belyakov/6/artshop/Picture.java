package artshop;

import static java.util.stream.Collectors.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
* Добавить класс Картина.
* В картине есть название, год рисования, стиль и автор.
*
* В классе Картина - "Нарисова тем-то в таком-то году в таком-то стиле"
*/
public class Picture extends ItemForSale
{


    public static class Pers {
        String name;
        int age;

        public Pers(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public static void main(String[] args) {

        List<Pers> pList = new ArrayList<>();
        pList.add(new Pers("A", 42));
        pList.add(new Pers("B", 42));
        pList.add(new Pers("C", 44));
        pList.add(new Pers("D", 44));
        pList.add(new Pers("old", 100500));
        pList.add(new Pers("min", -42));

        Map<Integer, List<Pers>> collect = pList.stream()
                .collect(groupingBy(pers -> pers.age));

        Pers max = Collections.max(pList, Comparator.comparing(Pers::getAge));
        Pers min = Collections.min(pList, Comparator.comparing(Pers::getAge));

        System.out.println(collect);

    }








































    public Picture(String title, String year, String style, Painter painter)
    {
        super(title, year);
        style_   = style;
        painter_ = painter;
        
        setPriceInDollars();
    }

    public static Picture createFromString(String data, ArrayList<Painter> painters)
    {
        System.out.println(data); //TODO: remove

        String[] splitResult = data.split(DELIMITER);

        if (splitResult.length != 4) //number of fields for author
        {
            System.out.println("Incorrect data for author:\n" + data);
            return null;
        }
        
        Painter painter = null;
        
        for (Painter existingPainter : painters)
        {
            if (existingPainter.getFinalName().equals(splitResult[3]) )
            {
                painter = existingPainter;
                break;
            }
        }

        if (null == painter)
        {
            System.out.println("Can't find painter for picture " + data);
            return null;
        }
        
        Picture picture = new Picture(splitResult[0], splitResult[1], splitResult[2], painter);
        painter.addPicture(picture);
        return picture;
    }

    @Override
    public String getDescription()
    {
        return ("\"" + getTitle() + "\"" + " by " + painter_.getFirstName() + " " + painter_.getFinalName() +
                ", finished in " + getYear() + ", painted in " + style_ + " style.");
    }

    //Getters & Setrers
    public String getStyle() { return style_; }

    public Painter getAuthor() { return painter_; }
    
    //Fields
    private String style_;
    private Painter painter_;
    //
}
