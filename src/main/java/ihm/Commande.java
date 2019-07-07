package ihm;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "commande")
public class Commande {

    @Id
    @Column (name= "idCommande")
    @GeneratedValue (strategy= GenerationType.IDENTITY)
    private int id;
    private LocalDateTime dateHeure;
    @Enumerated(EnumType.STRING)
    private Statut statut;
    
    @OneToMany(mappedBy = "commande")
    private List<CommandeChoco> commandeChocos = new ArrayList<>();
    
    @ManyToOne(optional = true)
    @JoinColumn(name = "livreur")
    private Livreur livreur;
   
    
    
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public List<CommandeChoco> getCommandeChocos() {
        return commandeChocos;
    }


    public void setCommandeChocos(List<CommandeChoco> commandeChocos) {
        this.commandeChocos = commandeChocos;
    }


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


	public Livreur getLivreur() {
		return livreur;
	}


	public void setLivreur(Livreur livreur) {
		this.livreur = livreur;
	}


   
    
}
