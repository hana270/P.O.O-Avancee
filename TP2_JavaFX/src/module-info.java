module EX2JAVAFX {
	requires javafx.controls;
	requires javafx.base;
	requires javafx.fxml;
	
	opens application to javafx.graphics, javafx.fxml;
	exports example;
}
