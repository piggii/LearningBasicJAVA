package BasicGUI;

import javax.swing.*;

public class GUIOptionPaneConfirmDialog {
    public static void main(String[] args) {
        // Confirm Dialog from user
        int i = JOptionPane.showConfirmDialog(null,"Do you want to exit program?","Confirm exit",JOptionPane.YES_NO_OPTION);
        if(i == JOptionPane.YES_OPTION){
            System.out.print("Exit program!");
        }
    }
}
