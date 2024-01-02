
package draw_multiple_lines;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Vector;
import javax.swing.JPanel;

public class MyPanel extends JPanel{
    Line line;
    Vector <Line> lines = new Vector<>();
    

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
                line = new Line();
                line.x1 = e.getX();
                line.y1 = e.getY();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                line.x2 = e.getX();
                line.y2 = e.getY();
                lines.add(line);
                repaint();
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
                line.x2 = e.getX();
                line.y2 = e.getY();
                repaint();
                
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
        for(Line cur_line: lines)
            g.drawLine(cur_line.x1, cur_line.y1, cur_line.x2, cur_line.y2);
        

    }
   
}
