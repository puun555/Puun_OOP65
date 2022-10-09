package WEEK7.Calculator;
import javax.swing.*;
import java.awt.*;

public class CalculatorSimple{
    private JFrame frame;
    private JPanel p2;
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bp, bm, bml, bdi, beq, bc;
    private JTextField txt;
    public CalculatorSimple() {
        frame = new JFrame("My Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p2 = new JPanel();
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        bp = new JButton("+");
        bm = new JButton("-");
        bml = new JButton("x");
        bdi = new JButton("/");
        beq = new JButton("=");
        bc = new JButton("c");
        txt = new JTextField();

        frame.setLayout(new BorderLayout());

        frame.add(txt, BorderLayout.NORTH);

        p2.setLayout(new GridLayout(4,4));
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(bp);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(bm);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(bml);
        p2.add(b0);
        p2.add(bc);
        p2.add(beq);
        p2.add(bdi);

        frame.add(p2, BorderLayout.SOUTH);

        frame.setVisible(true);
        frame.pack();
    }

}
