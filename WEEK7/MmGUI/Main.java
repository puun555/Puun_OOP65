package WEEK7.MmGUI;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
          e.printStackTrace();
    }
    SwingUtilities.invokeLater(() -> { MnGUI frame = new MnGUI(); });
    }
}
