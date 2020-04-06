package clicker.ui;

import clicker.applicationlogic.PersonalCalculator;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class UserInterface implements Runnable {
    private JFrame frame;
    private PersonalCalculator calculate;
    
    public UserInterface(PersonalCalculator c){
        
        this.calculate = c;
    }
    public UserInterface(){
        
    }

    @Override
    public void run() {//creates the JFrame
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {//creates components and adds to JFrame
        GridLayout layout = new GridLayout(2, 0);
        container.setLayout(layout);
        JLabel timesClicked = new JLabel(this.calculate.toString());
        JButton click = new JButton("Click!");
        ClickListener listen = new ClickListener(this.calculate, timesClicked);
        click.addActionListener(listen);
        container.add(timesClicked);
        container.add(click);
    }

    public JFrame getFrame() {
        return frame;
    }
}
