package BasicGUI;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class GUIDimension {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        JButton button1 = new JButton("Save");
        JButton button2 = new JButton("Cancel");
        Dimension size = new Dimension(400,300);
        window.setTitle("Test Dimension");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(size);
        window.add(button1);
        window.add(button2);
        button1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        window.setLayout(new FlowLayout());
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        
    }
}
