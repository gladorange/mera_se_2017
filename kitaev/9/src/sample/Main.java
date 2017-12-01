package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main extends Application {
    private static ObservableList<Book> bookData = FXCollections.observableArrayList();

    @Override
    public void start(Stage primaryStage) throws Exception {
        FileInputStream b = new FileInputStream("BOOKS.TXT");
        BufferedReader bufferBooks = new BufferedReader(new InputStreamReader(b));
        String booksLine;
        while ((booksLine = bufferBooks.readLine()) != null) {
            String[] array = booksLine.split("\t");
            bookData.add(new Book(array[0], array[1], array[2], array[3], array[4]));
        }
        bufferBooks.close();
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("The list of books");
        primaryStage.setScene(new Scene(root, 430, 275));
        primaryStage.show();
    }

    public static ObservableList<Book> getBookData() {
        return bookData;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
