package ihm;


import java.util.List;
import java.util.Scanner;


import util.Constantes;


public class AppChocolatine {

    
    
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        AppChocolatine app = new AppChocolatine();
   
        app.runApp();

    }

    public void runApp() {

        int choix = 0;
        

        System.out.println("----------------- Bienvenue Chez les Chocolatines de Glen -----------------");
        while (choix != 7) {

        	
        	System.out.println("---------------------------------------------------------------------------");
        	System.out.println("Que souhaitez-vous faire? :");
        	System.out.println("\t1. Lister les Chocolatines");
            System.out.println("\t2. Créer une chocolatine");
            System.out.println("\t3. Créer une commande");
            System.out.println("\t4. Top 5 des chocolatines");
            System.out.println("\t5. Créer un livreur");
            System.out.println("\t6. Affecter un livreur a une commande");
            System.out.println("\t7. Quitter");
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("Veuillez saisir votre choix:");
            choix = scanner.nextInt();

            switch (choix) {
            case 1:
                System.out.println(Constantes.CHOCOLATINE_SERVICE.findAll());
                break;

            case 2:
                
                creerChocolatine();
                break;

            case 3:
               creerCommande();
                break;

            case 4:
            	System.out.println("Notre top 5 des chocolatines!");
            	Constantes.COMMANDECHOCO_SERVICE.getTop5();
                break;

            case 5:
                creerLivreur();
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
    
   public void creerCommande() {
        
        int choix = 0;
        int quantite = 0;
        
        
        System.out.println(Constantes.CHOCOLATINE_SERVICE.findAll());
        System.out.println("Selectionnez les articles que vous souhaitez commander (en selectionnant leur id): ");
        choix = scanner.nextInt();
        
        System.out.println("Selectionnez la quantité souhaitée: ");
        quantite = scanner.nextInt();
        
        Commande commande = Constantes.COMMANDE_SERVICE.addCommande(choix, quantite);

        
    }
   
   public void creerCommandeMultiple() {
//	   int choix = 0;
//       int quantite = 0;
//       char reponse=' ';
//       
//       
//       System.out.println(Constantes.CHOCOLATINE_SERVICE.findAll());
//       System.out.println("Selectionnez les articles que vous souhaitez commander (en selectionnant leur id): ");
//       choix = scanner.nextInt();
//       
//       System.out.println("Selectionnez la quantité souhaitée: ");
//       quantite = scanner.nextInt();
//       
//       Commande commande = Constantes.COMMANDE_SERVICE.addCommande(choix, quantite);
//       
//       
//       do{//tant que reponse = O //boucle principale
//           
//    	   System.out.println(Constantes.CHOCOLATINE_SERVICE.findAll());
//           System.out.println("Selectionnez les articles que vous souhaitez commander (en selectionnant leur id): ");
//           choix = scanner.nextInt();
//           
//           System.out.println("Selectionnez la quantité souhaitée: ");
//           quantite = scanner.nextInt();
//           
//            Commande commande2 = Constantes.COMMANDE_SERVICE.addCommande(choix, quantite);
//    	    
//    	     
//    	      //On invite l'utilisateur à recommencer ou à quitter
//    	      do{       
//    	        System.out.println("Souhaitez-vous ajouter d'autres articles à votre commande?");
//    	        reponse = scanner.nextLine().charAt(0);
//    	       
//    	      }while(reponse != 'O' && reponse != 'N');
//    	     
//    	    }while(reponse == 'O');
//    	    
//    	  System.out.println("Merci!Votre commande est validée");
  }
   
   
   public void creerLivreur() {
       
       scanner.nextLine();
       System.out.println("Vous souhaitez ajouter un nouveau livreur ");
       System.out.println("Saisir le nom du livreur: ");
       String nom = scanner.nextLine();
       
       System.out.println("Saisir le prénom: ");
       String prenom = scanner.nextLine();

       Livreur l = Constantes.LIVREUR_SERVICE.addLivreur(nom, prenom);
       
       System.out.println(l);

   }

   public void ajouterCommandeToLivreur() {
	
	   Livreur l = Constantes.LIVREUR_SERVICE.;
   }


}


