package gui_button_counter;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MyPanel extends JPanel {

    int x;
    JButton plusButton;
    JButton minusButton;

    public MyPanel() {
        this.setBackground(Color.gray);
        x = 0;
        plusButton = new JButton(" +1 ");
        minusButton = new JButton(" -1 ");

        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x++;
                updateUI();
            }
        });
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x--;
                updateUI();
            }
        });
        
        this.setFocusable(true);
        this.add(plusButton);
        this.add(minusButton);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Font f = new Font("Times New Roman", Font.BOLD, 26);
        g.setFont(f);
        g.setColor(Color.BLACK);
        g.drawString("X = " + x, 100, 200);
        

    }

}
