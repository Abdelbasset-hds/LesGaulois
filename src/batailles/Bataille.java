package batailles;

import personnage.Personnage;

public class Bataille {
	
	private String nom;
    private String contexte;
    private Personnage[] combattants;
    private String descriptionCombat;
    private String resultat;

    public Bataille(String nom, String contexte, Personnage[] combattants) {
        this.nom = nom;
        this.contexte = contexte;
        this.combattants = combattants;
    }

    public String getNom() {
        return nom;
    }

    public String getContexte() {
        return contexte;
    }

    public String listerCombattants() {
        StringBuilder liste = new StringBuilder();
        for (Personnage p : combattants) {
            if (p != null) { // Vérification pour éviter les valeurs nulles
                liste.append(p.getNom()).append(", ");
            }
        }
        return liste.length() > 0 ? liste.substring(0, liste.length() - 2) : "Aucun";
    }

    public void preparerCombat() {
        System.out.println("Préparation du combat...");
        for (Personnage p : combattants) {
            if (p != null) {
                System.out.println(p.getNom() + " s'échauffe.");
            }
        }
    }

    public void decrireCombat() {
        System.out.println("La bataille commence !");
        for (int i = 0; i < combattants.length - 1; i++) {
            if (combattants[i] != null && combattants[i + 1] != null) {
                combattants[i].frapper(combattants[i + 1]);
                combattants[i + 1].frapper(combattants[i]);
            }
        }
        descriptionCombat = "Un combat intense a eu lieu entre " + listerCombattants();
    }

    public String donnerResultat() {
        if (combattants.length > 0 && combattants[0] != null) {
            resultat = "Le combat a été féroce, mais la victoire appartient à " + combattants[0].getNom();
            return resultat;
        }
        return "Aucun combattant en vie.";
    }

}
