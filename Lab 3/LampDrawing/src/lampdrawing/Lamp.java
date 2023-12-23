package lampdrawing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;

public class Lamp extends JPanel {

    public Lamp() {
        this.setBackground(Color.lightGray);
        this.setName(TOOL_TIP_TEXT_KEY);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);

        g.drawPolygon(new Polygon(new int[]{100, 155, 190}, new int[]{265, 180, 265}, 3));
        g.draw3DRect(30, 265, 256, 20, true);
        
        g.setColor(Color.yellow);
        
        // Draw the lamp 
        g.fillOval(85, 157, 130, 50);
        g.setColor(Color.yellow);
        
        g.drawArc(85, 87, 130, 50, 62, 58);

        g.drawLine(85, 177, 119, 89);
        g.drawLine(215, 177, 181, 89);
        
        g.setColor(Color.black);
        // Draw pattern on the shade
        g.fillArc(78, 120, 40, 40, 63, -174);
        g.fillOval(123, 96, 40, 50);
        g.fillArc(173, 100, 40, 40, 110, 180);

    }
}
