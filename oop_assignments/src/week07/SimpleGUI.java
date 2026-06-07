package week07;

import javax.swing.*;

public class SimpleGUI {
    public static void main(String[] args) {

        JFrame f = new JFrame("Simple GUI");

        JLabel l1 = new JLabel("Label 1");
        JLabel l2 = new JLabel("Label 2");

        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");

        l1.setBounds(50, 50, 100, 30);
        l2.setBounds(50, 90, 100, 30);
        b1.setBounds(50, 130, 100, 30);
        b2.setBounds(50, 170, 100, 30);

        f.add(l1);
        f.add(l2);
        f.add(b1);
        f.add(b2);

        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
