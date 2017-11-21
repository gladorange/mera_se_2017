package bookstore;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;

public class Painter extends Person {
    protected String drawingStyle;
    protected ArrayList<Artwork> artWorks;

    public Painter(String firstName, String secondName, String country, Date birthday, String drawingStyle, ArrayList<Artwork> artWorks) {
        super(firstName, secondName, country, birthday);
        this.drawingStyle = drawingStyle;
        this.artWorks = artWorks;
    }

    public static ArrayList<Painter> loadFromFile(String fileName) {
        ArrayList<Painter> painters = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String painterStr = br.readLine();

            while (painterStr != null) {
                try {
                    Painter painter = createPainterFromString(painterStr);
                    painters.add(painter);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                painterStr = br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }

        return painters;
    }

    private static Painter createPainterFromString(String painterStr) throws ParseException {
        StringTokenizer painterFields = new StringTokenizer(painterStr, "\t");

        ArrayList<String> fields = new ArrayList<>();
        while (painterFields.hasMoreTokens()) {
            fields.add(painterFields.nextToken());
        }

        if (fields.size() != 5)
            throw new ParseException("Должно быть 5 полей для инициализации художника. В строке было найлено только " + fields.size() +
                    ". Переданная строка: " + painterStr, fields.size());

        Painter painter = new Painter(fields.get(0), fields.get(1), fields.get(2),
                new SimpleDateFormat("dd.MM.yyyy").parse(fields.get(3)),
                fields.get(4), new ArrayList<>());

        return painter;
    }

    @Override
    public String toString() {
        return "Painter{" +
                "drawingStyle='" + drawingStyle + '\'' +
                ", number artWorks=" + artWorks.size() +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", country='" + country + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public String getDrawingStyle() {
        return drawingStyle;
    }

    public void setDrawingStyle(String drawingStyle) {
        this.drawingStyle = drawingStyle;
    }

    public ArrayList<Artwork> getArtWorks() {
        return artWorks;
    }

    public void setArtWorks(ArrayList<Artwork> artWorks) {
        this.artWorks = artWorks;
    }
}
