import javax.swing.*;

public class Question1 {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        String name = JOptionPane.showInputDialog("Comment t'appelles-tu ?");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Quel âge as-tu ?"));

        System.out.println("Bienvenue " + name + " (" + age + " ans)");
    }

}