
package simpleframe;

import javax.swing.JFrame;

public class SimpleFrame {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Hello to my Frame");
        MyPanel panel = new MyPanel();
        f.setContentPane(panel);
        f.setSize(500, 1000);
        f.setVisible(true);
        
    }
    
}
