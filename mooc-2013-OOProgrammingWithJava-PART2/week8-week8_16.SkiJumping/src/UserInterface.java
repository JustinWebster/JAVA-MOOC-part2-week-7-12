/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class UserInterface {

    private Scanner reader;
    private ArrayList<Jumper> skiJumpers;
    private Judges panel;

    public UserInterface() {

        this.reader = new Scanner(System.in);
        this.skiJumpers = new ArrayList();
        this.panel = new Judges();
        

    }
    
    public void printResults(){
        int position = 1;
        
        
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        for(Jumper j : this.skiJumpers){
            System.out.println(position + "           " + j);
            System.out.print("             jump lengths: ");j.getAllJumps();
            position++;
            
        }
    }

    public Jumper getJumper(String name) {

        int index = 0;
        for (Jumper j : this.skiJumpers) {
            if (j.getName().equals(name)) {
                index = this.skiJumpers.indexOf(j);

            }
        }
        return this.skiJumpers.get(index);
    }

    public void startRound(){
        //starts the round of jumping, adds up the score from the judges and adds it to the jumpers judgeScore list
        //Does not consider the lowest and highest judge vote for the round
        int jumpDistance;
        
        for(Jumper j : this.skiJumpers){
            
            jumpDistance = ThreadLocalRandom.current().nextInt(60, 120+1);
            j.addJump(jumpDistance);
            System.out.println("  " + j.getName());
            System.out.println("    length: " + jumpDistance);
            System.out.print("    judge votes: ");
            this.panel.judgesJudge();
            this.panel.printScores();
            int vote = this.panel.getJudgeTotal();
            this.panel.clearVotes();
            j.addJudgeScore(vote);
            
        }
    }
    
    public void start() {

        String jumper;

        System.out.println("Kumpula ski jumping week"
                + "\n"
                + "\nWrite the names of the participants one at a time; an empty string brings you to the jumping phase.");

        /*loop for adding jumpers to the ski tournament, when break is called the program
      begins the tournament
         */
        while (true) {
            System.out.print("  Participant name: ");
            jumper = reader.nextLine();
            if (jumper.isEmpty()) {
                System.out.println();
                System.out.println("The tournament begins!");
                System.out.println();
                this.jumpPhase();
                break;
                //also runs start method for next section of program

            }
            skiJumpers.add(new Jumper(jumper));

        }

    }

    public void jumpPhase() {

        int round = 1;
        
        

        while (true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String command = reader.nextLine();
            System.out.println();
            
            if(command.equalsIgnoreCase("jump")){
            System.out.println("Round " + round);
                System.out.println();

            System.out.println("Jumping order:");
            int help = this.skiJumpers.size() - 1;
            if(this.skiJumpers.get(0).getPoints() > this.skiJumpers.get(help).getPoints()){
                Collections.reverse(this.skiJumpers);
            }
            printJumpOrder();
            
            System.out.println();
            System.out.println("Results of round " + round);
            startRound();
            round++;
            System.out.println();
            Collections.sort(skiJumpers);
            
            }else{
                System.out.println();
                System.out.println("Thanks!");
                System.out.println();
                Collections.sort(this.skiJumpers);
                printResults();
                break;
            }
            
            
        }
    }

    public void printJumpOrder() {
        int jumperNumber = 1;
        int listSize = this.skiJumpers.size() - 1;
        
            
        
        for (Jumper j : this.skiJumpers) {
            System.out.println("  " + jumperNumber + ". " + j.toString());
            jumperNumber++;
        }
    }

}
