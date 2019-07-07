package util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import service.ChocolatineService;
import service.CommandeChocoService;
import service.CommandeService;
import service.LivreurService;

public class Constantes {

    public static EntityManagerFactory EMF = Persistence.createEntityManagerFactory("tpChoco");
    public static ChocolatineService CHOCOLATINE_SERVICE = new ChocolatineService();
    public static CommandeService COMMANDE_SERVICE = new CommandeService();
    public static CommandeChocoService COMMANDECHOCO_SERVICE = new CommandeChocoService();
    public static LivreurService LIVREUR_SERVICE = new LivreurService();
    
}
