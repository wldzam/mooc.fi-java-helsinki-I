import java.util.ArrayList;

public class Team {

    // parameters

    private String Name;
    private  ArrayList<Player> members;
    private int maxSize;



    // methods

    public Team(String teamName) {
        this.Name = teamName;
        this.members = new ArrayList<Player>();
        this.maxSize = 16;
    }

    public String getName() {
        return this.Name;
    }

    // add a player to the team

    public void addPlayer(Player playerName) {
        if (this.members.size() < this.maxSize) {
            this.members.add(playerName);
        } else {

        }
    }

    // print all the players of the team

    public void printPlayers() {
        for (Player player : members) {
            System.out.println(player);
        }
    }

    // max players in the team

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return this.members.size();
    }

    // return team goals

    public int goals() {
        int totalGoals = 0;
        for (Player player : members) {
            totalGoals += player.goals();
        }
        return totalGoals;
    }

    @Override
    public String toString() {
        return "Team: " + Name;
    }
}
