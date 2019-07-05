package service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import ihm.Chocolatine;
import ihm.Commande;
import ihm.CommandeChoco;
import ihm.Statut;
import util.Constantes;

public class CommandeService {

    private List<Commande> listeCommande;
    
    public CommandeService() {
        EntityManager em = Constantes.EMF.createEntityManager();
        
        listeCommande =  em.createQuery("from Commande", Commande.class).getResultList();
     
        
    }
    
    public Commande addCommande (int idChoco, int quantite) {
        
        EntityManager em = Constantes.EMF.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        Commande commande = new Commande();
        commande.setDateHeure(LocalDateTime.now());
        commande.setStatut(Statut.CREER);
        em.persist(commande);
        
       CommandeChoco cc = new CommandeChoco();
       cc.setCommande(commande);
       
       Chocolatine choco = new Chocolatine();
       choco.setId(idChoco);
       
       cc.setChoco(choco);
       
       cc.setQuantite(quantite);
       
       em.persist(cc); 
        
        
        tx.commit();
        em.close();
        
        listeCommande.add(commande);
        
        return commande;
       
    } 
    
}
