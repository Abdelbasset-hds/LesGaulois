package sites;

import personnage.Soldat;

public class Camp {
    private Soldat commandant;
    private Soldat[] habitant;
    private int i =0;
    private static int max_habitant = 5;


    public Camp(Soldat commandant) {
        this.commandant = commandant;
        this.habitant = new Soldat[max_habitant];
       
    }

   

    public Soldat getChef() {
        return commandant;
    }
    
    public void ajouterSoldat(Soldat soldat) {
    	if(i<=max_habitant) {
    	habitant[i] = soldat;
    	i++;
    	System.out.println(soldat.getNom() + "Je mets mon épée au service de Rome dans le camp dirigé par Minus");
    	}
    	else {
    		System.out.println(commandant.getNom()+ "Désolé" +soldat.getNom()+ " notre camp est complet !");
    	}
    }
    
    public void afficherCamp() {
        System.out.println("Le camp dirigé par " + commandant.getNom() + " contient les soldats :");
        for (int j = 0; j < i; j++) {
            System.out.println("- " + habitant[j].getNom());
        }
    }

    public void changerCommandant(Soldat nouveauCommandant) {
    	if(nouveauCommandant.getGrade()==Soldat.Grade.CENTURION) {
    	commandant = nouveauCommandant;
    	System.out.println(commandant.getNom()+" :  je prends la direction du camp romain ");
    	
    	
    	}
    	else {
    		System.out.println(nouveauCommandant.getNom()+"Je ne suis pas suffisamment gradé pour prendre la direction du camp Romain");
    	}
    }
}