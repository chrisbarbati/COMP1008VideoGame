module com.example.comp1008videogame {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.comp1008videogame to javafx.fxml;
    exports com.example.comp1008videogame;
}