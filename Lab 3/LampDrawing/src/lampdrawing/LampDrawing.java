package lampdrawing;

import javax.swing.JFrame;

public class LampDrawing {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(600, 400);
        Lamp lp= new Lamp();
        f.setContentPane(lp);
        f.setVisible(true);
    }
}
