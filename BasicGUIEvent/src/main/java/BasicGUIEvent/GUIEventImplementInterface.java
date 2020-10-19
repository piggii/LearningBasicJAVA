package BasicGUIEvent;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

// Create a program by Implement Event Listener

public class GUIEventImplementInterface implements ActionListener {
    public GUIEventImplementInterface(){
        JButton bt1 = new JButton("OK");
        JFrame window = new JFrame();
        window.setSize(500, 400);
        window.setTitle("Implement Event Program");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setLayout(new FlowLayout());
        window.add(bt1);
        bt1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        bt1.addActionListener(this);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
    public static void main(String[] args) {
        GUIEventImplementInterface obj = new GUIEventImplementInterface();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null,"Mission complete!","Status",JOptionPane.INFORMATION_MESSAGE);
    }
    
    
}
