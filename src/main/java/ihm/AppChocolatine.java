package ihm;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import service.ChocolatineService;
import util.Constantes;


public class AppChocolatine {

    private ArrayList<Commande> listeCommandes = new ArrayList<Commande>();
    private ArrayList<Livreur> listeLivreur = new ArrayList<Livreur>();
    
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        AppChocolatine app = new AppChocolatine();
    
        app.runApp();

    }

    public void runApp() {

        int choix = 0;
        

        System.out.println("----------------- Bienvenue Chez les Chocolatines de Glen -----------------");
        while (choix != 7) {

            System.out.println("\t1. Lister les Chocolatines");
            System.out.println("\t2. Créer une chocolatine");
            System.out.println("\t3. Créer une commande");
            System.out.println("\t4. Top 5 des chocolatines");
            System.out.println("\t5. Créer un livreur");
            System.out.println("\t6. Affecter un livreur a une commande");
            System.out.println("\t7. Quitter");
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("Que souhaitez-vous faire? :");
            choix = scanner.nextInt();

            switch (choix) {
            case 1:
                System.out.println();
                break;

            case 2:
                
                creerChocolatine();
                break;

            case 3:
                
                //creerCommande();
                
                
                break;

            case 4:

                break;

            case 5:
                ;
                break;

            case 6:

                break;

            case 7:
                System.out.println("Fermeture de l'application");
                break;
            default:
                System.out.println("Je n'ai pas compris la requete");
                break;
            }
        }
        scanner.close();

    }
    
//    public void initChocolatine() {
//        
//        Chocolatine chocoVanille = new Chocolatine("la Choco Vanille", 1.15f, 45.3f, 124.3f);
//        Chocolatine chocoCanelle = new Chocolatine("la Choco Canelle", 1.19f, 45.9f, 137.3f);
//        Chocolatine chocoCaramel = new Chocolatine("la Choco Caramel", 1.35f, 44.7f, 137.7f);
//        Chocolatine chocoBlanc = new Chocolatine("la Choco chocolat blanc", 1.64f, 47.1f, 178.9f);
//        
//        listeChocolatine.add(chocoVanille);
//        listeChocolatine.add(chocoCanelle);
//        listeChocolatine.add(chocoCaramel);
//        listeChocolatine.add(chocoBlanc);
//    }
    
    public void creerChocolatine() {
        
        scanner.nextLine();
        System.out.println("Saisir un nom de chocolatine: ");
        String nom = scanner.nextLine();
        
        System.out.println("Saisir un prix: ");
        float prix = scanner.nextFloat();
        
        System.out.println("Saisir une temperature: ");
        float temperature = scanner.nextFloat();
        
        System.out.println("Saisir un poids: ");
        float poids = scanner.nextFloat();
        
        Chocolatine c = Constantes.CHOCOLATINE_SERVICE.addChoco(nom, prix, temperature, poids);
        
        System.out.println(c);
                
        
        
    }
    
//    public void creerCommande() {
//        
//        int choix = 0;
//        int quantite = 0;
//        
//        System.out.println("Selectionnez les articles que vous souhaitez commander (en selectionnant leur id): ");
//        System.out.println(listeChocolatine);
//        choix = scanner.nextInt();
//        System.out.println("Selectionnez la quantité souhaitée: ");
//        quantite = scanner.nextInt();
//        
//        Commande commande = new Commande();
//        //commande.addArticle(choco, quantite);
        
       
                
        
        
    }


