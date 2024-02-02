public class Exercice5 {

    public static void main(String[] args) {

        System.out.println(pgcd(2, 3));
        System.out.println(pgcd(42, 54));

    }

    public static int pgcd(int a, int b) {
        if (b > a) return pgcd(b, a);

        int mod = a % b;

        if (mod == 0) {
            return b;
        }

        return pgcd(b, mod);
    }

}
