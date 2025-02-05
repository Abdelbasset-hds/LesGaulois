package test_fonctionnel;

import personnage.Gaulois;
import personnage.Soldat;
import personnage.Romain;
import sites.Camp;
import sites.Village;


public class TestSites {

    public static void main(String[] args) {
       
    	Gaulois Vercingétorix = new Gaulois("Vercingétorix",5);
    	Village village = new Village(Vercingétorix);
    	Vercingétorix.parler(" Je suis un grand guerrier et je vais cr�er mon village");
    	
    	Soldat minus = new Soldat("Minus",2,Soldat.Grade.SOLDAT);   	
    	Camp camp =new Camp(minus);
    	minus.parler(" Je suis en charge de créer un nouveau camp romain");
    	
    	Gaulois  Agecanonix = new Gaulois(" Agecanonix",1);
    	Gaulois Assurancetourix = new Gaulois("Assurancetourix",2);
    	Gaulois Astérix = new Gaulois("Astérix",5);
    	Gaulois Obelix = new Gaulois("Obelix",15);
    	Gaulois Prolix = new Gaulois("Prolix",2);
    	
    	Soldat Brutus = new Soldat("Brutus",5,Soldat.Grade.CENTURION);
    	Soldat Milexcus = new Soldat("Milexcus",2,Soldat.Grade.SOLDAT);
    	Soldat Octopus = new Soldat("Octopus",2,Soldat.Grade.TESSERARIUS);
    	Soldat Ballondebaudrus = new Soldat("Ballondebaudrus",3,Soldat.Grade.OPTIO);
    	
    	
    	camp.ajouterSoldat(Brutus);
        camp.ajouterSoldat(Milexcus);
        camp.ajouterSoldat(Octopus);
        camp.ajouterSoldat(Ballondebaudrus);
        camp.afficherCamp();
        
    	village.ajouterVillageois(Agecanonix);
    	village.ajouterVillageois(Assurancetourix);
    	village.ajouterVillageois(Astérix);
        village.ajouterVillageois(Obelix);
        village.ajouterVillageois(Prolix);
        
        
        
        
        
        
        village.afficherVillageois();
        
        Gaulois  abraracourcix = new Gaulois(" abraracourcix",5);
        Soldat Chorus = new Soldat("Chorus",4,Soldat.Grade.CENTURION);
    	Soldat Briseradius = new Soldat("Briseradius",4,Soldat.Grade.SOLDAT);
        
        village.changerChef(abraracourcix);
        camp.changerCommandant(Briseradius);
        camp.changerCommandant(Chorus);
        

        
    }
}
