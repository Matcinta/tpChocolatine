package service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import ihm.Chocolatine;
import util.Constantes;




public class ChocolatineService {
    
    private ArrayList<Chocolatine> listeChocolatine = new ArrayList<Chocolatine>();
    
    //private EntityManagerFactory emf = Constantes.EMF;
    
   
    
    public Chocolatine addChoco (String nom, float prix, float temperature, float poids) {
        
        EntityManager em = Constantes.EMF.createEntityManager();
        
        Chocolatine choco = new Chocolatine(nom, prix, temperature, poids);
        
        EntityTransaction tx = em.getTransaction();
        
        tx.begin();
        em.persist(choco);
        tx.commit();
        em.close();
        
        listeChocolatine.add(choco);
        
        return choco;
       
    }   
    
    
}


