package BasicGUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIPopUpMenu {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        
        JPopupMenu pm = new JPopupMenu();
        JMenuItem i1,i2,i3,i4,i5;
        
        //Manage submenu
        i1 = new JMenuItem("Save");
        i2 = new JMenuItem("Copy");
        i3 = new JMenuItem("Paste");
        i4 = new JMenuItem("Cut");
        i5 = new JMenuItem("Delete");
        
        //Add submenu into a popup menu
        pm.add(i1);
        pm.add(i2);
        pm.add(i3);
        pm.add(i4);
        pm.add(i5);
        
        window.setSize(400,300);
        window.setMaximizedBounds(new Rectangle(800,600));
        window.setTitle("Test PopUpMenu");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(pm);
        
        //Manage Event
        window.addMouseListener(new MouseAdapter(){
            public void mouseReleased(MouseEvent e){
                if(e.isPopupTrigger()){
                    pm.show(e.getComponent(),e.getX(),e.getY());
                }
            }
        });
        
        window.setLayout(new FlowLayout());
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
