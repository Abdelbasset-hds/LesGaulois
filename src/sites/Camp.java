package sites;

import personnage.Soldat;

public class Camp {
	private String nom;
    private Soldat commandant;
    private Soldat[] habitant;
    private int i =0;


    public Camp(Soldat commandant) {
        this.commandant = commandant;
        this.habitant = new Soldat[80];
       
    }

    public String getNom() {
        return nom;
    }

    public Soldat getChef() {
        return commandant;
    }
    
    public void ajouterSoldat(Soldat soldat) {
    	
    	habitant[i] = soldat;
    	i++;
    }

}
