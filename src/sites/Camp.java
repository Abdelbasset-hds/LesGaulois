package sites;

import personnage.Soldat;

public class Camp {
    private Soldat commandant;
    private Soldat[] habitant;
    private int i =0;


    public Camp(Soldat commandant) {
        this.commandant = commandant;
        this.habitant = new Soldat[80];
       
    }

   

    public Soldat getChef() {
        return commandant;
    }
    
    public void ajouterSoldat(Soldat soldat) {
    	
    	habitant[i] = soldat;
    	i++;
    }
    
    public void afficherCamp() {
        System.out.println("Le camp dirigé par " + commandant.getNom() + " contient les soldats :");
        for (int j = 0; j < i; j++) {
            System.out.println("- " + habitant[j].getNom());
        }
    }

    public void changerCommandant(Soldat nouveauCommandant) {
    	System.out.println(commandant.getNom()+" : je laisse ma direction à "+nouveauCommandant.getNom());
    	commandant = nouveauCommandant;
    	System.out.println(commandant.getNom() +" : Merci !");
    }
}