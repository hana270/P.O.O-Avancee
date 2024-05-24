package gestionEtudiants;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class EtudiantController {
	 @FXML private TextField nomField;
	    @FXML private TextField prenomField;
	    @FXML private RadioButton sexeM;
	    @FXML private RadioButton sexeF;
	    @FXML private ComboBox<String> filiereComboBox;
	    @FXML private TableView<Etudiant> etudiantTable;
	    @FXML private TableColumn<Etudiant, Integer> idColumn;
	    @FXML private TableColumn<Etudiant, String> nomColumn;
	    @FXML private TableColumn<Etudiant, String> prenomColumn;
	    @FXML private TableColumn<Etudiant, String> sexeColumn;
	    @FXML private TableColumn<Etudiant, String> filiereColumn;
	    
	    private ToggleGroup sexeGroup;
	    private EtudiantM etudiantM;

	    @FXML
	    public void initialize() {
	        etudiantM = new EtudiantM();

	        sexeGroup = new ToggleGroup();
	        sexeM.setToggleGroup(sexeGroup);
	        sexeF.setToggleGroup(sexeGroup);
	        
	        filiereComboBox.setItems(FXCollections.observableArrayList("Informatique", "Mathématiques", "Physique"));

	        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
	        nomColumn.setCellValueFactory(new PropertyValueFactory<>("nom"));
	        prenomColumn.setCellValueFactory(new PropertyValueFactory<>("prenom"));
	        sexeColumn.setCellValueFactory(new PropertyValueFactory<>("sexe"));
	        filiereColumn.setCellValueFactory(new PropertyValueFactory<>("filiere"));

	        refreshTable();
	    }

	    @FXML
	    public void ajouterEtudiant() {
	        String nom = nomField.getText();
	        String prenom = prenomField.getText();
	        String sexe = ((RadioButton) sexeGroup.getSelectedToggle()).getText();
	        String filiere = filiereComboBox.getValue();
	        
	        Etudiant etudiant = new Etudiant(nom, prenom, sexe, filiere);
	        etudiantM.create(etudiant);
	        refreshTable();
	    }

	    @FXML
	    public void modifierEtudiant() {
	        Etudiant selectedEtudiant = etudiantTable.getSelectionModel().getSelectedItem();
	        if (selectedEtudiant != null) {
	            selectedEtudiant.setNom(nomField.getText());
	            selectedEtudiant.setPrenom(prenomField.getText());
	            selectedEtudiant.setSexe(((RadioButton) sexeGroup.getSelectedToggle()).getText());
	            selectedEtudiant.setFiliere(filiereComboBox.getValue());
	            etudiantM.update(selectedEtudiant);
	            refreshTable();
	        }
	    }

	    @FXML
	    public void supprimerEtudiant() {
	        Etudiant selectedEtudiant = etudiantTable.getSelectionModel().getSelectedItem();
	        if (selectedEtudiant != null) {
	            etudiantM.delete(selectedEtudiant);
	            refreshTable();
	        }
	    }

	    private void refreshTable() {
	        ObservableList<Etudiant> etudiants = FXCollections.observableArrayList(etudiantM.findAll());
	        etudiantTable.setItems(etudiants);
	    }
	}