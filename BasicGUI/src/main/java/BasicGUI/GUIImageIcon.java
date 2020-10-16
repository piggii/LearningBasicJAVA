package BasicGUI;

import java.awt.*;
import javax.swing.*;

public class GUIImageIcon {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        ImageIcon work = new ImageIcon("C:\\Users\\Pictures\\Work.png");
        ImageIcon play = new ImageIcon("C:\\Users\\Pictures\\Play.png");
        ImageIcon coffee = new ImageIcon("C:\\Users\\Pictures\\Coffee.png");
        ImageIcon sleep = new ImageIcon("C:\\Users\\Pictures\\Sleep.png");
        JButton button1 = new JButton("Working Time");
        JButton button2 = new JButton("Play Time");
        JButton button3 = new JButton("Coffee Time");
        JButton button4 = new JButton("Sleeping Time");
        button1.setIcon(work);
        button2.setIcon(play);
        button3.setIcon(coffee);
        button4.setIcon(sleep);
        window.setSize(600, 300);
        window.setMaximizedBounds(new Rectangle(1000,500));
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Test ImageIcon");
        window.add(button1);
        button1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        window.add(button2);
        button2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        window.add(button3);
        button3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        window.add(button4);
        button4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        window.setLayout(new FlowLayout());
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}