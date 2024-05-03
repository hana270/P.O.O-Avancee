package ma.projet.connexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class connexion {
    
    private static final String URL = "jdbc:mysql://localhost:3306/demoJDBC";
    
    public static Connection obtenirConnexion() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection( "jdbc:mysql://localhost:3306/demoJDBC","root","");
        } catch (ClassNotFoundException e) {
            System.err.println("Erreur de chargement du driver MySQL : " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Erreur lors de la connexion à la base de données : " + e.getMessage());
        }
        return connection;
    }

    public static void fermerConnexion(Connection connexion) {
        if (connexion != null) {
            try {
                connexion.close();
                System.out.println("Cnx Fermée avec succès !");
            } catch (SQLException e) {
                System.err.println("Erreur fermeture de la connexion : " + e.getMessage());
            }
        }
    }
}
