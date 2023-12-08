package Players_And_Groups;

import java.util.Random;
public class Player {
    private int shots;
    private int score;
    private String name;

    public Player(String name){
        this.name = name;
        this.score = 0;
        this.shots = 0;
    }

    public void construct(int numberOfShots, double scoreP){
        setShots(numberOfShots);
        scoreP /= 100;
        setScore((int) (scoreP*numberOfShots));
    }

    public double calculatePercentage(){
        return ((double) getScore() / getShots()) * 100;
    }
    public static int[] toArray(Player[] players){
        int[] returnArray = new int[players.length];
        for (int i = 0; i < players.length; i++) {
            returnArray[i] = players[i].getScore();
        }
        return returnArray;
    }

    public String toString(){

        return "Shots: " + Integer.toString(getShots()) + " Score: " + Integer.toString(getScore()) + " Name: " + getName();
    }
    public void throwBall(){
        Random rand = new Random();
        if (rand.nextBoolean()){
            setScore(getScore()+1);
        }
        setShots(getShots()+1);
        return;
    }
    public int getShots() {
        return shots;
    }

    public void setShots(int shots) {
        this.shots = shots;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
