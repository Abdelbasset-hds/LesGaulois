package personnage;

public class Soldat extends Romain {
	public enum Grade{SOLDAT, TESSERARIUS, OPTIO,CENTURION}
	public enum Equipement{CASQUE,PLASTRON,BOUCLIER}
	private Grade grade;
	private Equipement[] equipements;
	private int nbequipement = 0;
	public Soldat (String nom,int force,Grade grade) {
		super(nom,force);
		this.grade=grade;
		this.equipements = new Equipement[3];
		
	}
	
	public Grade getGrade() {
		return grade;
	}
	
	public void equiper(Equipement e) {
		for(int i=0;i<nbequipement;i++) {
			if(equipements[i]==e) {
				System.out.println(getNom() +" : je suis déja equiper avec "+ e);
				return;
			}
			
		}
		if(nbequipement<3) {
			equipements[nbequipement]=e;
			nbequipement++;
			System.out.println("Le "+getGrade() +" "+ getNom()  + " s'équipe avec un " + e);
		}
	}
	
	@Override
	protected String donnerAuteur() {
		return "le" + grade + " " + getNom() ;
	}
	@Override
	public void parler (String text) {
		System.out.println("le "+getGrade() + " " + getNom()  + " :  " + text + " .");
	}
	@Override
	public void recevoirCoup(double coup) {
		int force = getForce() ;
		for(int i=0;i<nbequipement;i++) {
			if(equipements[i]==Equipement.CASQUE) {
				coup -=2;
				System.out.println("Le casque absorbe 2 du coup");
			}
			if(equipements[i]==Equipement.BOUCLIER) {
				coup -=3;
				System.out.println("Le bouclier absorbe 3 du coup");
			}
			if(equipements[i]==Equipement.PLASTRON) {
				coup -=3;
				System.out.println("Le plastron absorbe 3 du coup");
			}
		}
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