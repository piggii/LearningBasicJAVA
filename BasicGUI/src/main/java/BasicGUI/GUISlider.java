package BasicGUI;

import java.awt.*;
import javax.swing.*;

public class GUISlider {
    public static void main(String[] args) {
        ImageIcon vol = new ImageIcon("C:\\Users\\Pictures\\volume.png");
        JLabel lb = new JLabel(vol);
        
        JSlider pm = new JSlider(JSlider.HORIZONTAL,0,100,25);
        pm.setMajorTickSpacing(25);
        pm.setMinorTickSpacing(5);
        pm.setPaintLabels(true);
        pm.setPaintTicks(true);
        
        JFrame window = new JFrame();
        window.setSize(400,300);
        window.setMaximizedBounds(new Rectangle(800,600));
        window.setTitle("Test Slider");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new FlowLayout());
        window.add(lb);
        window.add(pm);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
