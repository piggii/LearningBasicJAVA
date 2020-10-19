package BasicGUI;

import java.awt.*;
import javax.swing.*;

public class GUIComponentBorderLayout {
    public static void main(String[] args) {
        JButton button1 = new JButton("North"); 
        JButton button2 = new JButton("South");
        JButton button3 = new JButton("East"); 
        JButton button4 = new JButton("West");
        JButton button5 = new JButton("Center");
        Cursor hc = new Cursor(Cursor.HAND_CURSOR);
        
        //BorderLayout
        BorderLayout layout = new BorderLayout(10,10);

        JFrame window = new JFrame();
        window.setSize(400,300);
        window.setMaximizedBounds(new Rectangle(800,600));
        window.setTitle("Test Layout");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(layout);
        window.add(button1,BorderLayout.NORTH);
        button1.setCursor(hc);
        window.add(button2,BorderLayout.SOUTH);
        button2.setCursor(hc);
        window.add(button3,BorderLayout.EAST);
        button3.setCursor(hc);
        window.add(button4,BorderLayout.WEST);
        button4.setCursor(hc);
        window.add(button5,BorderLayout.CENTER);
        button5.setCursor(hc);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
