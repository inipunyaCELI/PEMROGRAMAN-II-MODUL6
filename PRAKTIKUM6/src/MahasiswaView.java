import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;

public class MahasiswaView {
    private TableView<Mahasiswa> tableView;
    private StackPane root;

    public MahasiswaView() {
        tableView = new TableView<>();

        TableColumn<Mahasiswa, String> colNim = new TableColumn<>("NIM");
        colNim.setCellValueFactory(new PropertyValueFactory<>("nim"));

        TableColumn<Mahasiswa, String> colNama = new TableColumn<>("Nama");
        colNama.setCellValueFactory(new PropertyValueFactory<>("nama"));

        tableView.getColumns().add(colNim);
        tableView.getColumns().add(colNama);
        tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        root = new StackPane(tableView);
    }

    public TableView<Mahasiswa> getTableView() {
        return tableView;
    }

    public StackPane getRoot() {
        return root;
    }
}