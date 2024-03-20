public class Page {

    private int pageRank;
    private String url;
    private Page[] pagesVoisines;

    public Page(String url, Page[] pagesVoisines) {
        this.pageRank = 0;
        this.url = url;
        this.pagesVoisines = pagesVoisines;
    }

    public int getPageRank() {
        return pageRank;
    }

    public void setPageRank(int pageRank) {
        this.pageRank = pageRank;
    }

    public void incrementPageRank() {
        this.pageRank++;
    }

    public String getUrl() {
        return url;
    }

    public Page[] getPagesVoisines() {
        return pagesVoisines;
    }
}
