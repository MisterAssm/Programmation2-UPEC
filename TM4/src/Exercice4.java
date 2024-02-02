public class Exercice4 {

    public static void main(String[] args) {

        System.out.println("radar : " + palindrome("radar")); // true
        System.out.println("ressasser : " + palindrome("ressasser")); // true
        System.out.println("enseignant : " + palindrome("enseignant")); // false

        System.out.println("hello : " + verlan("hello"));

    }

    public static boolean palindrome(String word) {
        return word.charAt(0) == word.charAt(word.length() - 1) && (word.length() <= 1 || palindrome(word.substring(1, word.length() - 1)));
    }

    public static String verlan(String word)  {
        if (word.length() <= 1) {
            return word;
        }

        return verlan(word.substring(1)) + word.charAt(0);
    }

}
