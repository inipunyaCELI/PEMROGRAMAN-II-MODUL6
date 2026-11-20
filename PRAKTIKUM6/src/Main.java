import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        TableView<Mahasiswa> tableView = new TableView<>();

        TableColumn<Mahasiswa, String> colNim = new TableColumn<>("NIM");
        colNim.setCellValueFactory(new PropertyValueFactory<>("nim"));

        TableColumn<Mahasiswa, String> colNama = new TableColumn<>("Nama");
        colNama.setCellValueFactory(new PropertyValueFactory<>("nama"));

        tableView.getColumns().add(colNim);
        tableView.getColumns().add(colNama);
        tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        ObservableList<Mahasiswa> data = FXCollections.observableArrayList(
                new Mahasiswa(1, "John", "123"),
                new Mahasiswa(2, "Jane", "124"),
                new Mahasiswa(3, "Jono", "124123"),
                new Mahasiswa(4, "Agus", "1241234"),
                new Mahasiswa(5, "Haris", "2401001"),
                new Mahasiswa(6, "Enny", "2401002"),
                new Mahasiswa(7, "Chandra", "2401003"),
                new Mahasiswa(8, "Chiko", "2401004"),
                new Mahasiswa(9, "Acha", "2401005"),
                new Mahasiswa(10, "Ecy", "2401006")
        );
        tableView.setItems(data);

        StackPane root = new StackPane(tableView);
        Scene scene = new Scene(root, 300, 450);
        stage.setTitle("Data Mahasiswa");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}