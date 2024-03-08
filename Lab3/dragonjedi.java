package Lab3;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.*;

public class dragonjedi extends JPanel {
    public void paintComponent(Graphics g) {
        BufferedImage buffer = new BufferedImage(601, 601, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = buffer.createGraphics();
        g2.setColor(Color.white);
        g2.fillRect(0, 0, 600, 600);

        tail(g2);
        body(g2);
        
        g.drawImage(buffer, 0, 0, null);
    }
    void tail (Graphics g){
        int x1[] = { 260, 319, 327};
        int y1[] = { 192, 140, 162};
        g.setColor(new Color(0xff35525));
        Polygon poly = new Polygon(x1, y1, x1.length);
        g.fillPolygon(poly);

        int x2[] = { 327, 395, 390};
        int y2[] = { 162, 149, 173};
        g.setColor(new Color(0xffed885));
        Polygon poly2 = new Polygon(x2, y2, x2.length);
        g.fillPolygon(poly2);

        int x3[] = { 260, 300, 327};
        int y3[] = { 192, 211, 162};
        g.setColor(new Color(0xfce2053));
        Polygon poly3 = new Polygon(x3, y3, x3.length);
        g.fillPolygon(poly3);
        
        int x4[] = { 300, 327, 342};
        int y4[] = { 211, 162, 184};
        g.setColor(new Color(0xf35525));
        Polygon poly4 = new Polygon(x4, y4, x4.length);
        g.fillPolygon(poly4);

        int x5[] = { 300, 342, 350};
        int y5[] = { 211, 184, 193};
        g.setColor(new Color(0xffdb339));
        Polygon poly5 = new Polygon(x5, y5, x5.length);
        g.fillPolygon(poly5);

        int x6[] = { 327, 342, 390};
        int y6[] = { 162, 184, 173};
        g.setColor(new Color(0xffdb339));
        Polygon poly6 = new Polygon(x6, y6, x6.length);
        g.fillPolygon(poly6);

        int x7[] = { 342, 386, 390};
        int y7[] = { 184, 195, 173};
        g.setColor(new Color(0xfeff2bd));
        Polygon poly7 = new Polygon(x7, y7, x7.length);
        g.fillPolygon(poly7);

        int x8[] = { 342, 350, 386};
        int y8[] = { 184, 193, 195};
        g.setColor(new Color(0xffed885));
        Polygon poly8 = new Polygon(x8, y8, x8.length);
        g.fillPolygon(poly8);

        int x9[] = { 350, 386, 435};
        int y9[] = { 193, 195, 292};
        g.setColor(new Color(0xfec4523));
        Polygon poly9 = new Polygon(x9, y9, x9.length);
        g.fillPolygon(poly9);

        int x10[] = { 390, 407, 430};
        int y10[] = { 174, 198, 191};
        g.setColor(new Color(0xfe4e88d));
        Polygon poly10 = new Polygon(x10, y10, x10.length);
        g.fillPolygon(poly10);

        int x11[] = { 385, 390, 452};
        int y11[] = { 195, 174, 259};
        g.setColor(new Color(0xfffd986));
        Polygon poly11 = new Polygon(x11, y11, x11.length);
        g.fillPolygon(poly11);

        int x12[] = { 385, 390, 452};
        int y12[] = { 195, 174, 259};
        g.setColor(new Color(0xfffd986));
        Polygon poly12 = new Polygon(x12, y12, x12.length);
        g.fillPolygon(poly12);

        int x13[] = { 385, 452, 435};
        int y13[] = { 195, 259, 292};
        g.setColor(new Color(0xffbb33b));
        Polygon poly13 = new Polygon(x13, y13, x13.length);
        g.fillPolygon(poly13);

        int x14[] = { 452, 435, 502};
        int y14[] = { 259, 292, 306};
        g.setColor(new Color(0xffed885));
        Polygon poly14 = new Polygon(x14, y14, x14.length);
        g.fillPolygon(poly14);

        int x15[] = { 452, 494, 502};
        int y15[] = { 259, 282, 306};
        g.setColor(new Color(0xfe3e88a));
        Polygon poly15 = new Polygon(x15, y15, x15.length);
        g.fillPolygon(poly15);

        int x16[] = { 494, 502, 536};
        int y16[] = { 282, 306, 282};
        g.setColor(new Color(0xfbed968));
        Polygon poly16 = new Polygon(x16, y16, x16.length);
        g.fillPolygon(poly16);

        int x17[] = { 494, 518, 536};
        int y17[] = { 282, 268, 282};
        g.setColor(new Color(0xfbcc94a));
        Polygon poly17 = new Polygon(x17, y17, x17.length);
        g.fillPolygon(poly17);

        int x18[] = { 518, 536, 536};
        int y18[] = { 268, 282, 229};
        g.setColor(new Color(0xfd0df5e));
        Polygon poly18 = new Polygon(x18, y18, x18.length);
        g.fillPolygon(poly18);

        int x19[] = { 518, 518, 536};
        int y19[] = { 268, 236, 229};
        g.setColor(new Color(0xf8dc74e));
        Polygon poly19 = new Polygon(x19, y19, x19.length);
        g.fillPolygon(poly19);

        int x20[] = { 493, 518, 536};
        int y20[] = { 177, 236, 229};
        g.setColor(new Color(0xf55b74c));
        Polygon poly20 = new Polygon(x20, y20, x20.length);
        g.fillPolygon(poly20);

        int x21[] = { 484, 487, 518};
        int y21[] = { 153, 193, 236};
        g.setColor(new Color(0xf217d93));
        Polygon poly21 = new Polygon(x21, y21, x21.length);
        g.fillPolygon(poly21);

        int x22[] = { 471, 487, 504};
        int y22[] = { 193, 193, 216};
        g.setColor(new Color(0xfbbcb44));
        Polygon poly22 = new Polygon(x22, y22, x22.length);
        g.fillPolygon(poly22);

        int x23[] = { 496, 501, 509};
        int y23[] = { 180, 189, 165};
        g.setColor(new Color(0xfbbcb44));
        Polygon poly23 = new Polygon(x23, y23, x23.length);
        g.fillPolygon(poly23);

        int x24[] = { 455, 485, 487};
        int y24[] = { 153, 167, 189};
        g.setColor(new Color(0xfe1e98a));
        Polygon poly24 = new Polygon(x24, y24, x24.length);
        g.fillPolygon(poly24);

        int x25[] = { 461, 484, 485};
        int y25[] = { 127, 150, 164};
        g.setColor(new Color(0xfeaca87));
        Polygon poly25 = new Polygon(x25, y25, x25.length);
        g.fillPolygon(poly25);

        int x26[] = { 483, 488, 496};
        int y26[] = { 150, 164, 127};
        g.setColor(new Color(0xfeaca87));
        Polygon poly26 = new Polygon(x26, y26, x26.length);
        g.fillPolygon(poly26);

        int x27[] = { 407, 439, 447};
        int y27[] = { 198, 241, 238};
        g.setColor(new Color(0xfe2e98a));
        Polygon poly27 = new Polygon(x27, y27, x27.length);
        g.fillPolygon(poly27);

        int x28[] = { 439, 452, 458};
        int y28[] = { 241, 259, 256};
        g.setColor(new Color(0xfe2e98a));
        Polygon poly28 = new Polygon(x28, y28, x28.length);
        g.fillPolygon(poly28);

    }
    void body (Graphics g){
        int x1[] = { 248,260, 300};
        int y1[] = { 269,192, 211};
        g.setColor(new Color(0xff25625));
        Polygon poly1 = new Polygon(x1, y1, x1.length);
        g.fillPolygon(poly1);
    }

    public void plot(Graphics g, int x, int y) {
        g.fillRect(x, y, 1, 1);
    }

    void bezierCurve(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        for (int i = 0; i < 1000; i++) {
            float t = i / 1000.0f;
            plot(g, (int) (Math.pow(1 - t, 3) * x1 + 3 * t * Math.pow(1 - t, 2) * x2
                    + 3 * t * t * (1 - t) * x3 + Math.pow(t, 3) * x4),
                    (int) (Math.pow(1 - t, 3) * y1 + 3 * t * Math.pow(1 - t, 2) * y2
                            + 3 * t * t * (1 - t) * y3 + Math.pow(t, 3) * y4));
        }
    }

    public void bresenham(Graphics g, int x1, int y1, int x2, int y2) {
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);
        int sx = (x1 < x2) ? 1 : -1;
        int sy = (y1 < y2) ? 1 : -1;
        boolean isSwap = false;
        if (dy > dx) {
            int emp = dx;
            dx = dy;
            dy = emp;
            isSwap = true;
        }
        int d = 2 * dy - dx;
        int x = x1, y = y1;
        for (int i = 1; i <= dx; i++) {
            plot(g, x, y);
            if (d >= 0) {
                if (isSwap)
                    x += sx;
                else
                    y += sy;
                d -= 2 * dx;
            }
            if (isSwap)
                y += sy;
            else
                x += sx;
            d += 2 * dy;
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

    public static void main(String[] args) {
        dragonjedi m = new dragonjedi();
        JFrame f = new JFrame();
        f.add(m);
        f.setTitle("dragon");
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

    }
}

class NodeCoordinate {
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