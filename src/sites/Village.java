package sites;


import personnage.Gaulois;

public class Village {
    
	private String nom;
	private Gaulois chef;
	private Gaulois[] habitant;
	private int conteur = 0;
	private static int max_habitant = 4;
	
	public Village(Gaulois chef) {
		this.nom = nom;
		this.chef = chef;
		this.habitant = new Gaulois[max_habitant];
	}
   
    public String getNom() {
    	return nom;
    }
    public Gaulois getChef() {
    	return chef;
    }
    public void ajouterVillageois(Gaulois gaulois) {
    	if(conteur<max_habitant) {
    	habitant[conteur]=gaulois;
    	conteur++;
    	System.out.println(chef.getNom()+ " Bienvenue " +gaulois.getNom()+" !");
    	}
    	else {
    		System.out.println(chef.getNom()+ " Désolé " +gaulois.getNom()+ " mon village est déja bien rempli");
    	}
    	
    	
    }
    
    public void afficherVillageois() {
    	System.out.println("le village de "+ chef.getNom() + " habit par : ");
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