import graphics.Color;
import graphics.Ellipse;
import graphics.Line;
import graphics.Rectangle;

import javax.swing.*;

public class Echequier {

    private int length = 800;
    private int uniqueLength = length / 8;

    public static void main(String[] args) {

        Echequier echequier = new Echequier();
        echequier.draw();

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                echequier.placeChip(i, j, j % 2 == i % 2);
            }
        }

    }

    public void draw() {
        Rectangle rectangle = new Rectangle(0, 0, length, length);
        rectangle.setColor(new Color(41, 75, 41));
        rectangle.fill();

        for (int i = 1; i < 8; i++) {
            Line line = new Line((double) uniqueLength * i, 0, (double) uniqueLength * i, length);
            line.setColor(Color.WHITE);
            line.draw();

            Line line1 = new Line(0, (double) uniqueLength * i, length, (double) uniqueLength * i);
            line1.setColor(Color.WHITE);
            line1.draw();
        }
    }

    public void placeChip(int x, int y, boolean player1) {
        Color color = player1 ? Color.WHITE : Color.BLACK;

        Ellipse ellipse = new Ellipse(x * uniqueLength + 10, y * uniqueLength + 10, 80, 80);
        ellipse.setColor(color);
        ellipse.fill();
    }

}
