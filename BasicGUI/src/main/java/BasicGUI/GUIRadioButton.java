package BasicGUI;

import java.awt.*;
import javax.swing.*;

public class GUIRadioButton {
    public static void main(String[] args) {
        ButtonGroup group = new ButtonGroup(); // Manage all button
        JLabel lb1 = new JLabel("Choose a career : ");
        JRadioButton r1 = new JRadioButton("Programmer",false);
        JRadioButton r2 = new JRadioButton("Engineer",false);
        JRadioButton r3 = new JRadioButton("Accountant",false);
        
        // Add button in the group
        group.add(r1);
        group.add(r2);
        group.add(r3);
        
        JFrame window = new JFrame();
        window.setSize(500,400);
        window.setTitle("Test RadioButton");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setMaximizedBounds(new Rectangle(800,600));
        window.add(lb1);
        window.add(r1);
        window.add(r2);
        window.add(r3);
        window.setLayout(new FlowLayout());
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
