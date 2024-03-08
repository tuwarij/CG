package Lab4;
import javax.swing.*;
import java.awt.*;


public class Lab4_0133 extends JPanel {
    public static void main(String[] args) {
        Lab4_0133 m = new Lab4_0133();
        JFrame f = new JFrame();
        f.add(m);
        f.setTitle("Lab3_0133");
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

    }

    public void paintComponent(Graphics g) {
        
        // midpointCircle(g,300,300,100);
        ellipse(g,300, 250, 100, 50);
        
    }

    void midpointCircle(Graphics g,int xc, int yc, int r){
        int x = 0;
        int y = r;
        int Dx = 2 * x;
        int Dy = 2 * y;
        int d = 1 - r;
        
        while (x <= y) {
            plot8Points(g, xc, yc, x, y);
            x += 1;
            Dx += 2;
            d += Dx + 1;
            if(d >= 0){
                y -= 1;
                Dy -= 2;
                d -= Dy;
            }
        }
    }
    void ellipse (Graphics g,int xc, int yc, int a, int b){
        int a2 = a*a;
        int b2 = b*b;

        int twoA2 = 2 * a2;
        int twoB2 = 2 * b2;

        //REGION 1
        int x = 0;
        int y = b;
        int d = Math.round(b2 - a2 * b + a2 / 4);
        int dx = 0;
        int dy = twoA2 * y;
        while (dx <= dy){
            plot4Points(g, xc, yc, x, y);
            x = x + 1;
            dx = dx + twoB2;
            d = d + dx + b2;
            
            if(d >= 0){
                y = y - 1;
                dy = dy - twoA2;
                d = d - dy;
            }
        }
        //REGION 2
         x = a;
         y = 0;
         d = Math.round(a2 - b2 * a + b2 / 4);
         dx = twoB2 * x;
         dy = 0;
        while (dx >= dy){
            plot4Points(g, xc, yc, x, y);
            y += 1;
            dy += twoA2;
            d += dy + a2;
            
            if(d >= 0){
                x -= 1;
                dx -= twoB2;
                d -= dx;
            }
        }

    }
    void plot4Points(Graphics g, int xc, int yc, int x, int y) {
        plot(g, xc + x, yc + y);
        plot(g, xc + x, yc - y);
        plot(g, xc - x, yc - y);
        plot(g, xc - x, yc + y);
    }
    void plot8Points(Graphics g, int xc, int yc, int x, int y) {
        plot(g, xc + x, yc + y);
        plot(g, xc - x, yc + y);
        plot(g, xc + x, yc - y);
        plot(g, xc - x, yc - y);
        plot(g, xc + y, yc + x);
        plot(g, xc - y, yc + x);
        plot(g, xc + y, yc - x);
        plot(g, xc - y, yc - x);
    }
    public void plot(Graphics g, int x, int y) {
        g.fillRect(x, y, 1, 1);
    }
}
