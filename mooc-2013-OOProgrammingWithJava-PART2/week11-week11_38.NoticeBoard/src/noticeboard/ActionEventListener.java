/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */

package noticeboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

import javax.swing.JTextField;


public class ActionEventListener implements ActionListener{
    
    private final JTextField toCopy;
    private final JLabel copyDestination;
    
    public ActionEventListener(JTextField copyThis, JLabel toHere){
        this.toCopy = copyThis;
        this.copyDestination = toHere;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.copyDestination.setText(this.toCopy.getText());
        this.toCopy.setText("");
    }

}
