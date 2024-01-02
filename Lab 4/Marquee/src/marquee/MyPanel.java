/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marquee;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Lap Smart
 */

public class MyPanel extends JPanel implements Runnable{

    int x;
    public MyPanel() {
        this.setBackground(Color.gray);
        new Thread(this).start();
        x = 80;
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        if (x > this.getWidth())
            x = 0;
        g.setColor(Color.black);
        Font font = new Font("Arial", Font.BOLD, 20);
        g.setFont(font);
        g.drawString("Hello World", x, 100);
    }
            
            
    @Override
    public void run()
    {
        while(true)
        {
            
            try {
                this.repaint();
                Thread.sleep(1000);
                x += 10;
            } catch (InterruptedException ex) {
                Logger.getLogger(MyPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
    }
    
    
}

