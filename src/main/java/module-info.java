module com.example.fx_crossknots {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fx_crossknots to javafx.fxml;
    exports com.example.fx_crossknots;
}