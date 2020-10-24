package BasicGUIWorkshop;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class GUIRandomColors extends JPanel {
    
    public GUIRandomColors() {
        setBackground(randomColors());
        addMouseListener(new event());
    }
    
    class event implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            setBackground(randomColors());
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
    
    public Color randomColors() {
        int red =  new Random().nextInt(256);
        int blue = new Random().nextInt(256);
        int green = new Random().nextInt(256);
        return new Color(red,blue,green);
    }
}
