
package word_motion;

import javax.swing.JFrame;

public class Word_Motion {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        MyPanel p = new MyPanel();

        f.setSize(400, 400);
        f.setContentPane(p);
        f.setVisible(true);
    }
    
}
