package week07;

import javax.swing.*;

public class Form {
    public static void main(String[] args) {

        JFrame f = new JFrame("Form");

        JLabel l = new JLabel("Name:");
        JTextField t = new JTextField();

        l.setBounds(50, 50, 100, 30);
        t.setBounds(120, 50, 150, 30);

        f.add(l);
        f.add(t);

        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
    }
}
