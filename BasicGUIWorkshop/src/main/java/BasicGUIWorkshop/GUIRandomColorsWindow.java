package BasicGUIWorkshop;

import java.awt.*;
import javax.swing.*;

public class GUIRandomColorsWindow {
    public GUIRandomColorsWindow() {
        JFrame window = new JFrame();
        window.setTitle("Random Colors");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 300);
        window.setResizable(false);
        Container pane = window.getContentPane();
        window.setLayout(new GridLayout(5,5));
        for (int x = 1; x <= 25; x++) {
            GUIRandomColors panel = new GUIRandomColors();
            pane.add(panel);
        }
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
    public static void main(String[] args) {
       new GUIRandomColorsWindow();
    }
}
