package BasicGUI;

import java.awt.*;
import javax.swing.*;

public class GUIList {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        JLabel lb1 = new JLabel("Choose menu : ");
        String food[] = {"Noodle","Spicy Shrimp Soup","Fried Rice","Salad","Papaya Salad","Corn Soup"};
        JList list = new JList(food);
        list.setVisibleRowCount(1);
        
        window.setSize(400,300);
        window.setMaximizedBounds(new Rectangle(800,600));
        window.setTitle("Test List");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(lb1);
        window.add(new JScrollPane(list));
        window.setLayout(new FlowLayout());
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
