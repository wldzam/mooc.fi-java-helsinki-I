public class Player {

    private String Name;
    private int goals;

    // constructors

    public Player(String playerName) {
        this.Name = playerName;
    }

    public Player(String playerName, int playerGoals) {
        this.Name = playerName;
        this.goals = playerGoals;
    }

    // methods

    public String getName() {
        return this.Name;
    }

    public int goals() {
        return this.goals;
    }

    public String toString() {
        return "Player: " + this.getName() + ", goals " + this.goals;
    }
}
