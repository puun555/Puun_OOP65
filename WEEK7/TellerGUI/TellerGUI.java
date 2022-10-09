package WEEK7.TellerGUI;
import javax.swing.*;
import java.awt.*;
public class TellerGUI {
    private JFrame f;
    private JPanel p1, p2, p3;
    private JButton b1, b2, b3;
    private JLabel l1, l2;
    private JTextField t1, t2;

    public TellerGUI() {
        f = new JFrame("TellerGUI");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();

        b1 = new JButton("Deposit"); 
        b2 = new JButton("Withdraw"); 
        b3 = new JButton("Exit");
        
        l1 = new JLabel("Balance");
        l2 = new JLabel("Amount");
        
        t1 = new JTextField();
        t2 = new JTextField();

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setLayout(new GridLayout(3, 1));

        p1.setLayout(new GridLayout(1, 2));
        p2.setLayout(new GridLayout(1, 2));
        p3.setLayout(new FlowLayout());

        p1.add(l1);
        p1.add(t1);

        p2.add(l2);
        p2.add(t2);

        p3.add(b1);
        p3.add(b2);
        p3.add(b3);

        f.add(p1);
        f.add(p2);
        f.add(p3);


        f.pack();

        f.setVisible(true);

    }
}
