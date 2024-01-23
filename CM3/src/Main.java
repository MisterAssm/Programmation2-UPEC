public class Main {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Début");

        for (int i = 0; i < 2000000; i++) {
            stringBuilder.append("to");
        }

        System.out.println("End");
    }

}