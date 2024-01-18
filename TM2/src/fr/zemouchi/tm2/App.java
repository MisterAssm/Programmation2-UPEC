package fr.zemouchi.tm2;

public class App {

    public static void main(String[] args) {
        TM2 tm2 = new TM2(5, 10, "somme");

        System.out.println("tm2.perform() = " + tm2.perform());
        System.out.println("TM2.selfConcat(\"to\") = " + TM2.selfConcat("to"));

        System.out.println(tm2);
    }

}
