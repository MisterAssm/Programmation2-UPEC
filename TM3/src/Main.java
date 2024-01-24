import graphics.Color;
import graphics.Ellipse;
import graphics.Rectangle;

public class Main {

    // (0,0) => en haut à gauche
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10, 60, 80);
        rectangle.draw();

        Ellipse ellipse = new Ellipse(100, 100, 40, 60);
        ellipse.setColor(Color.RED);
        ellipse.fill();

        rectangle.translate(20, 30);
        ellipse.grow(5, 5);
    }

}