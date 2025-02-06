package batailles;
import batailles.Bataille;
public class Conteur {
	
	private String nom;

    public Conteur(String nom) {
        this.nom = nom;
    }

    public void raconterBataille(Bataille bataille) {
        System.out.println( nom + " raconte l'histoire de la bataille : " + bataille.getNom());
        System.out.println(" Contexte : " + bataille.getContexte());
        System.out.println("Combattants : " + bataille.listerCombattants());
        bataille.preparerCombat();
        bataille.decrireCombat();
        System.out.println("Résultat : " + bataille.donnerResultat());
    }

}
