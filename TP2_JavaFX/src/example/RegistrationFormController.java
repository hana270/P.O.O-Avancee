package example;
	import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
	import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
	import javafx.scene.control.PasswordField;
	import javafx.scene.control.TextField;
	import javafx.stage.Window;
	
public class RegistrationFormController {
	@FXML
	private TextField nameField;
	@FXML
	private TextField emailField;
	@FXML
	private PasswordField passwordField;
	@FXML
	private Button submitButton;
	@FXML
	protected void handleSubmitButtonAction(ActionEvent event)
	{
	Window owner = submitButton.getScene().getWindow();
	if(nameField.getText().isEmpty()) {
	Alert alert = new Alert(AlertType.ERROR);
	alert.setTitle("Form Error!");
	alert.setHeaderText(null);
	alert.setContentText("Please enter your name");
	alert.initOwner(owner);
	alert.show();


	}else {
		System.out.println("Welcome " + nameField.getText());
	}
	}
	}
