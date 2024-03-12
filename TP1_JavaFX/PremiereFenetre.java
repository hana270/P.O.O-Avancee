package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PremiereFenetre extends Application{


    public void start(Stage primaryStage) {
        Group root = new Group(); 
        Scene scene = new Scene(root, 400, 300);
        // Ajout d'une ligne
        Line ligne = new Line(50, 50, 200, 50);
        ligne.setStroke(Color.BLUE);
        root.getChildren().add(ligne);  
        // Ajout d'un rectangle
        Rectangle rectangle = new Rectangle(50, 100, 150, 80);
        rectangle.setFill(Color.BLACK);
        root.getChildren().add(rectangle);
        // Ajout d'un cercle
        Circle cercle = new Circle(300, 200, 30);
        cercle.setFill(Color.BROWN);
        root.getChildren().add(cercle); 
        primaryStage.setScene(scene);
        primaryStage.setTitle("Ma Première Fenêtre JavaFX");
        // Afficher
        primaryStage.show();

}	
}
