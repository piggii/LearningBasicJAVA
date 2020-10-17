package BasicGUI;

import java.awt.*;
import javax.swing.*;

public class GUICheckbox {
    public static void main(String[] args) {
        JLabel lb1 = new JLabel("Choose your favorite subjects : ");
        JCheckBox check1 = new JCheckBox("Mathematics");
        JCheckBox check2 = new JCheckBox("Sciences");
        JFrame window = new JFrame();
        window.setSize(500,400);
        window.setTitle("Test Checkbox");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setMaximizedBounds(new Rectangle(800,600));
        window.add(lb1);
        window.add(check1);
        window.add(check2);
        window.setLayout(new FlowLayout());
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
