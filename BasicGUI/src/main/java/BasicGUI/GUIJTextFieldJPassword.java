package BasicGUI;

import java.awt.*;
import javax.swing.*;

public class GUIJTextFieldJPassword {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        
        JLabel lb1 = new JLabel("User : ");
        JLabel lb2 = new JLabel("Password : ");
        JTextField text = new JTextField("User 1",10);
        JPasswordField pass = new JPasswordField(10);
        text.setEditable(false);
        
        window.setSize(400,300);
        window.setMaximizedBounds(new Rectangle(800,600));
        window.setTitle("Test JTextField");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(lb1);
        window.add(text);
        window.add(lb2);
        window.add(pass);
        window.setLayout(new FlowLayout());
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
