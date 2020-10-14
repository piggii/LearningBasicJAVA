package BasicGUI;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIButton {
    public static void main(String[] args) {
        JButton button1 = new JButton("OK");
        JButton button2 = new JButton("Cancel");
        JFrame window = new JFrame();
        window.setLayout(new FlowLayout());
        window.add(button1);
        window.add(button2);
        window.setTitle("Test button");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500,400);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}




