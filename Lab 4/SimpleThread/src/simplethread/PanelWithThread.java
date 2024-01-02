
package simplethread;

import javax.swing.JFrame;

public class PanelWithThread  {

    public static void main(String[] args) {
        JFrame fr = new JFrame();
        MyPanel p = new MyPanel();
        
        fr.setTitle("Current Date");
        fr.setSize(300, 300);
        fr.setContentPane(p);
        fr.setVisible(true);
        
        
    }
    
}
