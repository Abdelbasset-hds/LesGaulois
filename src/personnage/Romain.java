package personnage;

public class Romain extends Personnage{
	
	
	public Romain(String nom, int force) {
		super(nom,force);
	}
	
	@Override
	
	protected String donnerAuteur() {
		return "le Romain" + getNom();
	}
	
}
