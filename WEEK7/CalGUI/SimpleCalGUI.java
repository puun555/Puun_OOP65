package WEEK7.CalGUI;
import javax.swing.*;
import java.awt.*;

public class SimpleCalGUI {
    private JFrame f;
    private JPanel p1, p2;
    private JButton b1,b2,b3,b4;
    private JTextField t1, t2, t3;

    public SimpleCalGUI() {
        f = new JFrame("เครื่องคิดเลข");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1 = new JPanel();
        p2 = new JPanel();

        b1 = new JButton("บวก");
        b2 = new JButton("ลบ");
        b3 = new JButton("คูณ");
        b4 = new JButton("หาร");

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();

        f.setLayout(new GridLayout(4, 1));

        p1.setLayout(new BorderLayout());
        p2.setLayout(new FlowLayout());

        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);

        p1.add(p2, BorderLayout.CENTER);

        f.add(t1);
        f.add(t2);
        f.add(p1);
        f.add(t3);

        f.pack();
        f.setVisible(true);

    }
}
