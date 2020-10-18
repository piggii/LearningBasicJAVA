package BasicGUI;

import javax.swing.*;

public class GUIOptionPaneInputDialog {
    public static void main(String[] args) {
        // Get message input from user
        String name = JOptionPane.showInputDialog(null,"Enter your name","Name",JOptionPane.PLAIN_MESSAGE);
        System.out.print("Name : "+name);
    }
}
