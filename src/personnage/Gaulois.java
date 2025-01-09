package personnage;

public class Gaulois {

	private String nom;
	private int force;
	
	public Gaulois (String nom , int force) {
		
		this.nom = nom;
		this.force = force;
		
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public int getForce() {
		return this.force;
	}
	
	public void parler(String texte) {
        System.out.println("Le gaulois " + nom + " : « " + texte + " ».");
    }
	
	public static void main(String[] args) {
	    Gaulois gaulois = new Gaulois("Astérix", 8);
	    gaulois.parler("Bonjour à tous");
	}
}

