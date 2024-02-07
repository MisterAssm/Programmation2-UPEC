public class Wagon {

    String type;
    int nombreDePlaces;
    Wagon prochain;

    public Wagon(String type, int nombreDePlaces) {
        this.nombreDePlaces = nombreDePlaces;
        this.type = type;
    }

    public static Wagon TrainCreation() {
        Wagon first = new Wagon("Loco", 2);
        Wagon w = first;

        for (int i = 0; i < 10; i++) {
            w.prochain = new Wagon("Passagers", new java.util.Random().nextInt(125));
            w = w.prochain;
        }

        return first;
    }

    public int compterWagon() {
        return 1 + (prochain == null ? 0 : prochain.compterWagon());
    }

    public int compterPlace() {
        return nombreDePlaces + (prochain == null ? 0 : prochain.compterPlace());
    }

    public void ajouterTrainFret() {
        if (prochain != null) {
            prochain.ajouterTrainFret();
        } else {
            prochain = new Wagon("Fret", 0);
        }
    }

    @Override
    public String toString() {
        final var repeat = "-".repeat(type.toCharArray().length);

        return """
                --%s--------------
                | %s (%d places) |
                --%s--------------
                %s""".formatted(repeat, type, nombreDePlaces, repeat, prochain == null ? "" : prochain);
    }
}



