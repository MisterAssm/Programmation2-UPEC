public class Exercice1 {

    public static void main(String[] args) {
        Wagon wagon = Wagon.TrainCreation();

        System.out.println(wagon);
        System.out.println("Nombre de wagon : " + wagon.compterWagon());
        System.out.println("Nombre de places : " + wagon.compterPlace());
        wagon.ajouterTrainFret();
        System.out.println(wagon);
    }

}
