package BasicGUIEvent;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

// Create a program by Anonymous Inner Class

public class GUIEventAnonymousInnerClass {
     public GUIEventAnonymousInnerClass(){
        JButton bt1 = new JButton("OK");
        JButton bt2 = new JButton("Cancel");
        JFrame window = new JFrame();
        window.setSize(500, 400);
        window.setTitle("Anonymous Inner Class Program");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setLayout(new FlowLayout());
        window.add(bt1);
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Anonymous inner class", 
                        null, JOptionPane.INFORMATION_MESSAGE);
            }
        });
        bt1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        window.add(bt2);
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = JOptionPane.showConfirmDialog(null, "Do you want to exit program",
                        "Confirm", JOptionPane.YES_NO_OPTION);
                if(i == JOptionPane.YES_OPTION){
                    System.out.println("Exit program!");
                }
            }
        });
        bt2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
    public static void main(String[] args) {
        GUIEventAnonymousInnerClass obj = new GUIEventAnonymousInnerClass();
    }
}
