package personnage;

public class TestPersonnages {
	
	public static void main(String[] args) {
		Gaulois gaulois = new Gaulois("Ast�rix", 8);
	    Romain romain = new Romain("Minus", 6);
	    gaulois.parler("Bonjour � tous");
	    romain.parler("UN GAU� UN GAUGAU�");
	    for (int i = 0; i < 3; i++) {
	    	gaulois.frapper(romain);
        }
	}
}
