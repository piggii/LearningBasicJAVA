package BasicGUI;

import java.awt.*;
import javax.swing.*;

public class GUIResizable {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        JButton button1 = new JButton("Save");
        JButton button2 = new JButton("Cancel");
        window.setSize(500, 400);
        window.setResizable(false); // fixed frame size
        window.setTitle("Test Resizable");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(button1);
        button1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        window.add(button2);
        button2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        window.setLayout(new FlowLayout());
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
