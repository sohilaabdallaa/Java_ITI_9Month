package lampanimation;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class Lamp extends JPanel implements Runnable {

//    private static Color currentColor;
    private static Color[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW};
    private static int currentIndex = 0;

    public Lamp() {
        this.setBackground(Color.lightGray);
        new Thread(this).start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        /*
        g.setColor(Color.BLACK);
        g.drawLine(125, 250, 125, 160);

        g.drawLine(175, 250, 175, 160);
        //g.drawPolygon(new Polygon(new int[]{100, 155, 190}, new int[]{265, 180, 265}, 3));
        g.fill3DRect(30, 250, 256, 20, true);

        // Draw the lamp 
        g.fillOval(85, 157, 130, 50);

        g.drawArc(85, 87, 130, 50, 62, 58);

        g.drawLine(85, 177, 119, 89);
        g.drawLine(215, 177, 181, 89);

        g.setColor(Color.black);
        // Draw pattern on the shade
        g.fillArc(78, 120, 40, 40, 63, -174);
        g.fillOval(123, 96, 40, 50);
        g.fillArc(173, 100, 40, 40, 110, 180);*/
        //drawing a rectangle
        g.setColor(Color.black);
        g.drawRect(132, 290, 120, 30);        
        g.drawLine(170, 290, 185, 210);
        g.drawLine(215, 290, 200,210);
        g.drawArc(61, 130, 255, 80, 211, 120);
        
        // drawing a line
        g.drawLine(80, 190, 100, 70); 
        g.drawLine(300, 189, 280, 70);

        g.setColor(colors[currentIndex]);
        //drawing circles
        g.fillOval(100, 50, 180, 40);
        g.fillOval(100, 110, 40, 60);
        g.fillOval(240, 110, 40, 60);
        g.fillOval(160, 100, 60, 90);

    }

    @Override
    public void run() {
        while (true) {
            try {

                this.repaint();
                changeColor();
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Lamp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private static void changeColor() {
        //currentColor = (currentColor == Color.RED) ? Color.BLUE : Color.RED;
        currentIndex = (currentIndex + 1) % colors.length;
    }
}
