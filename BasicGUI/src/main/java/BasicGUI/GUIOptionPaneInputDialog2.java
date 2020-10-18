package BasicGUI;

import javax.swing.*;

public class GUIOptionPaneInputDialog2 {
    public static void main(String[] args) {
        String[] drinks = {"Coffee","Milk","Tea","Soda","Water","Cocktail"} ;
        ImageIcon icon1 = new ImageIcon("C:\\Users\\Pictures\\drink.png");
        Object select = JOptionPane.showInputDialog(null,"Choose a drink that you want","Drinks",
                JOptionPane.PLAIN_MESSAGE,icon1,drinks,"Milk");
        System.out.print("Your drink is : "+select);
    }
}
