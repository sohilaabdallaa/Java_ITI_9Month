
package lampanimation;

import javax.swing.JFrame;

public class LampAnimation {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        Lamp lp= new Lamp();
        
        f.setSize(600, 400);
        f.setContentPane(lp);
        f.setVisible(true);
    }
    
}
