
package mouse_drawing;

import javax.swing.JFrame;


public class Mouse_Drawing {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        MyPanel p = new MyPanel();

        f.setSize(400, 400);
        f.setContentPane(p);
        f.setVisible(true);
    }
    
}
