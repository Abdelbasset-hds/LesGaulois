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
	
	public void parler(String text) {
        System.out.println("Le Gaulois"+nom +" : « "+ text +"»");
    }
	
	public void frapper (Romain romain) {
		
		System.out.println(this.nom + " envoie un grand coup dans la mâchoire de " + romain.getNom() );
		int coup = this.force / 3;
		romain.recevoirCoup(coup);
	}
	
}
       
