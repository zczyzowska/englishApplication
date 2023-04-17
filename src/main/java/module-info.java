module englishApp {
    requires javafx.controls;
    requires javafx.fxml;


    opens englishApp to javafx.fxml;
    exports englishApp;
}