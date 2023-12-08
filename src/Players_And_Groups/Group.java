package Players_And_Groups;

import java.util.*;

public class Group {
    private List<Player> players;
    private String name;
    public Group(String name, List<Player> players){
        this.name = name;
        this.players = players;
    }


    public void removePlayer(String name){
        List<Player> newArray = getPlayers();
        newArray.remove(new Player(name));
        setPlayers(newArray);
    }
    public void addPlayer(Player player){
        List<Player> newArray = getPlayers();
        newArray.add(player);
        setPlayers(newArray);
    }
    public String toString(){
        StringBuilder out = new StringBuilder();
        for (Player player: getPlayers()){
            out.append(player.toString()).append("\n");
        }
        return getName() + "\n" + out.toString();
    }


    public List<Player> getTop(int number){
        if(getPlayers().size() <= number){return getPlayers();}
        List<Player> returnArray = new ArrayList<>();

        List<Player> players1 = getPlayers();
        for (int j = 0; j < number; j++) {
            Player last = players1.get(0);
            for (Player player: players1) {
                if(player.getScore() > last.getScore()){
                    last = player;
                }
            }
            returnArray.add(last);
            players1.remove(last);
        }
        return returnArray;
    }
    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean compare(Group other){
        int group1Score = 0;
        int group2Score = 0;
        List<Player> thisTop5 = getTop(5);
        List<Player> otherTop5 = other.getTop(5);
        for (int i = 0; i < 5; i++) {
            if (thisTop5.get(i).getScore() >= otherTop5.get(i).getScore()){
                group1Score++;
            }else {
                group2Score++;
            }
        }
        return group1Score >= group2Score;
    }
}
