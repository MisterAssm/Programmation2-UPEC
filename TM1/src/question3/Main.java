package question3;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Panier panier = Panier.initialiserPanier();

        while (true) {
            int action = Integer.parseInt(JOptionPane.showInputDialog("Que voulez-vous faire :\n\n" +
                    "(1) Ajouter un article\n" +
                    "(2) Visualiser mon panier ?\n" +
                    "(3) Arrêter le programme"));

            switch (action) {
                case 1:
                    panier.ajouterArticle(Article.saisirArticle(JOptionPane.showInputDialog("Nom de l'article"), Integer.parseInt(JOptionPane.showInputDialog("Prix de l'article"))));
                    break;
                case 2:
                    panier.afficherPanier();
                    break;
                case 3:
                    System.exit(0);
                    break;

                default:
                    break;
            }
        }

    }

}
