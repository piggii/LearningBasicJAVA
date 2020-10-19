package BasicGUI;

import java.awt.*;
import javax.swing.*;

public class GUIComponentFlowLayout {
    public static void main(String[] args) {
        JButton button1 = new JButton("Open"); 
        JButton button2 = new JButton("Close");
        Cursor hc = new Cursor(Cursor.HAND_CURSOR);
        
        //FlowLayout
        FlowLayout f = new FlowLayout();
        f.setAlignment(FlowLayout.LEFT);
        f.setHgap(20);
        
        JFrame window = new JFrame();
        window.setSize(400,300);
        window.setMaximizedBounds(new Rectangle(800,600));
        window.setTitle("Test Layout");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(f);
        window.add(button1);
        button1.setCursor(hc);
        window.add(button2);
        button2.setCursor(hc);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
