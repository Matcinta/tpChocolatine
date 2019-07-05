package util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import service.ChocolatineService;

public class Constantes {

    public static ChocolatineService CHOCOLATINE_SERVICE = new ChocolatineService();
    
    public static EntityManagerFactory EMF = Persistence.createEntityManagerFactory("tpChoco");
    
}
