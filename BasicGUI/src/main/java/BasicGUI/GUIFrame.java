package BasicGUI;

import javax.swing.JFrame;

public class GUIFrame {
    public static void main(String[] args) {
        JFrame window = new JFrame("HOME");
        window.setSize(400,300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
