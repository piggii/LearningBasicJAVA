package BasicGUI;

import javax.swing.*;

public class GUIOptionPaneMessageDialog {
    public static void main(String[] args) {
        //Show message to user
        ImageIcon icon = new ImageIcon("C:\\Users\\Pictures\\warning.png");
        String text = "Don't forget to save file";
        JOptionPane.showMessageDialog(null,text,"Warning",JOptionPane.WARNING_MESSAGE,icon);
    }
}
