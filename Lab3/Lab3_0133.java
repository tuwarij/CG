package Lab3;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.*;

public class Lab3_0133 extends JPanel {
    public static void main(String[] args) {
        Lab3_0133 m = new Lab3_0133();
        JFrame f = new JFrame();
        f.add(m);
        f.setTitle("Lab3_0133");
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

    }

    public void paintComponent(Graphics g) {
        BufferedImage buffer = new BufferedImage(601, 601, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = buffer.createGraphics();

        g2.setColor(Color.white);
        g2.fillRect(0, 0, 600, 600);

        g2.setColor(Color.green);
        int xPoly [] = {150, 250, 325, 375, 400, 275, 100};
        int yPoly[] = {150, 100, 125, 225, 325, 375, 300};

        int xPolyh [] = {0, 250, 325, 300, 400, 275, 100};
        int yPolyh[] = {0, 100, 125, 200, 325, 375, 300};

        Polygon polyhead = new Polygon(xPolyh, yPolyh, xPolyh.length);
        Polygon poly = new Polygon(xPoly, yPoly, xPoly.length);
        g2.drawLine(100, 100, 500, 100);
        g2.drawPolygon(polyhead);
        g2.fillPolygon(poly);
        bezierCurve(g2, 100, 100, 100, 0, 500, 200, 500, 100);
        floodFill(buffer, 480, 110, Color.white, Color.BLUE);
        floodFill(buffer, 110, 90, Color.WHITE, Color.green);
        

        g.drawImage(buffer, 0, 0, null);
    }

    void bezierCurve(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        for (int i = 0; i < 1000; i++) {
            float t = i / 1000.0f;
            plot(g,(int) (Math.pow(1 - t, 3) * x1 + 3 * t * Math.pow(1 - t, 2) * x2
                        + 3 * t * t * (1 - t) * x3 + Math.pow(t, 3) * x4),
                    (int) (Math.pow(1 - t, 3) * y1 + 3 * t * Math.pow(1 - t, 2) * y2
                        + 3 * t * t * (1 - t) * y3 + Math.pow(t, 3) * y4));
        }
    }

    public BufferedImage floodFill(BufferedImage buf, int x, int y, Color targetColor, Color replacementColor) {
        Queue<NodeCoordinate> q = new LinkedList<>();
        coloredPlot(buf.getGraphics(), x, y, replacementColor);

        q.add(new NodeCoordinate(x, y));

        while (!q.isEmpty()) {
            NodeCoordinate cur = q.poll();
            try {
                // Sounth
                if (buf.getRGB(cur.getX(), cur.getY() + 1) == targetColor.getRGB()) {
                    coloredPlot(buf.getGraphics(), cur.getX(), cur.getY() + 1, replacementColor);
                    q.add(new NodeCoordinate(cur.getX(), cur.getY() + 1));
                }

            } catch (ArrayIndexOutOfBoundsException e) {

            }
            try {
                // North
                if (buf.getRGB(cur.getX(), cur.getY() - 1) == targetColor.getRGB()) {
                    coloredPlot(buf.getGraphics(), cur.getX(), cur.getY() - 1, replacementColor);
                    q.add(new NodeCoordinate(cur.getX(), cur.getY() - 1));
                }

            } catch (ArrayIndexOutOfBoundsException e) {

            }
            try {
                // West
                if (buf.getRGB(cur.getX() - 1, cur.getY()) == targetColor.getRGB()) {
                    coloredPlot(buf.getGraphics(), cur.getX() - 1, cur.getY(), replacementColor);
                    q.add(new NodeCoordinate(cur.getX() - 1, cur.getY()));
                }

            } catch (ArrayIndexOutOfBoundsException e) {

            }
            try {
                // East
                if (buf.getRGB(cur.getX() + 1, cur.getY()) == targetColor.getRGB()) {
                    coloredPlot(buf.getGraphics(), cur.getX() + 1, cur.getY(), replacementColor);
                    q.add(new NodeCoordinate(cur.getX() + 1, cur.getY()));
                }

            } catch (ArrayIndexOutOfBoundsException e) {

            }

            System.out.println(q.size());

        }

        return buf;
    }
    void coloredPlot(Graphics g, int x, int y, Color c) {
        g.setColor(c);
        g.fillRect(x, y, 1, 1);
        g.setColor(Color.BLACK);
    }
    public void plot(Graphics g, int x, int y) {
        g.fillRect(x, y, 1, 1);
    }
    
    class NodeCoordinate{
    private int x;
    private int y;

    NodeCoordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
}

