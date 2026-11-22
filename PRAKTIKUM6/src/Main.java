import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        MahasiswaView view = new MahasiswaView();
        MahasiswaController controller = new MahasiswaController(view);

        Scene scene = new Scene(view.getRoot(), 300, 450);
        stage.setTitle("Data Mahasiswa");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}