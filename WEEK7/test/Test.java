package WEEK7.test;
// import java.awt.*;
import javax.swing.*;;

public class Test extends JFrame{
    public static void main(String[] args) {
        JFrame f = new JFrame("Title");
        JPanel p = new JPanel();
        JButton b = new JButton("Press me");

        // f.setSize(200,200);


        p.add(b);
        f.setContentPane(p);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
    }
}
