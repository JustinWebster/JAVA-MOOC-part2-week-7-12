package noticeboard;



import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame();//creates new JFrame
        frame.setPreferredSize(new Dimension(400,200));//Sets window dimensions in pixels
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//sets 'x' button function
        createComponents(frame.getContentPane());//creates components and adds them to the container
        frame.pack();
        frame.setVisible(true);
        
    }

    private void createComponents(Container container) {//creates components and adds them to the container
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        JTextField textTop = new JTextField("I was copied here from the JTextArea.");
        JButton copyButton = new JButton("Copy!");
        JLabel textBottom = new JLabel();
        ActionEventListener copierB = new ActionEventListener(textTop, textBottom);
        copyButton.addActionListener(copierB);
        container.add(textTop);
        container.add(copyButton);
        container.add(textBottom);
        
    }
}
