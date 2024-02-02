public class Exercice1 {

    public static void main(String[] args) {
        afficheNombresDecroissant(10);

        System.out.println("\n --- \n");

        afficheNombresCroissant(10);
    }

    public static void afficheNombresDecroissant(int n) {
        if (n > 0) {
            System.out.println(n);
            afficheNombresDecroissant(n - 1);
        }
    }

    public static void afficheNombresCroissant(int n) {
        if (n > 0) {
            afficheNombresCroissant(n - 1);
            System.out.println(n);
        }
    }


}
