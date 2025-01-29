package sites;


import personnage.Gaulois;

public class Village {
    
	private String nom;
	private Gaulois chef;
	private Gaulois[] habitant;
	private int conteur = 0;
	
	public Village(Gaulois chef) {
		this.nom = nom;
		this.chef = chef;
		this.habitant = new Gaulois[50];
	}
   
    public String getNom() {
    	return nom;
    }
    public Gaulois getChef() {
    	return chef;
    }
    public void ajouterVillageois(Gaulois gaulois) {
    	habitant[conteur]=gaulois;
    	conteur++;
    	
    }
    
    public void afficherVillageois() {
    	System.out.println("le village de "+ getChef() + "habit par : ");
    	for(int i=0;i<conteur;i++) {
    		System.out.println("-"+habitant[i].getNom());
    	}
    }
    public void changerChef(Gaulois nouveauChef) {
        System.out.println(chef.getNom() + ": Je laisse mon grand bouclier au grand " + nouveauChef.getNom()  );
        chef = nouveauChef;
        System.out.println(chef.getNom() + ": Merci !");
    }
    
}