package WEEK7.MmGUI;
import javax.swing.*;
import java.awt.*;

public class MnGUI {
    private JFrame f;
    private JMenuBar mb;
    private JMenu m1, m2, m3, mn1;
    private JMenuItem mi1, mi2, mi3, mni1, mni2;
    private JDesktopPane desktopPane;
    private JInternalFrame frame1, frame2, frame3;

    public MnGUI() {
        desktopPane = new JDesktopPane();

        frame1 = new JInternalFrame();
        frame2 = new JInternalFrame();
        frame3 = new JInternalFrame();

        f = new JFrame("SubMenuItem Demo");

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mb = new JMenuBar();
        
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");

        mn1 = new JMenu("New");

        mi1 = new JMenuItem("Open");
        mi2 = new JMenuItem("Save");
        mi3 = new JMenuItem("Exit");
        mni1 = new JMenuItem("Window");
        mni2 = new JMenuItem("Message");

        f.setJMenuBar(mb);

        mb.add(m1);
        mb.add(m2);
        mb.add(m3);

        m1.add(mn1);
        m1.addSeparator();

        m1.add(mi1);
        m1.addSeparator();

        m1.add(mi2);
        m1.addSeparator();

        m1.add(mi3);
        
        mn1.add(mni1);
        mn1.addSeparator();
        mn1.add(mni2);

        m1.setMnemonic('F');

        frame1.setSize(300,150);
        frame1.setVisible(true);
        frame2.setSize(300,200);
        frame2.setVisible(true);
        frame3.setSize(400,280);
        frame3.setVisible(true);
        
        int x1 = frame1.getX();
        int y1 = frame1.getY();
        frame1.setLocation(x1+70, y1+350);
        frame2.setLocation(x1+300, y1+100);
        frame3.setLocation(x1+650, y1+250);
        
        desktopPane.add(frame1);
        desktopPane.add(frame2);
        desktopPane.add(frame3);
        
        f.add(desktopPane, BorderLayout.CENTER);
        f.setSize(1200,720);
        f.setVisible(true);
    }
}
