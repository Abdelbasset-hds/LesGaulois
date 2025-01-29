package test_fonctionnel;

import personnage.Gaulois;
import personnage.Romain;
import personnage.Soldat;
import personnage.Soldat.Grade;
import sites.Village;
import sites.Camp;

public class TestSites {

    public static void main(String[] args) {
       
    	Gaulois Vercing�torix = new Gaulois("Vercing�torix",5);
    	Village village = new Village(Vercing�torix);
    	Vercing�torix.parler(" Je suis un grand guerrier et je vais cr�er mon village");
    	
    	Soldat minus = new Soldat("Minus",2,Grade.SOLDAT);   	
    	Camp camp =new Camp(minus);
    	minus.parler(" Je suis en charge de cr�er un nouveau camp romain");
    	
    	Gaulois  Agecanonix = new Gaulois(" Agecanonix",1);
    	Gaulois Assurancetourix = new Gaulois("Assurancetourix",2);
    	Gaulois Ast�rix = new Gaulois("Ast�rix",5);
    	Gaulois Obelix = new Gaulois("Obelix",15);
    	Gaulois Prolix = new Gaulois("Prolix",2);
    	
    	Soldat Brutus = new Soldat("Brutus",5,Grade.CENTURION);
    	Soldat Milexcus = new Soldat("Milexcus",2,Grade.SOLDAT);
    	Soldat Octopus = new Soldat("Octopus",2,Grade.TESSERARIUS);
    	Soldat Ballondebaudrus = new Soldat("Ballondebaudrus",3,Grade.OPTIO);
    	
    	village.ajouterVillageois(Agecanonix);
    	village.ajouterVillageois(Assurancetourix);
    	village.ajouterVillageois(Ast�rix);
        village.ajouterVillageois(Obelix);
        village.ajouterVillageois(Prolix);
        
        camp.ajouterSoldat(Brutus);
        camp.ajouterSoldat(Milexcus);
        camp.ajouterSoldat(Octopus);
        camp.ajouterSoldat(Ballondebaudrus);
        
        
        
        camp.afficherCamp();
        village.afficherVillageois();
        
        Gaulois  abraracourcix = new Gaulois(" abraracourcix",5);
        Soldat Chorus = new Soldat("Chorus",4,Grade.CENTURION);
    	Soldat Briseradius = new Soldat("Briseradius",4,Grade.SOLDAT);
        
        village.changerChef(abraracourcix);
        camp.changerCommandant(Briseradius);
        camp.changerCommandant(Chorus);
        

        
    }
}
