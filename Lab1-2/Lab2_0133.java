import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class Lab2_0133 extends JPanel {
    public static void main(String[] args) {
        Lab2_0133 m = new Lab2_0133();
        JFrame f = new JFrame();
        f.add(m);
        f.setTitle("First Swing");
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

    }

    public void paintComponent(Graphics g) {
        naiveLine(g, 100, 100, 400, 200);
        naiveLine(g, 400, 300, 100, 200);
        naiveLine(g, 100, 100, 200, 400);

        // dda(g, 100, 100, 400, 200);
        // dda(g, 400, 300, 100, 200);
        // dda(g, 100, 100, 200, 400);
        //g.drawLine(0, 0, 600, 600);
        // bresenham(g, 100, 100, 400, 200);
        // bresenham(g, 400, 300, 100, 200);
        // bresenham(g, 100, 100, 200, 400);
    }

    public void naiveLine(Graphics g, int x1, int y1, int x2, int y2) {
        float dx = x2 - x1;
        float dy = y2 - y1;
        float b = y1 - (dy / dx) * x1;
        if (x1 < x2) {
            for (int x = x1; x <= x2; x++) {
                int y = Math.round(((dy / dx) * x) + b);
                plot(g, x, y);
            }
        } else {
            for (int x = x2; x <= x1; x++) {
                int y = Math.round(((dy / dx) * x) + b);
                plot(g, x, y);
            }
        }
    }

    public void dda(Graphics g, int x1, int y1, int x2, int y2) {
        float dx = (x2 - x1);
        float dy = (y2 - y1);
        float m = dy / dx;
        System.out.println(m);
        if (x1 < x2) {
            float x = x1;
            float y = y1;
            if (m <= 1 && m >= 0) {
                for (x = x1; x <= x2; x++) {
                    y = y + m;
                    plot(g, Math.round(x), Math.round(y));
                }
            }else if (m > 1) {
                for (y = y1; y <= y2; y++) {
                    x = x + 1 / m;
                    plot(g, Math.round(x), Math.round(y));
                }
            }else if (m >= -1) {
                for (x = x2; x <= x1; x++) {
                    y = y + m;
                    plot(g, Math.round(x), Math.round(y));
                } 
            }else {
                for (y = y2; y <= y1; y++) {
                    x = x + 1 / m;
                    plot(g, Math.round(x), Math.round(y));
                }
            }
        }else{
            float x = x2;
            float y = y2;
            if (m <= 1 && m >= 0) {
                for (x = x2; x <= x1; x++) {
                    y = y + m;
                    System.out.print("x = "+x);
                    System.out.println(" y = "+Math.round(y));
                    plot(g, Math.round(x), Math.round(y));
                }
            } else if (m > 1) {
                for (y = y2; y <= y1; y++) {
                    x = x + 1 / m;
                    plot(g, Math.round(x), Math.round(y));
                }
            } 
            else if (m >= -1) {
                for (x = x1; x <= x2; x++) {
                    y = y + m;
                    plot(g, Math.round(x), Math.round(y));
                }
            }else {
                for (y = y1; y <= y2; y++) {
                    x = x + 1 / m;
                    plot(g, Math.round(x), Math.round(y));
                }
            }
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
                if (isSwap) x += sx;
                else y += sy;
                d -= 2 * dx;
            }
            if (isSwap) y += sy;
            else x += sx;
            d += 2 * dy;
        }
    }

    public void plot(Graphics g, int x, int y) {
        g.fillRect(x, y, 1, 1);
    }
}
