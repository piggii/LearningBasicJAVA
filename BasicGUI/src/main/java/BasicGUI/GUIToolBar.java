package BasicGUI;

import java.awt.*;
import javax.swing.*;

public class GUIToolBar {
    public static void main(String[] args) {
        JButton b1,b2,b3;
        JToggleButton b4,b5;
        
        // Toolbar
        JToolBar tb = new JToolBar();
        tb.setOrientation(SwingConstants.HORIZONTAL);
        tb.setName("Toolbar");
        
        // Choose image to be used
        ImageIcon open = new ImageIcon("C:\\Users\\Pictures\\folder.png");
        ImageIcon save = new ImageIcon("C:\\Users\\Pictures\\save-file.png");
        ImageIcon delete = new ImageIcon("C:\\Users\\Pictures\\delete.png");
        ImageIcon cut = new ImageIcon("C:\\Users\\Pictures\\cutting.png");
        ImageIcon copy = new ImageIcon("C:\\Users\\Pictures\\copy.png");
        
        // Add image to button
        b1 = new JButton(open);
        b1.setToolTipText("Open");
        b2 = new JButton(cut);
        b2.setToolTipText("Cut");
        b3 = new JButton(copy);
        b3.setToolTipText("Copy");
        b4 = new JToggleButton(save);
        b4.setToolTipText("Save");
        b5 = new JToggleButton(delete);
        b5.setToolTipText("Delete");
        
        // Add button to the toolbar
        tb.add(b1);
        tb.add(b2);
        tb.add(b3);
        tb.add(b4);
        tb.add(b5);
        
        // Manage all frame
        JFrame window = new JFrame();
        window.setSize(400,300);
        window.setMaximizedBounds(new Rectangle(800,600));
        window.setTitle("Test ToolBar");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(tb);
        window.setLayout(new FlowLayout());
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
