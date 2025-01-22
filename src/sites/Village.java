package sites;


import personnage.Gaulois;

public class Village {
    private String nom;
    private Gaulois chef;
    private Gaulois[] habitants;
    private int i = 0;
    

    public Village(Gaulois chef) {
        this.chef = chef;
        this.habitants = new Gaulois[50];
       
    }

    public String getNom() {
        return nom;
    }

    public Gaulois getChef() {
        return chef;
    }

    public void ajouterVillageoie(Gaulois gaulois) {
    	habitants[i]=gaulois;
    	i++;
    }

    
}
