
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */
public class ListenerM implements ActionListener {

    private JTextField input;
    private JTextField output;
    private JButton reset;

    public ListenerM(JTextField input, JTextField output, JButton reset) {
        this.reset = reset;
        this.input = input;
        this.output = output;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < this.input.getText().length(); i++) {
            if (!Character.isDigit(this.input.getText().charAt(i))) {
                this.input.setText("");

            }
        }
        if (this.input.getText().equals("")) {

        } else {
            int in = Integer.parseInt(this.input.getText());
            int out = Integer.parseInt(this.output.getText());

            out -= in;
            String answer = String.valueOf(out);
            this.output.setText(answer);
            if (this.output.getText().equals("0")) {
                this.reset.setEnabled(false);
            } else {
                this.reset.setEnabled(true);
            }
            this.input.setText("");
        }
    }
}
