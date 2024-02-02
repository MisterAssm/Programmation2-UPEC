public class Exercice2 {

    public static void main(String[] args) {
        ligne(5);
        triangle(10);
    }

    public static void ligne(int n) {
        if (n > 0) {
            System.out.print("* ");
            ligne(n - 1);
        } else {
            System.out.println(); // Retour à la ligne
        }
    }

    public static void triangle(int n) {
        if (n > 0) {
            triangle(n - 1);
            ligne(n);
        }
    }

}
