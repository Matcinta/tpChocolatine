package ihm;


import java.util.ArrayList;
import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "livreur")
public class Livreur {

	@Id
    @Column (name= "idLivreur")
    @GeneratedValue (strategy= GenerationType.IDENTITY)
	private int id;
    private String nom;
    private String prenom;
    
    //chercher explications sur ces lignes
    @OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST },
    	      fetch = FetchType.LAZY, mappedBy = "livreur")
    	   private List<Commande> commandes;
    
    
    
    public Livreur() {
		super();
	}

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

	public List<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}

	@Override
	public String toString() {
		return "Livreur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
  
	
	
}
