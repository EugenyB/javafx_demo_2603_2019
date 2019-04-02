package controller;

import data.Student;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.List;

public class Controller {
    @FXML private TableView<Student> table;
    @FXML private TableColumn<Student,Integer> idColumn;
    @FXML private TableColumn<Student, String> nameColumn;
    @FXML private TableColumn<Student, Integer> ageColumn;
    @FXML
    private ListView<Student> list;

    @FXML
    public void initialize() {
        List<Student> students = List.of(
                new Student(1, "Ivanov", 25),
                new Student(3, "Petov", 19),
                new Student(3, "Petov", 19),
                new Student(3, "Petov", 19),
                new Student(3, "Petov", 19),
                new Student(3, "Petov", 19),
                new Student(3, "Petov", 19),
                new Student(3, "Petov", 19),
                new Student(3, "Petov", 19),
                new Student(3, "Petov", 19),
                new Student(3, "Petov", 19),
                new Student(3, "Petov", 19),
                new Student(3, "Petov", 19),
                new Student(3, "Petov", 19),
                new Student(3, "Petov", 19),
                new Student(4, "Kotovsky", 20)
        );
        list.setItems(FXCollections.observableList(students));

        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        ageColumn.setCellValueFactory(new PropertyValueFactory<>("age"));
        table.setItems(FXCollections.observableList(students));
    }

    public void about() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION, "Наша мега крутая программа");
        alert.setTitle("About");
        alert.setHeaderText(null);
        alert.show();
    }

    public void close() {
        Platform.exit();
    }
}
