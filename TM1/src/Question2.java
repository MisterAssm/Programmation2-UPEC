import java.util.Arrays;

public class Question2 {

    public static void main(String[] args) {
        String s = "Hello world Assim !";

        System.out.println(remplaceLettre("assim"));
        System.out.println(Arrays.toString(decomposePhrase(s)));
        System.out.println(remplaceMot(s, "Assim", "Essam"));
        System.out.println(inversePhrase("le chat est noir"));
    }

    private static String remplaceLettre(String s) {
        return s.replace('a', 'e');
    }

    private static String remplaceLettre(String s, char a) {
        return s.replace(a, 'e');
    }

    private static String[] decomposePhrase(String s) {
        return s.split("\\s+");
    }

    private static String remplaceMot(String s, String mot1, String mot2) {
        return s.replace(mot1, mot2);
    }

    private static String inversePhrase(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] tab = s.split("\\s+");

        for (int i = tab.length - 1; i >= 0; i--) {
            stringBuilder.append(tab[i]).append(" ");
        }

        return stringBuilder.toString();
    }

}