module com.company.snakegame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.company.snakegame to javafx.fxml;
    exports com.company.snakegame;
}