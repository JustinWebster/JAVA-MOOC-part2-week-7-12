/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */

package movingfigure;

import java.awt.Graphics;
import java.util.ArrayList;


public class CompoundFigure extends Figure{
    private ArrayList<Figure> compoundFig;
   
    public CompoundFigure(){
        super(1,1);
        compoundFig = new ArrayList();
    }
    
    public void add(Figure f){//adds a figure to the list of figures to create a single figure
        compoundFig.add(f);
    }
    
    @Override
    public void move(int x, int y){//asks each figure to move itself
        for(Figure f : compoundFig){
            f.move(x, y);
        }
    }
    
    @Override
    public void draw(Graphics graphics) {//asks each figure to draw itself
        for(Figure f : compoundFig){
            f.draw(graphics);
        }
    }

}
