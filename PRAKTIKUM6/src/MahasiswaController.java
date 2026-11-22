import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MahasiswaController {
    private MahasiswaView view;
    private ObservableList<Mahasiswa> data;

    public MahasiswaController(MahasiswaView view) {
        this.view = view;
        this.data = FXCollections.observableArrayList();
        loadData();
        this.view.getTableView().setItems(data);
    }

    private void loadData() {
        data.add(new Mahasiswa(1, "John", "123"));
        data.add(new Mahasiswa(2, "Jane", "124"));
        data.add(new Mahasiswa(3, "Jono", "124123"));
        data.add(new Mahasiswa(4, "Agus", "1241234"));
        data.add(new Mahasiswa(5, "Haris", "2401001"));
        data.add(new Mahasiswa(6, "Enny", "2401002"));
        data.add(new Mahasiswa(7, "Chandra", "2401003"));
        data.add(new Mahasiswa(8, "Chiko", "2401004"));
        data.add(new Mahasiswa(9, "Acha", "2401005"));
        data.add(new Mahasiswa(10, "Ecy", "2401006"));
    }

    public ObservableList<Mahasiswa> getData() {
        return data;
    }
} 