package week10;

import javax.swing.*;
import java.awt.event.*;

public class ShowMessageGUI implements ActionListener {

    JFrame f;
    JTextField tf;
    JButton b;

    ShowMessageGUI() {

        f = new JFrame("Show Message");

        tf = new JTextField();
        b = new JButton("Show Message");

        tf.setBounds(50, 50, 200, 30);
        b.setBounds(50, 100, 150, 30);

        b.addActionListener(this);

        f.add(tf);
        f.add(b);

        f.setSize(350, 250);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(f, "You entered: " + tf.getText());
    }

    public static void main(String[] args) {
        new ShowMessageGUI();
    }
}