package fr.zemouchi.tm2;

public class AppSB {

    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("hello");

        stringBuffer.append(" world");
        System.out.println(stringBuffer); // hello world

        stringBuffer.delete(0, 6); // [0,6[
        System.out.println(stringBuffer); // world

        stringBuffer.insert(2, "-");
        System.out.println(stringBuffer); // wo-rld

        StringBuffer stringBuffer1 = new StringBuffer();

        long tb0 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringBuffer1.append("to");
        }
        long tb1 = System.currentTimeMillis();

        String string = "";

        long ts0 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            string += "to";
        }
        long ts1 = System.currentTimeMillis();

        System.out.println("Temps d'exécution StringBuffer : " + (tb1 - tb0) + "ms");
        System.out.println("Temps d'exécution String : " + (ts1 - ts0) + "ms");

    }

}
