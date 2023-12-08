package Players_And_Groups;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Group[] groups = new Group[5];
        for (int i = 0; i < 5; i++) {
            List<Player> players = new ArrayList<Player>();
            Random rand = new Random();
            for (int j = 0; j < 6; j++) {
                players.add(new Player(Integer.toString(j)));
                players.get(j).construct(rand.nextInt(100), rand.nextInt(100));
            }
            Group group = new Group(Integer.toString(i), players);
            group.addPlayer(new Player("name"));
            System.out.println(group.toString());
            groups[i] = group;
        }
        League league = new League("test league", groups);
        System.out.println(league.getBestGroup().toString());
    }

}