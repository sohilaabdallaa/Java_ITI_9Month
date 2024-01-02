package simplethread;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class MyPanel extends JPanel implements Runnable{

    public MyPanel() {
        this.setBackground(Color.gray);
        new Thread(this).start();
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.black);
        Font font = new Font("Arial", Font.BOLD, 20);
        g.setFont(font);
        g.drawString(new Date().toLocaleString(), 100, 100);
    }
            
            
    @Override
    public void run()
    {
        while(true)
        {
            
            try {
                this.repaint();
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
    }
    
    
}
