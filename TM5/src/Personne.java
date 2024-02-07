import java.util.Arrays;
import java.util.Objects;

public class Personne {

    String nom;
    int anneeDeNaissance;
    Personne[] enfants;

    public Personne(String nom, int anneeDeNaissance) {
        this.nom = nom;
        this.anneeDeNaissance = anneeDeNaissance;
    }

    public static Personne creationFamille(int annee) {
        Personne personne = new Personne("Personne: " + annee, annee);
        double prob = annee / 4000.0;
        int nbfils = Math.abs((int) (5.0 * (Math.random() - prob)));
        personne.enfants = new Personne[nbfils];
        for (int i = 0; i < nbfils; i++) {
            personne.enfants[i] = creationFamille(annee + 25 + i);
        }
        return personne;
    }

    public int calculerNombreDescendant() {
        return Arrays.stream(enfants)
                .mapToInt(Personne::calculerNombreDescendant)
                .reduce(0, (left, right) -> left + right + 1);
    }

    public int calculerNombreDescendantSansEnfant() {
        int count = 0;

        for (Personne enfant : enfants) {
            count += (enfant.enfants.length == 0 ? 1 : enfant.calculerNombreDescendantSansEnfant());
        }

        return count;
    }

    public int calculerPlusGrandDistance() {
        int current = anneeDeNaissance;

        for (Personne enfant : enfants) {
            final var i = enfant.calculerPlusGrandDistance();

            if (i > current) {
                current = i;
            }
        }

        return current;
    }

}












