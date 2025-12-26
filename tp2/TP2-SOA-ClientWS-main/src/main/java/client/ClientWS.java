package client;

import org.example.client.ws.BanqueService;
import org.example.client.ws.BanqueServiceService;
import org.example.client.ws.Compte;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        try {
            System.out.println("=== Démarrage du Client WS ===");

            // Créer le service web
            BanqueServiceService service = new BanqueServiceService();
            BanqueService port = service.getBanqueServicePort();

            // Test 1: Conversion
            System.out.println("1. Test conversion:");
            double result = port.conversion(100);
            System.out.println("100 EUR = " + result);

            // Test 2: Get Compte - CORRECTION ICI : utilisez 1 au lieu de 1L
            System.out.println("\n2. Test getCompte:");
            Compte compte = port.getCompte(1);  // ← SUPPRIMEZ LE "L"
            if (compte != null) {
                System.out.println("Compte trouvé - Code: " + compte.getCode() + ", Solde: " + compte.getSolde());
            } else {
                System.out.println("Compte non trouvé");
            }

            // Test 3: Get Liste des Comptes
            System.out.println("\n3. Test getComptes:");
            List<Compte> comptes = port.getComptes();
            System.out.println("Nombre de comptes: " + comptes.size());
            for (Compte c : comptes) {
                System.out.println(" - Code: " + c.getCode() + ", Solde: " + c.getSolde());
            }

            System.out.println("\nTous les tests sont réussis !");

        } catch (Exception e) {
            System.err.println("Erreur lors de l'appel du service web:");
            e.printStackTrace();
        }
    }
}