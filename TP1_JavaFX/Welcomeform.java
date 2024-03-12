package application;

	import javafx.application.Application;
	import javafx.application.Platform;
	import javafx.geometry.Insets;
	import javafx.geometry.Pos;
	import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.control.Label;
	import javafx.scene.control.PasswordField;
	import javafx.scene.control.TextField;
	import javafx.scene.layout.GridPane;
	import javafx.scene.layout.HBox;
	import javafx.scene.text.Font;
	import javafx.scene.text.FontWeight;
	import javafx.scene.text.Text;
	import javafx.stage.Stage;

public class Welcomeform extends Application{

	    private static final String USERNAME = "hana";
	    private static final String PASSWORD = "hana123";
	    
	    public void start(Stage primaryStage) {
	        primaryStage.setTitle("JavaFX Welcome");

	        GridPane grid = new GridPane();
	        grid.setAlignment(Pos.CENTER);
	        grid.setHgap(10);
	        grid.setVgap(10);
	        grid.setPadding(new Insets(25, 25, 25, 25));
	        Scene scene = new Scene(grid, 300, 275);
	        primaryStage.setScene(scene);

	        Text scenetitle = new Text("Welcome");
	        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
	        grid.add(scenetitle, 0, 0, 2, 1);

	        Label userName = new Label("User Name:");
	        grid.add(userName, 0, 1);
	        TextField userTextField = new TextField();
	        grid.add(userTextField, 1, 1);

	        Label pw = new Label("Password:");
	        grid.add(pw, 0, 2);
	        PasswordField pwBox = new PasswordField();
	        grid.add(pwBox, 1, 2);

	        Button signInBtn = new Button("Sign in");
	        Button exitBtn = new Button("Exit");
	        HBox hbBtn = new HBox(10);
	        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
	        hbBtn.getChildren().addAll(signInBtn, exitBtn);
	        grid.add(hbBtn, 1, 4);

	        final Text actiontarget = new Text();
	        grid.add(actiontarget, 1, 6);

	        signInBtn.setOnAction(e -> {
	           if (USERNAME.equals(userTextField.getText()) && PASSWORD.equals(pwBox.getText())) {
	                actiontarget.setFill(javafx.scene.paint.Color.GREEN);
	                actiontarget.setText("Sign in Correct, Welcome " + userTextField.getText() + "!");
	            } else {
	                actiontarget.setFill(javafx.scene.paint.Color.RED);
	                actiontarget.setText("Nom d'utilisateur ou mot de passe incorrect");
	            }
	        });

	        exitBtn.setOnAction(e -> Platform.exit());
	        primaryStage.show();
	    }

	}

