package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import ihm.Chocolatine;

import ihm.CommandeChoco;

import util.Constantes;

public class CommandeChocoService {

	//private List<CommandeChoco> listeCommandeChoco;

	public CommandeChocoService() {
	}

	public void getTop5() {

		EntityManager em = Constantes.EMF.createEntityManager();
		
		List l = em.createQuery(
		        "SELECT c.choco, SUM(c.quantite) as maxcount FROM CommandeChoco c " +
		            "GROUP BY c.choco ORDER BY maxcount desc")
		        .getResultList();
		    for (Object p : l) {
		      printResult(p);
		    }
	

	}
	
	private static void printResult(Object result) {
	    if (result == null) {
	      System.out.print("NULL");
	    } else if (result instanceof Object[]) {
	      Object[] row = (Object[]) result;
	      System.out.print("[");
	      for (int i = 0; i < row.length; i++) {
	        printResult(row[i]);
	      }
	      System.out.print("]");
	    } else if (result instanceof Long || result instanceof Double
	        || result instanceof String) {
	      System.out.print(result.getClass().getName() + ": " + result);
	    } else {
	      System.out.print(result);
	    }
	    System.out.println();
	  }

}
