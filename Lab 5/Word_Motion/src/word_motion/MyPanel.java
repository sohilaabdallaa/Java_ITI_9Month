package word_motion;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

/**
 *
 * @author Lap Smart
 */
public class MyPanel extends JPanel {

    int x;
    int y;

    public MyPanel() {
        this.setBackground(Color.gray);
        x = 100;
        y = 100;

        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("Typed");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int code = e.getKeyCode();
                System.out.println("Key Code "+code);
                switch (code) {
                    case KeyEvent.VK_DOWN: {
                        y += 10;
                        break;
                    }
                    case KeyEvent.VK_UP: {
                        y -= 10;
                        break;
                    }
                    case KeyEvent.VK_LEFT: {
                        x -= 10;
                        break;
                    }
                    case KeyEvent.VK_RIGHT: {
                        x += 10;
                        break;
                    }
                   }
                    updateUI();
                    if(y<0) y=getHeight();
                    if(y>getHeight()) y=0;
                    if (x< 0) x=getWidth();
                    if(x>getWidth()) x=0;
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("Released");
               }
        });
        this.setFocusable(true);

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Font f = new Font("Times New Roman", Font.BOLD, 26);
        g.setFont(f);
        g.setColor(Color.BLACK);
        g.drawString("Hello Java ", x, y);

    }

}
