package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            Welcomeform welcomeForm = new Welcomeform();
            welcomeForm.start(primaryStage);

            PremiereFenetre premiereFenetre = new PremiereFenetre();
            premiereFenetre.start(new Stage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
