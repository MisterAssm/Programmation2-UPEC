package question3;

import java.util.Arrays;

public class Panier {

    Article[] articles;
    int nbArticles;

    public Panier() {
        this.articles = new Article[0];
        this.nbArticles = 0;
    }

    public static Panier initialiserPanier() {
        return new Panier();
    }

    public void afficherPanier() {
        System.out.printf("=== Panier (%d articles) ===\n", nbArticles);
        for (Article article : articles) {
            article.afficherArticle();
        }
        System.out.printf("\nPrix total du panier : %d €\n=== === === === === ===\n", prixTotal());
    }

    public int prixTotal() {
        return Arrays.stream(articles)
                .map(Article::getPrice)
                .reduce(0, Integer::sum);

        // Ou bien on aurait pu itérer à l'aide d'une boucle for classique
        // Et incrémenter à chaque fois par rapport au prix de chaque article
    }

    public boolean ajouterArticle(Article article) {
        // On aurait pu utiliser Arrays.copyOfRange() ou System.arraycopy()
        Article[] newArticles = new Article[nbArticles + 1];

        for (int i = 0; i < articles.length; i++) {
            newArticles[i] = articles[i];
        }

        newArticles[nbArticles++] = article;
        this.articles = newArticles;

        return true;
    }
}
