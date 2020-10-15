package BasicGUI;

import java.awt.Cursor;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class GUICursor {
    public static void main(String[] args) {
        JButton button1 = new JButton("Start");
        JButton button2 = new JButton("Stop");
        JButton button3 = new JButton("Save");
        JButton button4 = new JButton("Delete");
        JButton button5 = new JButton("Open");
        JFrame window = new JFrame();
        window.setTitle("Test cursor");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400,300);
        window.setLayout(new FlowLayout());
        window.add(button1);
        window.add(button2);
        window.add(button3);
        window.add(button4);
        window.add(button5);
        button2.setEnabled(false);
        button3.setEnabled(false);
        
        //Set cursor
        button1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button2.setCursor(new Cursor(Cursor.MOVE_CURSOR));
        button3.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        button4.setCursor(new Cursor(Cursor.WAIT_CURSOR));
        button5.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
        
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
