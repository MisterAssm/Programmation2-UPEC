public class Noeud {

    int valeur;
    Noeud droit;
    Noeud gauche;

    public static Noeud creation(int valeur, int prof) {
        Noeud n = new Noeud();
        n.valeur = valeur;
        if (10.0 * Math.random() > prof) {
            n.gauche = creation((int) (Math.random() * 500.0), prof + 1);
        }
        if (10.0 * Math.random() > prof) {
            n.droit = creation((int) (Math.random() * 500.0), prof + 1);
        }
        return n;
    }

    public int sommeTotale() {
        return valeur + (droit == null ? 0 : droit.sommeTotale()) + (gauche == null ? 0 : gauche.sommeTotale());
    }

    public boolean contains(int x) {
        return valeur == x || (droit != null && droit.contains(x)) || (gauche != null && gauche.contains(x));
    }

}
