package BasicGUI;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JButton;

public class GUIMaximizedBound {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        JButton button1 = new JButton("Save");
        JButton button2 = new JButton("Cancel");
        Dimension size = new Dimension(400,300);
        window.setTitle("Test Maximized bound");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(size);
        window.setMaximizedBounds(new Rectangle(800,600)); // set new size of the frame after enlarge
        window.add(button1);
        button1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        window.add(button2);
        button2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        window.setLayout(new FlowLayout());
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
