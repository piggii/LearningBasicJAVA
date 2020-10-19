package BasicGUIEvent;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class GUIEventAdapterClass {
    public GUIEventAdapterClass(){
        Adapter at = new Adapter();
        JButton bt1 = new JButton("OK");
        JFrame window = new JFrame();
        window.setLayout(new FlowLayout());
        window.setSize(500, 400);
        window.setTitle("Event Adapter Class");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.add(bt1);
        bt1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        bt1.addActionListener(at);
        window.setVisible(true);
    }
    public static void main(String[] args) {
        GUIEventAdapterClass obj = new GUIEventAdapterClass();
    }
}
