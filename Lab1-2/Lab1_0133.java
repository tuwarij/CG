import java.awt.*;
import java.util.Random;

import javax.swing.*;

class GraphicsSwing extends JPanel {
    public static void main(String[] args) {
        GraphicsSwing m = new GraphicsSwing();
        JFrame f = new JFrame();
        f.add(m);
        f.setTitle("First Swing");
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

    }

    public void paintComponent(Graphics g) {
        g.drawString("jirawut", 20, 100);
        g.setColor(Color.black);
        g.fillRect(250, 30, 100, 200);
        g.drawOval(30, 130, 50, 60);
        g.setColor(Color.orange);
        g.drawLine(0, 0, 600, 600);
        g.fillOval(130, 130, 50, 60);
        g.setColor(Color.pink);
        g.drawArc(30, 200, 40, 50, 90, 360);
        g.fillArc(30, 200, 40, 50, 180, 180);
        g.setColor(Color.blue);

        Random random = new Random();   
        // 10 dot
        int i = 0;
        while (i < 10) {
            int x = random.nextInt(450);
            int y = random.nextInt(100);
            plot(g,x+50, y+380);
            i++;
        }

    }

    private void plot(Graphics g, int x, int y) {
        g.fillRect(x, y, 3, 3);
    }

    
}