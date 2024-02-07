public class Exercice3 {

    public static void main(String[] args) {
        Noeud noeud = Noeud.creation(5, 10);

        System.out.println("Somme totale : " + noeud.sommeTotale());
        System.out.println("Contains 5 : " + noeud.contains(5));
        System.out.println("Contains 0 : " + noeud.contains(0));
        System.out.println("Contains -100000 : " + noeud.contains(-100000));
    }

}
