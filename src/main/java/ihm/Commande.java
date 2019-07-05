package ihm;


import java.time.LocalDateTime;

import java.util.HashMap;

import java.util.Map;




public class Commande {

    
    private int id;
    private LocalDateTime dateHeure;
    private Statut statut;
    private Map<Chocolatine, Integer> commande = new HashMap<>();
    
    
    public Commande() {   
    }


    public LocalDateTime getDateHeure() {
        return dateHeure;
    }


    public void setDateHeure(LocalDateTime dateHeure) {
        this.dateHeure = dateHeure;
    }


    public Statut getStatut() {
        return statut;
    }


    public void setStatut(Statut statut) {
        this.statut = statut;
    }


    public Map<Chocolatine, Integer> getCommande() {
        return commande;
    }


    public void setCommande(Map<Chocolatine, Integer> commande) {
        this.commande = commande;
    }
    
    
    public void addArticle(Chocolatine choco, int n) {
        commande.put(choco, n);

    }
    
    
}
