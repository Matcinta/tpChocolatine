package ihm;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "commandechoco")
public class CommandeChoco {

    
    @Id
    @Column (name= "idCommandeChoco")
    @GeneratedValue (strategy= GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn (name="idChocolatine")
    private Chocolatine choco;
    @ManyToOne
    @JoinColumn (name="idCommande")
    private Commande commande;
    private int quantite;
    
    

    public CommandeChoco() {
        super();
    }
    
    



    public CommandeChoco(Commande commande, Chocolatine choco, int quantite) {
        super();
        this.commande = commande;
        this.choco = choco;
        this.quantite = quantite;
    }





    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



    public Chocolatine getChoco() {
        return choco;
    }



    public void setChoco(Chocolatine choco) {
        this.choco = choco;
    }



    public Commande getCommande() {
        return commande;
    }



    public void setCommande(Commande commande) {
        this.commande = commande;
    }



    public int getQuantite() {
        return quantite;
    }



    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }





    @Override
    public String toString() {
        return "CommandeChoco [id=" + id + ", choco=" + choco + ", commande=" + commande + ", quantite=" + quantite + "]";
    }





    
    
    
    
    
    
    
}
