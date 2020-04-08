
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {

    private JFrame frame;
    private JTextField answer;
    private JTextField userIn;
    private JButton plus;
    private JButton minus;
    private JButton reset;

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400, 200));
        createComponents(frame);
        frame.pack();
        frame.setVisible(true);

    }

    public boolean isZero() {

        return this.answer.getText().equals("0");
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        frame.setLayout(layout);
        this.answer = new JTextField("0");

        this.answer.setEnabled(false);
        container.add(this.answer);
        this.userIn = new JTextField("");
        container.add(userIn);
        JPanel buttons = new JPanel(new GridLayout(1, 3));
        this.plus = new JButton("+");
        this.minus = new JButton("-");
        this.reset = new JButton("z");
        buttons.add(plus);
        buttons.add(minus);
        buttons.add(reset);
        container.add(buttons);

        ListenerP plusListen = new ListenerP(userIn, answer, reset);
        plus.addActionListener(plusListen);
        ListenerM minusListen = new ListenerM(userIn, answer, reset);
        minus.addActionListener(minusListen);
        ListenR resetListen = new ListenR(userIn, answer, reset);
        reset.addActionListener(resetListen);
        if (this.answer.getText().equals("0")) {
            this.reset.setEnabled(false);
        }
    }

    public JFrame getFrame() {
        return frame;
    }
}
