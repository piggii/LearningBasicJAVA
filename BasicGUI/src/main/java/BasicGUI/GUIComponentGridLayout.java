package BasicGUI;

import java.awt.*;
import javax.swing.*;

public class GUIComponentGridLayout {
    public static void main(String[] args) {
        JButton button1 = new JButton("Open"); 
        JButton button2 = new JButton("Close");
        JButton button3 = new JButton("Copy"); 
        JButton button4 = new JButton("Paste");
        JButton button5 = new JButton("Save"); 
        JButton button6 = new JButton("Delete");
        Cursor hc = new Cursor(Cursor.HAND_CURSOR);
        
        //GridLayout
        GridLayout grid = new GridLayout(3,2,10,10);

        JFrame window = new JFrame();
        window.setSize(400,300);
        window.setMaximizedBounds(new Rectangle(800,600));
        window.setTitle("Test Layout");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(grid);
        window.add(button1);
        button1.setCursor(hc);
        window.add(button2);
        button2.setCursor(hc);
        window.add(button3);
        button3.setCursor(hc);
        window.add(button4);
        button4.setCursor(hc);
        window.add(button5);
        button5.setCursor(hc);
        window.add(button6);
        button6.setCursor(hc);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
