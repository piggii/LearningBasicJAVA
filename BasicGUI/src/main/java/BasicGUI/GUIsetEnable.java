package BasicGUI;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
        
public class GUIsetEnable {
    public static void main(String[] args) {
        JButton button1 = new JButton("Start");
        JButton button2 = new JButton("Stop");
        JFrame window = new JFrame();
        window.setLayout(new FlowLayout());
        window.setTitle("Test setEnable");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(button1);
        window.add(button2);
        button2.setEnabled(false);
        window.setSize(400,200);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
