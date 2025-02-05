package test_fonctionnel;

import personnage.Druide;
import personnage.Gaulois;
import personnage.Personnage;
import personnage.Romain;
import personnage.Soldat;
import personnage.Soldat.Grade;
public class TstGaulois {
	
	public static void main(String[] args) {
		
		
		
		Gaulois asterix =  new Gaulois("Asterix", 8);
		Gaulois Obélix =  new Gaulois("Obélix", 8);
		Gaulois Assurancetourix =  new Gaulois("Assurancetourix", 8);
		Gaulois Agecanonix =  new Gaulois("Agecanonix", 8);
	    Druide Panoramix = new Druide("Panoramix",8);
	    Soldat minus = new Soldat("Minus", 2,Soldat.Grade.CENTURION);
	    minus.equiper(Soldat.Equipement.CASQUE);
	    minus.equiper(Soldat.Equipement.PLASTRON);
	    minus.equiper(Soldat.Equipement.BOUCLIER);
	
	    Panoramix.fabriquerPotion();
	    Panoramix.boosterGaulois(Obélix);
	    Panoramix.boosterGaulois(asterix);
	    Panoramix.boosterGaulois(Assurancetourix);
	    Panoramix.boosterGaulois(Agecanonix);
	    
	    asterix.parler("Bonjour à tous");
	    minus.parler("UN GAU! UN GAUGAU!");
	    asterix.frapper(minus);
	    //while (true) {
	    //asterix.frapper(minus);
	    //if(minus.getForce()<=0) {
	    //	break;
	    		
	    //}
	    //minus.frapper(asterix);
	    //if(asterix.getForce()<=0) {
	    //	break;
	    		//	}
	    //}
	}
  
}

