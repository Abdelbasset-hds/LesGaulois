package personnage;

public class Gaulois extends Personnage{
	protected double puissanceTemporaire = 1;
	public Gaulois(String nom, int force) {
		super(nom,force);
	}
	
	@Override
	protected String donnerAuteur() {
		return "le Gaulois " + getNom();
	}
	

	public void setPuissanceTempo(double puissance) {
	    this.puissanceTemporaire=puissance;
	}
	@Override
    public void frapper (Personnage adv) {
		
	
		int coup = (int)(getForce()*puissanceTemporaire / 3);
		puissanceTemporaire -= 0.5;
		System.out.println(donnerAuteur() + " envoie un grand coup de force "+coup+" au " + adv.getNom() );
		adv.recevoirCoup(coup);
		
	}
    @Override
	public void recevoirCoup(double coup) {
		int force = getForce() ;
		force -= coup;
		if (force<0) {
			force = 0;
		}
		
		if (force>0) {
			System.out.println("Aie !");
		}
		
		else {
			System.out.println(getNom()+" : J'abandonne ");
			
		}}
}
       
