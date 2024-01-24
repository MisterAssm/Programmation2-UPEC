import graphics.Color;
import graphics.Line;
import graphics.Picture;
import graphics.Rectangle;

import java.util.Arrays;

public class Hexagone {

    private int x;
    private int y;
    private int length;

    private int[] xPoints;
    private int[] yPoints;

    // TODO: Fill method

    public Hexagone(int x, int y, int length) {
        this.x = x;
        this.y = y;
        this.length = Math.abs(length);

        this.xPoints = new int[6];
        this.yPoints = new int[6];

        // On calcul les coordonnées de toutes les arrêtes
        for (int i = 0; i < 6; i++) {
            double angle = 2 * Math.PI * i / 6;
            xPoints[i] = x + (int) (this.length * Math.cos(angle));
            yPoints[i] = y + (int) (this.length * Math.sin(angle));
        }
    }

    public static void main(String[] args) {

        Hexagone hexagone = new Hexagone(200, 200, 100);
        hexagone.draw();
        //hexagone.fill(Color.BLUE);

        System.out.println("xPoints = " + Arrays.toString(hexagone.xPoints));
        System.out.println("yPoints = " + Arrays.toString(hexagone.yPoints));

    }

    public void draw() {
        for (int i = 0; i < 6; i++) {
            int nextIndex = (i + 1) % 6;
            new Line(xPoints[i], yPoints[i], xPoints[nextIndex], yPoints[nextIndex]).draw();
        }
    }

    public void fill(Color color) {

        Picture picture = new Picture(length * 2, length * 2);
        picture.setColorAt(10, Color.YELLOW);
        picture.translate(xPoints[3], yPoints[4]);
        picture.draw();

        int xFromReference = xPoints[4];
        int xToReference = xPoints[5];

        for (int y = 0; y < length; y++) {
            for (int x = 0; x < 2 * length; x++) {

                Color color1 = (x - y > this.x - length / 2) ? Color.BLACK : Color.WHITE;

                picture.setColorAt(x, y, color1);

            }

        }

        /*for (int y = yPoints[3]; y <= yPoints[2]; y++) {
            picture.setColorAt(0 + 2, y, Color.BLUE);
        }*/

        /*for (int i = 0; i < 100; i++) {
            picture.setColorAt(i, 10, Color.BLUE);
        }*/

        /*for (int i = 0; i < 1000; i++) {
            Line line = new Line(xPoints[3], yPoints[3], xPoints[2], yPoints[2]);
            line.translate(i * 0.1, -i * 0.1);
            line.draw();

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }*/

        /*int xFrom = xPoints[3];
        int xTo = xPoints[4];

        int index = 0;
        int xFromReference = xPoints[3];
        int yFromReference = yPoints[3];
        int xToReference = xPoints[0];
        int yToReference = yPoints[0];

        while (xFrom <= xTo) {
            new Line(xFromReference + index, yFromReference + index, xToReference - index, yToReference + index).draw();
            new Line(xFromReference + index, yFromReference - index, xToReference - index, yToReference - index).draw();

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            index++;
            xFrom++;
        }*/
    }

}
