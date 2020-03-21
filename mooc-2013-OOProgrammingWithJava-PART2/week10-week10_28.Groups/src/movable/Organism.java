/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */
package movable;

public class Organism implements Movable {

    private int xPos;
    private int yPos;

    public Organism(int x, int y) {//creates an organism with specific co-ordinates
        this.xPos = x;
        this.yPos = y;
    }

    @Override
    public void move(int dx, int dy) {//"moves" the organism by the specified amount along the x&y axis
        this.xPos += dx;
        this.yPos += dy;
    }

    @Override
    public String toString() {
        return "x: " + this.xPos + "; y: " + this.yPos;
    }

}
