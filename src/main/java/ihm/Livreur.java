package ihm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Livreur {

    
    private String nom;
    private String prenom;
    
    private Map<Commande, Integer> commandes = new HashMap<>();
    
    
    
    public Livreur(String nom, String prenom) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        
    }
    
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Map<Commande, Integer> getCommandes() {
        return commandes;
    }

    public void setCommandes(Map<Commande, Integer> commandes) {
        this.commandes = commandes;
    }
   
    
    
    
    
    
}
