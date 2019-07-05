package ihm;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "chocolatine")
public class Chocolatine {

    @Id
    @Column (name= "idChocolatine")
    @GeneratedValue (strategy= GenerationType.IDENTITY)
    private int id;
    private String nom;
    private float prix; 
    private float temperature;
    private float poids;
    

    
    
    
    public Chocolatine() {
        super();
    }


    public Chocolatine(String nom, float prix, float temperature, float poids) {
        super();
        this.nom = nom;
        this.prix = prix;
        this.temperature = temperature;
        this.poids = poids;
    }

    
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPoids() {
        return poids;
    }

    public void setPoids(float poids) {
        this.poids = poids;
    }


    @Override
    public String toString() {
        return "\n\tid= " + id + ", nom=" + nom + ", prix=" + prix + ", temperature=" + temperature + ", poids=" + poids;
    }
    
   

   
    
    
    
   
}
