import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class Lab5_0133 extends JPanel implements Runnable {
    double circleMove = 0;
    double velocity = 100;
    double velocitySquare = 100;
    double squareRotate = 0;
    double squareMove = 0;
    boolean SarmViYoungJaa = false;

    public static void main(String[] args) {
        Lab5_0133 m = new Lab5_0133();

        JFrame f = new JFrame();
        f.add(m);
        f.setTitle("Animation");
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

        (new Thread(m)).start();
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.WHITE);
        g2.fillRect(0, 0, 600, 600);
        g2.setColor(Color.BLACK);
        g2.translate(circleMove, 0);
        System.out.println(circleMove);
        g2.drawOval(0, 0, 100, 100);
        g2.translate(-circleMove, 0);

        g2.translate(circleMove, 0);
        int x1[] = { 34, change, change, 34 };
        int y1[] = { 472, 472, 518, 518 };
        g2.setColor(Color.black);
        Polygon poly1 = new Polygon(x1, y1, 4);
        g2.fillPolygon(poly1);
        g2.translate(-circleMove, 0);

        g2.rotate(squareRotate, 300, 300);
        g2.drawRect(200, 200, 200, 200);
        g2.rotate(-squareRotate, 300, 300);

        if (SarmViYoungJaa) {
            g2.translate(0, -squareMove + 270);
            g2.drawRect(0, 400, 200, 200);
            g2.translate(0, squareMove);
        } else {
            g2.drawRect(0, 400, 200, 200);
        }
    }

    @Override
    public void run() {
        double lastTime = System.currentTimeMillis();
        double currentTime, elapsedTime;
        double startTime = lastTime;

        while (true) {
            currentTime = System.currentTimeMillis();
            elapsedTime = currentTime - lastTime;
            lastTime = currentTime;
            if ((currentTime - startTime) % 300 == 0 || (currentTime - startTime) % 400 == 0) {
                circleMove += (velocity * elapsedTime / 2);
            }
            // circleMove += (velocity * elapsedTime / 1000);

            // TODO: update logics
            if (circleMove >= 490) {
                circleMove = 490;
                velocity = -velocity;
            }
            if (circleMove <= 0) {
                circleMove = 0;
                velocity = -velocity;
            }
            if (currentTime - startTime > 3000) {
                SarmViYoungJaa = true;
            }

            squareRotate += 0.5 * elapsedTime / 1000.0;
            squareMove += velocitySquare * (elapsedTime / 1000.0);
            // Display
            repaint();
        }
    }
}
