package BasicGUI;

import java.awt.*;
import javax.swing.*;

public class GUIToolTip {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        Dimension size = new Dimension(400,300);
        ImageIcon open = new ImageIcon("C:\\Users\\Pictures\\folder.png");
        ImageIcon save = new ImageIcon("C:\\Users\\Pictures\\save-file.png");
        ImageIcon delete = new ImageIcon("C:\\Users\\Pictures\\delete.png");
        
        JButton button1 = new JButton(open);
        button1.setToolTipText("Open file");
        JButton button2 = new JButton(save);
        button2.setToolTipText("Save file");
        JButton button3 = new JButton(delete);
        button3.setToolTipText("Delete");
        
        window.setTitle("Test ToolTip");
        window.setSize(size);
        window.setMaximizedBounds(new Rectangle(800,600));
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(button1);
        button1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        window.add(button2);
        button2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        window.add(button3);
        button3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        window.setLayout(new FlowLayout());
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
