/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */

package movingfigure;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class KeyboardListener implements KeyListener{
    
    private Component c;
    private Figure f;
    
    public KeyboardListener(Component c, Figure f){
        this.f = f;
        this.c = c;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {//checks which key was pressed and moves the figure accordingly
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            this.f.move(-1, 0);
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            this.f.move(1, 0);
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            this.f.move(0, 1);
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            this.f.move(0, -1);
        }
        c.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

}
