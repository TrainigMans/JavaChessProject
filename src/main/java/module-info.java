module com.example.chessapplicationproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chessapplicationproject to javafx.fxml;
    exports com.example.chessapplicationproject;
}