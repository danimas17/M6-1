import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Cacheable;
import javax.persistence.Inheritance;

@Entity
@Table
public class Clients {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	
	private int id;
	private String nom;
	private String adre�a;
	private String email;

	public Clients(int id, String nom, String adre�a, String email) {
		super();
		this.id= id;
		this.nom = nom;
		this.adre�a = adre�a;
		this.email = email;

	}
	

	public Clients() {
		super();
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


	public String getAdre�a() {
		return adre�a;
	}


	public void setAdre�a(String cognom) {
		this.adre�a = cognom;
	}


	public String getEmail() {
		return email;
	}
	
	@Override
	public String toString() {
		return "Client [ID=" + id + ", Nom=" + nom + ", Adre�a=" + adre�a + ", Email=" + email + "]";
	}
	
	
}
