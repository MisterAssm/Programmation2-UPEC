import java.util.Arrays;

public class Exercice3 {

    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 3, 4, 5};

        // Question 1

        System.out.println(containsElementBefore(array, 0, 3)); // true
        System.out.println(containsElementBefore(array, 4, 3)); // false
        System.out.println(containsElementBefore(array, -3, 3)); // false

        // Question 2
        System.out.println("\n--- Question 2 ---\n");

        multiplyElementBefore(array, 2, 3);
        System.out.println(Arrays.toString(array)); // [0, 2, 4, 3, 4, 5]

        // Question 3
        System.out.println("\n--- Question 3 ---\n");

        System.out.println(containsAdjoiningBefore(array, 4)); // false
        array[1] = 4;
        System.out.println(Arrays.toString(array)); // [0, 4, 4, 3, 4, 5]
        System.out.println(containsAdjoiningBefore(array, 4)); // true

        // Question 4
        System.out.println("\n--- Question 4 ---\n");

        System.out.println(isPalindromicBetween(array, 0, 3)); // false
        System.out.println(isPalindromicBetween(array, 2, 5)); // true
        array[3] = 4;
        System.out.println(Arrays.toString(array)); // [0, 4, 4, 4, 4, 5]
        System.out.println(isPalindromicBetween(array, 2, 0)); // false
        System.out.println(isPalindromicBetween(array, 1, 5)); // true

        array[1] = 1;
        array[2] = 2;
        array[3] = 3;

        // Question 5
        System.out.println("\n--- Question 5 ---\n");

        System.out.println(Arrays.toString(array)); // [0, 1, 2, 3, 4, 5]
        invertArrayBetween(array, 0, 6);
        System.out.println(Arrays.toString(array)); // [5, 4, 3, 2, 1, 0]
        invertArrayBetween(array, 0, 6);
        System.out.println(Arrays.toString(array)); // [0, 1, 2, 3, 4, 5]
        invertArrayBetween(array, 0, 3);
        System.out.println(Arrays.toString(array)); // [2, 1, 0, 3, 4, 5]
    }

    public static boolean containsElementBefore(int[] tab, int x, int j) {
        if (j > 0) {
            return tab[j - 1] == x || containsElementBefore(tab, x, j - 1);
        }

        return false;
    }

    public static void multiplyElementBefore(int[] tab, int x, int j) {
        if (j > 0) {
            tab[j - 1] *= x;
            multiplyElementBefore(tab, x, j - 1);
        }
    }

    public static boolean containsAdjoiningBefore(int[] tab, int j) {
        if (j > 1) {
            return tab[j - 1] == tab[j - 2] || containsAdjoiningBefore(tab, j - 1);
        }

        return false;
    }

    public static boolean isPalindromicBetween(int[] tab, int i, int j) {
        if (i == j) { // Tableau d'un seul élément => palindrome
            return true;
        } else if (i > j) { // Hypothèse de départ avec j > i => invalide
            return false;
        }

        //                              Éviter de tomber sur une hypothèse de départ fausse
        return tab[i] == tab[j - 1] && (j - 1 == i || isPalindromicBetween(tab, i + 1, j - 1));
    }

    public static void invertArrayBetween(int[] tab, int i, int j) {
        if (i >= j) {
            return;
        }

        int temp = tab[i];
        tab[i] = tab[j - 1];
        tab[j - 1] = temp;

        invertArrayBetween(tab, i + 1, j - 1);
    }

}
