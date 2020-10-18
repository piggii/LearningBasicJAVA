package BasicGUI;

import java.awt.*;
import javax.swing.*;

public class GUIComboBox {
    public static void main(String[] args) {
        String[] fruit = {"Apple","Banana","Blueberry","Cherry","Grape"};
        JComboBox combo1 = new JComboBox(fruit);
        combo1.setEditable(true);
        combo1.setSelectedItem("Grape");
        String[] drinks ={"Coffee","Milk","Tea","Soda","Water","Cocktail"};
        JComboBox combo2 = new JComboBox(drinks);
        
        JFrame window = new JFrame();
        window.setSize(400,300);
        window.setMaximizedBounds(new Rectangle(800,600));
        window.setTitle("Test ComboBox");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(combo1);
        window.add(combo2);
        window.setLayout(new FlowLayout());
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
