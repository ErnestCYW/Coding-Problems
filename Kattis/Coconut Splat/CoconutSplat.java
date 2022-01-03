import java.util.*;

public class CoconutSplat {

    public static void main(String[] args) {

        //Setting up game
        Kattio io = new Kattio(System.in,System.out);
        int syllabus = io.getInt();
        int numPlayers = io.getInt();
        List<Player> players = new ArrayList<>();
        for (int p = 1; p <= numPlayers; p++) {
            players.add(new Player(p,2));
        }

        //Main logic
        int next = 0;
        while (players.size() > 1) {
            next = (next + syllabus - 1) % players.size();
            int currState = players.get(next).state;
            int currNumber = players.get(next).number;
            if (currState == 2) {
                players.set(next,new Player(currNumber,currState-1));
                players.add(next,new Player(currNumber,currState-1));
            } else if (currState == 1) {
                players.set(next,new Player(currNumber,currState-1));
                next++;
            } else {
                players.remove(next);
            }
        }

        //Printing Winner
        System.out.println(players.get(0).number);

        
    }

}