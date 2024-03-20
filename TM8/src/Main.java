public class Main {
    public static void main(String[] args) {

        Page pageA = new Page("A", new Page[2]);
        Page pageB = new Page("B", new Page[]{pageA});
        Page pageC = new Page("C", new Page[]{pageA, pageB});

        pageA.getPagesVoisines()[0] = pageB;
        pageA.getPagesVoisines()[1] = pageC;

        // ----- //

        Web web = new Web(new Page[]{pageA, pageB, pageC});

        web.pageRank(10);

        System.out.println(web);

    }
}