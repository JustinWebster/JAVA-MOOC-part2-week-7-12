
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */
public class ListenR implements ActionListener {

    private JTextField input;
    private JTextField output;
    private JButton reset;

    public ListenR(JTextField input, JTextField output, JButton reset) {
        this.reset = reset;
        this.input = input;
        this.output = output;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.reset.setEnabled(false);
        this.output.setText("0");
        this.input.setText("");
    }
}
