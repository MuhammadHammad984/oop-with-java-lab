package week10;

import javax.swing.*;
import java.awt.event.*;

public class GreetGUI implements ActionListener {

    JFrame f;
    JTextField tf;
    JButton b;
    JLabel l;

    GreetGUI() {

        f = new JFrame("Greeting App");

        tf = new JTextField();
        b = new JButton("Greet");
        l = new JLabel();

        tf.setBounds(50, 50, 200, 30);
        b.setBounds(50, 100, 100, 30);
        l.setBounds(50, 150, 200, 30);

        b.addActionListener(this);

        f.add(tf);
        f.add(b);
        f.add(l);

        f.setSize(350, 250);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        l.setText("Hello, " + tf.getText() + "!");
    }

    public static void main(String[] args) {
        new GreetGUI();
    }
}