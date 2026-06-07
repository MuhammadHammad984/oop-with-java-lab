package week07;

import javax.swing.*;

public class StudentForm {
    public static void main(String[] args) {

        JFrame f = new JFrame("Student Form");

        JLabel name = new JLabel("Name:");
        JLabel id = new JLabel("ID:");
        JLabel dept = new JLabel("Dept:");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();

        name.setBounds(50, 50, 100, 30);
        t1.setBounds(120, 50, 150, 30);

        id.setBounds(50, 90, 100, 30);
        t2.setBounds(120, 90, 150, 30);

        dept.setBounds(50, 130, 100, 30);
        t3.setBounds(120, 130, 150, 30);

        f.add(name); f.add(t1);
        f.add(id); f.add(t2);
        f.add(dept); f.add(t3);

        f.setSize(350, 250);
        f.setLayout(null);
        f.setVisible(true);
    }
}