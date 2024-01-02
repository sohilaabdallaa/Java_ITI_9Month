
package draw_multiple_lines;

import javax.swing.JFrame;

public class Draw_Multiple_Lines {

    public static void main(String[] args) {

        JFrame f = new JFrame();
        MyPanel p = new MyPanel();

        f.setSize(400, 400);
        f.setContentPane(p);
        f.setVisible(true);
    }
    
}
