package question3;

public class Article {

    private String name;
    private int price;

    public Article(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public static Article saisirArticle(String name, int price) {
        return new Article(name, price);
    }

    public void afficherArticle() {
        System.out.printf("- %s (%d €)\n", name, price);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
