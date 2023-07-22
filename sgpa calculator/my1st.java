import javax.swing.*;
import java.awt.event.*;

public class my1st {
    JFrame f;

    my1st() {
        f = new JFrame("sgpa calculator");
        final JLabel label = new JLabel();
        label.setBounds(0, 0, 90, 20);
        final JLabel label1 = new JLabel();
        label1.setBounds(10, 100, 150, 20);
        label1.setText("select current semester:-");
        JButton b = new JButton("Show");
        b.setBounds(200, 100, 75, 20);
        String languages[] = { "1", "2", "3", "4", "5", "6", "7", "8" };
        final JComboBox cb = new JComboBox(languages);
        cb.setBounds(155, 100, 40, 20);
        f.add(cb);
        f.add(label);
        f.add(b);
        f.add(label1);
        final JLabel mass = new JLabel("enter your past sgpa ditails in unde the box:-");
        mass.setBounds(10, 150, 300, 20);
        f.add(mass);
        final JLabel mass1 = new JLabel("");
        mass1.setBounds(10, 250, 500, 20);
        f.add(mass1);
        JLabel tt[] = new JLabel[] { new JLabel("sem 1"), new JLabel("sem 2"), new JLabel("sem 3"), new JLabel("sem 4"),
                new JLabel("sem 5"), new JLabel("sem 6"), new JLabel("sem 7"), new JLabel("your needed sgpa") };
        for (int ii = 0; ii < 7; ii++) {
            tt[ii].setBounds(100 * ii + 10, 175, 50, 20);
            f.add(tt[ii]);
        }
        tt[7].setBounds(100 * 7 + 1, 175, 150, 20);
        f.add(tt[7]);
        JTextField t[] = new JTextField[] { new JTextField(""), new JTextField(""), new JTextField(""),
                new JTextField(""), new JTextField(""), new JTextField(""), new JTextField(""), new JTextField("") };
        t[7].setEditable(true);
        t[7].setEditable(true);
        for (int i = 0; i < 8; i++) {
            t[i].setBounds(100 * i + 10, 200, 50, 20);
            f.add(t[i]);
        }
        f.setLayout(null);
        f.setSize(900, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "" + cb.getItemAt(cb.getSelectedIndex());
                int a = Integer.parseInt(data) - 1;
                for (int i = 0; i < 7; i++) {
                    if (i < a) {
                        t[i].setEditable(true);
                    } else {
                        t[i].setEditable(false);
                    }
                }
                String jk1 = t[7].getText();
                Double jk = Double.parseDouble(jk1);
                Double sum = 0.0;
                for (int i = 0; i < a; i++) {
                    String kk = t[i].getText();
                    Double jj = Double.parseDouble(kk);
                    sum += jj;
                }
                System.out.println(sum);
                Double ttt = (((8 * jk) - sum) / (8 - a));
                mass1.setText("you have need to minimum sgpa in every semester " + ttt);
            }
        });
    }

    public static void main(String[] args) {
        new my1st();
    }
}