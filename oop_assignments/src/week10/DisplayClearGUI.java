package week10;

import javax.swing.*;
import java.awt.event.*;

public class DisplayClearGUI implements ActionListener {

    JFrame f;
    JTextField tf;
    JButton display, clear;
    JLabel l;

    DisplayClearGUI() {

        f = new JFrame("Display and Clear");

        tf = new JTextField();
        display = new JButton("Display");
        clear = new JButton("Clear");
        l = new JLabel();

        tf.setBounds(50, 50, 200, 30);
        display.setBounds(50, 100, 100, 30);
        clear.setBounds(160, 100, 100, 30);
        l.setBounds(50, 150, 200, 30);

        display.addActionListener(this);
        clear.addActionListener(this);

        f.add(tf);
        f.add(display);
        f.add(clear);
        f.add(l);

        f.setSize(350, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == display) {
            l.setText(tf.getText());
        }

        if (e.getSource() == clear) {
            tf.setText("");
            l.setText("");
        }
    }

    public static void main(String[] args) {
        new DisplayClearGUI();
    }
}