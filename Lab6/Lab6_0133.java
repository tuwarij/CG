package Lab6;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class Lab6_0133 extends JPanel {
    public static void main(String[] args) {
        Lab6_0133 m = new Lab6_0133();
        JFrame f = new JFrame();
        f.add(m);
        f.setTitle("Lab6_0133");
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.black);
        g2.setTransform(new AffineTransform(1, 0, 0, 1, 100, 100));
        g2.drawRect(200, 200, 200, 200);

        g2.setColor(Color.green);
        g2.setTransform(new AffineTransform(Math.cos(Math.toRadians(30)),-Math.sin(Math.toRadians(30)),Math.sin(Math.toRadians(30)),Math.cos(Math.toRadians(30)),0, 0));
        g2.drawRect(200, 200, 200, 200);

        g2.setColor(Color.red);
        g2.setTransform(new AffineTransform(2, 0, 0 , 2, -50, 50));
        g2.drawRect(200, 200, 200, 200);
    }

}
