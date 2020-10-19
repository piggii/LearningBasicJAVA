package BasicGUIEvent;

import java.awt.event.*;
import javax.swing.*;

public class Adapter implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Welcome", null, JOptionPane.INFORMATION_MESSAGE);
    }
    
}
