package personnage;

public class Romain {

	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public void parler(String text) {
		
		System.out.println("Le Romaine " + nom + " : « " + text + " ».");
	}
	
	public void recevoirCoup(int coup) {
		this.force -= coup;
		if (this.force<0) {
			this.force = 0;
		}
		
		if (this.force>0) {
			System.out.println("Aïe !");
		}
		
		else {
			System.out.println("J’abandonne…");
		}
	
	}
}
