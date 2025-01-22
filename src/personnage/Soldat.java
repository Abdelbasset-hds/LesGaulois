package personnage;

public class Soldat extends Romain {
	public enum Grade{SOLDAT, TESSERARIUS, OPTIO,CENTURION}
	private Grade grade;
	public Soldat (String nom,int force,Grade grade) {
		super(nom,force);
		this.grade=grade;
	}
	
	public Grade getGrade() {
		return grade;
	}
	
	@Override
	protected String donnerAuteur() {
		return "le" + grade + " " + getNom() ;
	}

}
