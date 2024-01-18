package fr.zemouchi.tm2;

public class AppTab {

    public static void main(String[] args) {
        MyTableau tableau = new MyTableau(5);

        tableau.add(2);
        tableau.add(7);
        tableau.add(3);
        tableau.add(5);
        tableau.add(4);

        System.out.println(tableau);

        tableau.delete(1);

        System.out.println(tableau);

        MyTableau tableau1 = new MyTableau(5);

        tableau1.add(1);
        tableau1.add(7);
        tableau1.add(12);
        tableau1.add(12);
        tableau1.add(19);

        System.out.println(tableau.estTrie());
        System.out.println(tableau1.estTrie());
    }

}
