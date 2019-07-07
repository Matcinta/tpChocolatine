package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


import ihm.Livreur;
import util.Constantes;

public class LivreurService {
private List<Livreur> listeLivreur;
    
    
    
    public LivreurService() {
        EntityManager em = Constantes.EMF.createEntityManager();
        
        listeLivreur =  em.createQuery("from Livreur", Livreur.class).getResultList();
     
        
    }


    public Livreur addLivreur (String nom, String prenom) {
        
        EntityManager em = Constantes.EMF.createEntityManager();
       
        
        Livreur livreur = new Livreur(nom, prenom);
        
        EntityTransaction tx = em.getTransaction();
        
        tx.begin();
        em.persist(livreur);
        tx.commit();
        em.close();
        
        listeLivreur.add(livreur);
        
        return livreur;
       
    }   
    
    
    public List<Livreur> findAll() {
        return listeLivreur;
        }
    }