/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */
package game;

import gameoflife.GameOfLifeBoard;
import java.util.Random;

public class PersonalBoard extends GameOfLifeBoard {

    private Random coordGen;

    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    @Override
    public void initiateRandomCells(double probability) {

        if (probability == 0.0) {

            for (int x = 0; x < super.getWidth(); x++) {
                for (int y = 0; y < super.getHeight(); y++) {
                    turnToDead(x, y);
                }
            }
        }
        coordGen = new Random();

        if (probability == 1.0) {
            for (int x = 0; x < super.getWidth(); x++) {
                for (int y = 0; y < super.getHeight(); y++) {
                    turnToLiving(x, y);
                }
            }
        }
        if(probability > 0.0 && probability < 1.0){
        for (int x = 0; x < super.getWidth(); x++) {
            for (int y = 0; y < super.getHeight(); y++) {
                double prob = coordGen.nextDouble();

                
                    if (prob <= probability) {
                        turnToLiving(x, y);
                    }
                    if (prob > probability) {
                        turnToDead(x, y);
                    }
                

            }
        }
        }
        /* if (probability > 0.0 && probability < 1.0) {
            double cellsToLive = probability * (super.getWidth() * super.getHeight());//needed to see how many cells should live
            int i = 0;
            while (i <= Math.abs(cellsToLive)) {
                coordGen = new Random();
                int x = coordGen.nextInt(super.getWidth());
                int y = coordGen.nextInt(super.getHeight());
                super.getBoard()[x][y] = true;
                i++;

            }
        }*/
    }

    @Override
    public boolean isAlive(int x, int y) {
        if (x < super.getWidth() && y < super.getHeight()) {
            if (x >= 0 && y >= 0) {
                return super.getBoard()[x][y];
            }
        }
        return false;
    }

    @Override
    public void turnToLiving(int x, int y) {
        if (x <= super.getWidth() && y <= super.getHeight()) {
            if (x >= 0 && y >= 0) {
                super.getBoard()[x][y] = true;
            }
        }
    }

    @Override
    public void turnToDead(int x, int y) {
        if (x <= super.getWidth() && y <= super.getHeight()) {
            if (x >= 0 && y >= 0) {
                super.getBoard()[x][y] = false;
            }
        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int cx, int cy) {
        int numberOfLivingNeighbours = 0;
        for (int y = 0; y < super.getHeight(); y++) {
            for (int x = 0; x < super.getWidth(); x++) {
                if (x == (cx - 1) && y == cy || x == (cx + 1) && y == cy) {
                    if (isAlive(x, y)) {

                        numberOfLivingNeighbours++;

                    }
                }
                if (y == (cy - 1) && x == cx || y == (cy + 1) && x == cx) {
                    if (isAlive(x, y)) {
                        numberOfLivingNeighbours++;
                    }
                }
                if (x == (cx + 1) && y == (cy + 1) || y == (cy - 1) && x == (cx - 1)) {

                    if (x == cx && y == cy) {

                    } else {

                        if (isAlive(x, y)) {
                            numberOfLivingNeighbours++;
                        }
                    }
                }
                if (x == (cx + 1) && y == (cy - 1) || x == (cx - 1) && y == (cy + 1)) {
                    if (isAlive(x, y)) {
                        numberOfLivingNeighbours++;
                    }
                }

            }
        }
        return numberOfLivingNeighbours;
    }

    @Override
    public void manageCell(int x, int y, int livingNeighbours) {

        if (isAlive(x, y)) {

            if (livingNeighbours < 2) {
                turnToDead(x, y);
            }
            if (livingNeighbours > 3) {
                turnToDead(x, y);
            }
        }
        if (!isAlive(x, y)) {
            if (livingNeighbours == 3) {
                turnToLiving(x, y);
            }
        }

    }

}
