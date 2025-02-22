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
		System.out.println(this.nom  + " :  " + text + " .");
	}
	

    public void frapper (Personnage adv) {
		
		System.out.println(donnerAuteur() + " envoie un grand coup dans la machoire de " + adv.getNom() );
		int coup = this.force / 3;
		adv.recevoirCoup(coup);
	}
    
	protected abstract String donnerAuteur();


	
    public void recevoirCoup(double coup) {
		this.force -= coup;
		if (this.force<0) {
			this.force = 0;
		}
		
		if (this.force>0) {
			System.out.println("Aie !");
		}
		
		else {
			System.out.println(getNom()+" : J'abandonne ");
			
		}}
}
