package BasicGUI;

import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUILabel {
    public static void main(String[] args) {
        JLabel lb1 = new JLabel();
        JLabel lb2 = new JLabel();
        lb1.setText("Hello");
        ImageIcon icon = new ImageIcon("C:\\Users\\Piggii\\Pictures\\hello.png");
        lb2.setIcon(icon);
        JFrame window = new JFrame("Test label");
        window.add(lb1);
        window.add(lb2);
        window.setLayout(new FlowLayout());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(800,600);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
