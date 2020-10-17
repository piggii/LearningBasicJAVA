package BasicGUI;

import java.awt.*;
import javax.swing.*;

public class GUIJTextArea {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        JTextArea txt = new JTextArea(7,20);
        window.setSize(400,300);
        window.setMaximizedBounds(new Rectangle(800,600));
        window.setTitle("Test JTextArea");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(new JScrollPane(txt));
        window.setLayout(new FlowLayout());
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
