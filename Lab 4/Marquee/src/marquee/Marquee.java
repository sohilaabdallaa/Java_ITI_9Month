
package marquee;

import javax.swing.JFrame;

public class Marquee {

    public static void main(String[] args) {
        JFrame fr = new JFrame();
        MyPanel p = new MyPanel();
        
        fr.setTitle("Marquee Sheet");
        fr.setSize(300, 300);
        fr.setContentPane(p);
        fr.setVisible(true);
    }
    
}
