package service;

import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.EntityTransaction;

import ihm.Chocolatine;
import util.Constantes;




public class ChocolatineService {
    
    private List<Chocolatine> listeChocolatine;
    
    
    
    public ChocolatineService() {
        EntityManager em = Constantes.EMF.createEntityManager();
        
        listeChocolatine =  em.createQuery("from Chocolatine", Chocolatine.class).getResultList();
     
        
    }


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
    
    
    public List<Chocolatine> findAll() {
        return listeChocolatine;
        }
    }
    
    



