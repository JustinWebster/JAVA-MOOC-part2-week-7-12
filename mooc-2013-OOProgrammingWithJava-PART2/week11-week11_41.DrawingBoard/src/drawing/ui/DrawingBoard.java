package drawing.ui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingBoard extends JPanel {

    public DrawingBoard() {
        super.setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.setColor(Color.black);
        graphics.fillRect(95,50,50,50);
        graphics.fillRect(250, 50, 50, 50);
        graphics.fillRect(60, 200, 50, 50);
        graphics.fillRect(290, 200, 50, 50);
        graphics.fillRect(110, 250, 180, 50);
    }
}
