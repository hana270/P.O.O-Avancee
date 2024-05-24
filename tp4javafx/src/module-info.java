module tp4javafx {
    requires javafx.controls;
    requires java.sql;
    requires javafx.fxml;

    opens application to javafx.graphics, javafx.fxml;
    opens gestionEtudiants to javafx.fxml, javafx.base; // Ouverture à javafx.base

    exports gestionEtudiants to javafx.fxml;
}
