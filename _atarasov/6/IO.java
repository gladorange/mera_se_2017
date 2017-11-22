import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String lineFromUser = br.readLine();

        FileOutputStream f = new FileOutputStream("some.file.txt");
        f.write((byte)50);
        f.write((byte)51);
        f.write((byte)52);
        f.write((byte)53);
        f.write((byte)54);
        f.close();

        FileWriter f2 = new FileWriter("some-text-file.txt");
        f2.append("Kakoi-to text. И на русском тоже");
        f2.close();

        try (FileInputStream s = new FileInputStream("some-text-file.txt")) {
            int b = s.read();
            while (b != -1) {
                System.out.println(b);
                b = s.read();
            }
        }
    }
}
