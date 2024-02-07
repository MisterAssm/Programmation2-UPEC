public class Exercice2 {

    public static void main(String[] args) {
        Personne personne = Personne.creationFamille(1901);

        System.out.println("Descendance : " + personne.calculerNombreDescendant());
        System.out.println("Descendance sans enfant : " + personne.calculerNombreDescendantSansEnfant());
        System.out.println("Plus grande distance : " + personne.calculerPlusGrandDistance());
    }

}
