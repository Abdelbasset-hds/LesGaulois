package test_fonctionnel;

import personnage.Gaulois;
import personnage.Soldat;
import personnage.Soldat.Grade;
import sites.Camp;
import sites.Village;

public class TestSites {
	public static void main(String[] args) {
		Gaulois vercingetorix = new Gaulois("vercing�torix", 5);	
		vercingetorix.parler(" Je suis un grand guerrier et je vais cr�er mon village ");
		Village village = new Village(vercingetorix);
		Soldat minus = new Soldat("Minus", 2, Grade.SOLDAT);
		minus.parler(" Je suis en charge de cr�er un nouveau camp romain. ");
		Camp camp = new Camp("Camp Romain", minus);
		
		
	}

}
