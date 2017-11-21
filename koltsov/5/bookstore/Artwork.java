package bookstore;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Artwork extends ItemForSale{
    private Painter author;
    private String  drawingStyle;

    public Artwork(String name, int creationYear, int price, Painter author, String drawingStyle) throws InvalidPriceException {
        super(name, creationYear, price);
        this.author = author;
        this.drawingStyle = drawingStyle;

        this.author.getArtWorks().add(this);
    }

    public static ArrayList<Artwork> loadFromFile(String fileName, ArrayList<Painter> painters) {
        ArrayList<Artwork> pictures = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String pictureStr = br.readLine();

            while (pictureStr != null) {
                try {
                    Artwork picture = createPictureFromString(pictureStr, painters);
                    pictures.add(picture);
                } catch (ParseException | InvalidPriceException | UnknownCreatorException e) {
                    e.printStackTrace();
                }
                pictureStr = br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }

        return pictures;
    }

    private static Artwork createPictureFromString(String pictureStr, ArrayList<Painter> painters) throws ParseException, InvalidPriceException, UnknownCreatorException {
        StringTokenizer pictureFields = new StringTokenizer(pictureStr, "\t");

        ArrayList<String> fields = new ArrayList<>();
        while (pictureFields.hasMoreTokens()) {
            fields.add(pictureFields.nextToken());
        }

        if (fields.size() != 5)
            throw new ParseException("Должно быть 5 полей для инициализации книги. В строке было найлено только " + fields.size() +
                    ". Переданная строка: " + pictureStr, fields.size());

        Painter pictureCreator = findCreator(painters, fields.get(3), fields.get(4));
        Artwork picture = new Artwork(fields.get(0), Integer.valueOf(fields.get(1)), 0, pictureCreator, fields.get(2));

        return picture;
    }

    private static Painter findCreator(ArrayList<Painter> painters, String firstName, String secondName) throws UnknownCreatorException {
        for (Painter painter : painters) {
            if (painter.getFirstName().equals(firstName) && painter.getSecondName().equals(secondName)) {
                return painter;
            }
        }

        throw new UnknownCreatorException("Автор не найден. Переданные данные для поиска: " +
                firstName + " " + secondName);
    }

    public Painter getAuthor() {
        return author;
    }

    public void setAuthor(Painter author) {
        this.author = author;
    }

    public String getDrawingStyle() {
        return drawingStyle;
    }

    public void setDrawingStyle(String drawingStyle) {
        this.drawingStyle = drawingStyle;
    }

    @Override
    public String toString() {
        return "Artwork{" +
                "author=" + author +
                ", drawingStyle='" + drawingStyle + '\'' +
                ", name='" + name + '\'' +
                ", creationYear=" + creationYear +
                ", price=" + price +
                '}';
    }

    @Override
    protected String getDescription() {
        return this.getClass().getSimpleName() + " " + name + ": written by " +author.getSecondName() +
                " in " + creationYear + " year, in " + drawingStyle + " style";
    }
}
