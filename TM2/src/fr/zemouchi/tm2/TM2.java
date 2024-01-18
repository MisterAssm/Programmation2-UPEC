package fr.zemouchi.tm2;

public class TM2 {

    private int champ1;
    private int champ2;
    private String champ3;

    public TM2(int champ1, int champ2, String champ3) {
        this.champ1 = champ1;
        this.champ2 = champ2;
        this.champ3 = champ3;
    }

    public TM2(int champ1, int champ2) {
        this.champ1 = champ1;
        this.champ2 = champ2;
        this.champ3 = "somme";
    }

    public TM2() {
        this.champ1 = 5;
        this.champ2 = 5;
        this.champ3 = "toto";
    }

    public static String selfConcat(String string) {
        return string + string;
    }

    public int perform() {
        if (champ3.equals("somme")) {
            return champ1 + champ2;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "champ1 = " + champ1 + " | champ2 = " + champ2 + " | champ3 = '" + champ3 + "'";
    }
}
