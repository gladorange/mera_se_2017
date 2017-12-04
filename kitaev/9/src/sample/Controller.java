package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class Controller {
    @FXML
    private TableView<Book> bookTable;
    @FXML
    private TableColumn<Book, String> nameColumn;
    @FXML
    private TableColumn<Book, String> yearColumn;
    @FXML
    private TableColumn<Book, String> numberOfPagesColumn;
    @FXML
    private TableColumn<Book, String> authorColumn;
    @FXML
    private TableColumn<Book, String> priceColumn;

    public Controller() {
    }

    @FXML
    private void initialize() {
        // Initialize the person table with the two columns.
        nameColumn.setCellValueFactory(
                cellData -> cellData.getValue().nameProperty());
        yearColumn.setCellValueFactory(
                cellData -> cellData.getValue().yearProperty());
        numberOfPagesColumn.setCellValueFactory(
                cellData -> cellData.getValue().numberOfPagesProperty());
        authorColumn.setCellValueFactory(
                cellData -> cellData.getValue().authorProperty());
        priceColumn.setCellValueFactory(
                cellData -> cellData.getValue().priceProperty());

        bookTable.setItems(Main.getBookData());
    }
}
