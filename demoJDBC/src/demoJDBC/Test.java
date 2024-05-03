package demoJDBC;

import java.util.List;

import ma.projet.beans.client;
import ma.projet.connexion.connexion;
import ma.projet.service.ClientService;

public class Test {
    public static void main(String[] args) {
        ClientService clientService = new ClientService();

        // Création des clients
        clientService.create(new client("BELHADJ", "Ali"));
        clientService.create(new client("ALAOUI", "Waaed"));
        clientService.create(new client("Laribi", "Amine"));
        clientService.create(new client("Laribi", "Kamal"));
        clientService.create(new client("belhadj", "Mohamed"));

        // Afficher le client dont id = 3
        client clientWithId3 = clientService.findById(3);
        if (clientWithId3 != null) {
            System.out.println("Client avec ID 3 : " + clientWithId3.getNom() + " " + clientWithId3.getPrenom());
        } else {
            System.out.println("Aucun client trouvé avec l'ID 3");
        }

        // Supprimer le client dont id = 3
        clientWithId3 = clientService.findById(3);
        if (clientWithId3 != null) {
            clientService.delete(clientWithId3);
            System.out.println("Client avec ID 3 supprimé avec succès");
        } else {
            System.out.println("Aucun client trouvé avec l'ID 3, suppression impossible");
        }

        // Modifier le client dont id = 2
        client cu = clientService.findById(2);
        if (cu != null) {
        	cu.setNom("Hana");
        	cu.setPrenom("Belhadj");
            clientService.update(cu);
            System.out.println("Client avec ID 2 mis à jour avec succès");
        } else {
            System.out.println("Aucun client trouvé avec l'ID 2, mise à jour impossible");
        }

        // Afficher la liste de tous les clients
        List<client> allClients = clientService.findAll();
        System.out.println("Liste de tous les clients :");
        for (client client : allClients) {
            System.out.println(client.getNom() + " " + client.getPrenom());
        }
    }
}
