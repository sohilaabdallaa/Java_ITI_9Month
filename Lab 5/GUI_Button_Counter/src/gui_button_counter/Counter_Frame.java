package gui_button_counter;

import javax.swing.JFrame;

public class Counter_Frame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame f = new JFrame();
        MyPanel p = new MyPanel();

        f.setSize(400, 400);
        f.setContentPane(p);
        f.setVisible(true);
    }

}
