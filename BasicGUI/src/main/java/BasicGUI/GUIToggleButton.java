package BasicGUI;

import java.awt.*;
import javax.swing.*;

public class GUIToggleButton {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        ImageIcon off = new ImageIcon("C:\\Users\\Pictures\\switch-off.png");
        ImageIcon on = new ImageIcon("C:\\Users\\Pictures\\switch-on.png");
        
        JToggleButton tb1 = new JToggleButton();
        tb1.setToolTipText("Off");
        tb1.setIcon(off);
        tb1.setSelectedIcon(on);
        
        JToggleButton tb2 = new JToggleButton();
        tb2.setToolTipText("Off");
        tb2.setIcon(off);
        tb2.setSelectedIcon(on);
        
        window.setTitle("Test TogleButton");
        window.setSize(400,300);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(tb1);
        tb1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        window.add(tb2);
        tb2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        window.setLayout(new FlowLayout());
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
