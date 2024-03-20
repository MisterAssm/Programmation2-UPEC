import java.util.Arrays;
import java.util.Comparator;

public class Web {

    private int nombrePages;
    private Page[] pages;

    public Web(Page[] pages) {
        this.pages = pages;
        this.nombrePages = pages.length;
    }

    public void pageRank(int n) {
        for (Page page : pages) {
            for (int i = 0; i < n - 1; i++) {
                Page current = page;
                for (int j = 0; j < n; j++) {
                    current.incrementPageRank();
                    int length = current.getPagesVoisines().length;
                    current = (length == 0 ? pages : current.getPagesVoisines())[getRandomNumber(0, length == 0 ? pages.length : length)];
                }
            }
        }
    }

    private int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        Arrays.stream(pages).sorted(Comparator.comparingInt(Page::getPageRank)
                .reversed())
                .forEach(page -> {
                    stringBuilder.append("www.").append(page.getUrl()).append(" : rank (").append(page.getPageRank()).append(")\n");
                });

        return stringBuilder.toString();
    }
}
