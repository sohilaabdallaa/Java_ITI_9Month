
package mouse_drawing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;

public class MyPanel extends JPanel{
    int x1, x2;
    int y1, y2;

    public MyPanel() {
        this.setBackground(Color.gray);
        this.setFocusable(true);
        
        this.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                x1 = e.getX();
                y1 = e.getY();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("");
            }

            @Override
            public void mouseExited(MouseEvent e) {
            System.out.println("");
            }
        
            
        });
        this.addMouseMotionListener(new MouseMotionListener(){
            @Override
            public void mouseDragged(MouseEvent e) {
                x2 = e.getX();
                y2 = e.getY();
                updateUI();
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                System.out.println("");
            }
        
        
        });   
        
    }
    
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawLine(x1, y1, x2, y2);

    }
    
    
    
    
}
