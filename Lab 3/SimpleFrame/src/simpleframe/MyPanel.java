package simpleframe;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.JPanel;
import java.awt.GraphicsEnvironment;

public class MyPanel extends JPanel {
    public MyPanel()
    {
    this.setBackground(Color.lightGray);
    this.setName(TOOL_TIP_TEXT_KEY);
    }
    @Override
    public void paint(Graphics g)
    {
        // call parent implementation
        super.paint(g);
        //String [] families = Toolkit.getDefaultToolkit().getFontList();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String [] families = ge.getAvailableFontFamilyNames();
        g.setColor(new Color(100, 149, 237));
        
        for(int i = 0; i < families.length; i++)
        {
            Font font = new Font(families[i], Font.BOLD, 16);
            g.setFont(font);
            String name = families[i];
            g.drawString(name, 30, (i * 2 + 1) * 20);
        
        }
    }
    
}
