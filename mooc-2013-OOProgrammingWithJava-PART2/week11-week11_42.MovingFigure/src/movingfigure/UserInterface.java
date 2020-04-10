package movingfigure;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;
    private Figure fig;
    private DrawingBoard db;

    public UserInterface(Figure fig) {
        this.fig = fig;
    }

    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(400, 400));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());
        addListeners();

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        db = new DrawingBoard(this.fig);
        container.add(db);

    }

    private void addListeners() {
        KeyboardListener listen = new KeyboardListener(db, fig);
        frame.addKeyListener(listen);
    }

    public JFrame getFrame() {
        return frame;
    }
}
