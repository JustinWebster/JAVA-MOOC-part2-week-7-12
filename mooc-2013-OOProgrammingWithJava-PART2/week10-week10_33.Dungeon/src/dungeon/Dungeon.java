/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */
package dungeon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Dungeon {

    private int length;
    private int height;
    private int vampires;
    private int moves;
    private boolean vampiresMove;
    private List<Character> chars;
    private Character player;
    private Random random;
    private Scanner reader;

    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.chars = new ArrayList();
        this.length = length;
        this.height = height;
        this.vampires = vampires;
        this.moves = moves;
        this.vampiresMove = vampiresMove;
        this.player = new Character('@');
        this.chars.add(this.player);

    }

    public void createVampires(int amount) {
        this.random = new Random();
        for (int i = 0; i < amount; i++) {

            Character c = new Character('v');
            c.setCoords(this.random.nextInt(this.height), this.random.nextInt(this.length));
            if (!this.chars.contains(c)) {
                this.chars.add(c);
            } else {
                i--;
            }
        }
    }

    public void moveVampires(String command) {

        Character player = this.chars.get(0);

        for (Character v : this.chars) {
            if (v.getType() == 'v') {

                int changeX = 0;
                int changeY = 0;

                for (int i = 0; i < command.length(); i++) {
                    Random r = new Random();
                    int rand = r.nextInt(5);

                    switch (rand) {
                        case 0:
                            break;

                        case 1: {
                            changeX += 1;
                            break;
                        }
                        case 2: {
                            changeX -= 1;
                            break;
                        }
                        case 3: {
                            changeY += 1;
                            break;
                        }
                        case 4: {
                            changeY -= 1;
                            break;
                        }

                    }

                }

                int playerX = player.getxCoord();
                int playerY = player.getyCoord();

                int proposedX = v.getxCoord() + changeX;
                int proposedY = v.getyCoord() + changeY;

                boolean isCollision;
                boolean inRange;

                inRange = (proposedX < this.length && proposedX >= 0 && proposedY < this.height && proposedY >= 0);
                isCollision = (playerX == proposedX && playerY == proposedY);

                if (inRange && !isCollision) {
                    v.moveX(changeX);
                    v.moveY(changeY);

                }

            }
        }
    }

    public void printGameBoard() {//prints the game board
        int h = 0;
        while (h < this.height) {

            for (int length = 0; length <= this.length; length++) {//calculates whether to print the player "@"/ Could encapsulate
                if (h == this.player.getyCoord() && length == this.player.getxCoord()) {
                    System.out.print(this.player.getType());

                } else {
                    for (Character chara : this.chars) {//calculates whether or not to print a vampire "v"/ could encapsulate
                        if (chara.getType() == 'v') {
                            if (h == chara.getyCoord() && length == chara.getxCoord()) {
                                System.out.print("v");
                                length++;
                                if (h == this.player.getyCoord() && length == this.player.getxCoord()) {
                                    System.out.print(this.player.getType());
                                    length++;
                                }

                            }
                        }
                    }
                    if (length < this.length) {
                        System.out.print(".");
                    }
                }
            }
            System.out.println("");

            h++;
        }
    }

    public int getMoves() {
        return this.moves;
    }

    public String getCharInfo() {//prints character coords and vampire coords
        String charInfo = "";
        for (Character c : this.chars) {
            charInfo += c.toString() + "\n";
        }
        return charInfo;
    }

    public int countOccurence(String lookIn, char lookFor) {//counts the occurence of a character within a string
        int count = 0;
        for (int i = 0; i < lookIn.length(); i++) {
            if (lookIn.charAt(i) == lookFor) {
                count++;
            }
        }
        return count;
    }

    public void run() {
        reader = new Scanner(System.in);
        String command = "";
        createVampires(this.vampires);
        while (!command.equals("quit")) {

            if (this.moves == 0 && this.chars.size() > 1) {
                System.out.println("YOU LOSE");
                break;
            }

            System.out.println(this.moves);
            System.out.println("");
            System.out.println(getCharInfo());
            printGameBoard();
            command = reader.nextLine();
            if (command.equals("quit")) {
                break;
            }

            Character p = this.chars.get(0);

            int yCord = p.getyCoord();
            int xCord = p.getxCoord();

            for (char charMove : command.toCharArray()) {
                switch (charMove) {
                    case 'a': {
                        if (xCord > 0) {
                            p.moveX(-1);

                        }
                        break;
                    }

                    case 'd': {
                        if (xCord < this.length - 1) {
                            p.moveX(1);

                        }
                        break;
                    }

                    case 'w': {
                        if (yCord > 0) {
                            p.moveY(-1);
                        }
                        break;
                    }

                    case 's': {
                        if (yCord < this.height-1) {
                            p.moveY(1);
                        }
                        break;
                    }
                }

                yCord = p.getyCoord();
                xCord = p.getxCoord();
            }

            this.moves--;

            for (Character v : this.chars) {

                if (this.player.getCoords().equals(v.getCoords())) {
                    if (v.getType() == 'v') {
                        this.chars.remove(v);
                        break;
                    }
                }
            }

            if (this.vampiresMove) {
                moveVampires(command);
            }

            if (this.chars.size() == 1) {
                System.out.println(getCharInfo());
                printGameBoard();
                System.out.println("YOU WIN");
                break;
            }

        }
    }

}
