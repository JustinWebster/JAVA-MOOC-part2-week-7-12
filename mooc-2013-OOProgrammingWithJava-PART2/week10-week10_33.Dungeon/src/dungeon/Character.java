/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */
package dungeon;

import java.util.Random;

public class Character {

    private int x;
    private int y;
    private char type;
    private Random random = new Random();

    public Character(char type) {//v for vampire @ for character

        this.type = type;
        this.x = 0;
        this.y = 0;

    }
    
    public void moveX(int x){
        this.x += x;
    }
    public void moveY(int y){
        this.y += y;
    }

    public void vampiresMovement(int height, int length) {//moves vampires
        int randomNum = random.nextInt(2);
        int randomNumTwo = random.nextInt(2);
        if (this.getxCoord() + 1 >= height || this.getxCoord() - 1 < 0 || this.getyCoord() + 1 >= length || this.getyCoord() - 1 < 0) {

        }
        if (randomNum == 0) {
            if (randomNumTwo == 0) {
                if(this.getxCoord() - 1 < 0){
                    
                }else{
                this.x -= 1;
                }
            } else if (randomNumTwo == 1) {
                if(this.getxCoord() + 1 >= height){
                }else{
                this.x += 1;
                }
            }
        } else if (randomNum == 1) {
            if (randomNumTwo == 1) {
                if(this.getyCoord() - 1 < 0){
                    
                }else{
                this.y -= 1;
                }
            } else if (randomNumTwo == 0) {
                if(this.getyCoord() + 1 >= length){
                }else{
                this.y += 1;
                }
            }
        }
    }

    public void setCoords(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getxCoord() {
        return this.x;
    }

    public int getyCoord() {
        return this.y;
    }


    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.x;
        hash = 53 * hash + this.y;
        hash = 53 * hash + this.type;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Character other = (Character) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        if (this.type != other.type) {
            return false;
        }
        return true;
    }

    public String getCoords() {
        return this.x + " " + this.y;
    }

    public char getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return this.type + " " + this.getCoords();
    }
}
