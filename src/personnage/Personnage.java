package personnage;

public abstract class Personnage {
	
	private String nom;
	private int force;
	
	
	public Personnage (String nom,int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom () {
		return nom;
	}
	
	public int getForce () {
		return force;
	}
	
	public void parler (String text) {
		System.out.println(this.nom + nom + " : « " + text + " ».");
	}
	

    public void frapper (Personnage adv) {
		
		System.out.println(donnerAuteur() + " envoie un grand coup dans la mâchoire de " + adv.getNom() );
		int coup = this.force / 3;
		adv.recevoirCoup(coup);
	}
    
	protected abstract String donnerAuteur();

    
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
			
		}}
}
