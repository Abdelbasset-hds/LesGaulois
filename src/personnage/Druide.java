package personnage;
import java.security.SecureRandom;
import java.util.Random;

public class Druide extends Gaulois{
	
	private Random random;
	private int quantite_potion;
	private double puissance_potion;

	public Druide (String nom, int force) {
		super(nom,force);
		try {
			 random = SecureRandom.getInstanceStrong();
			} catch (Exception e) {
			 e.printStackTrace();
			}
	}
	
	public void fabriquerPotion() {
		quantite_potion = random.nextInt(5) + 1;
		puissance_potion = random.nextInt(5)+2;
		System.out.println("Le gaulois " + getNom() +" :  J'ai concocte "+quantite_potion+" doses de potion magique. Elle a une force de "+puissance_potion+".");
	}
	
	public void boosterGaulois(Gaulois g) {
		if (g.getNom().equals("Obelix")) {
			 System.out.println("Le gaulois " + getNom() + " : Non, Obelix Non !... Et tu le sais très bien !");
	            return;
		}
		if (quantite_potion > 0) {
			g.setPuissanceTempo(puissance_potion);
			quantite_potion--;
			System.out.println("le Gaulois " + getNom() + " : Tiens "+g.getNom()+" un peu de potion magique.");
			}
		else {
			System.out.println("Le gaulois " + getNom() + " : Desole "+g.getNom()+" il n'y a plus une seule goutte de potion.");
		}
	}

}
