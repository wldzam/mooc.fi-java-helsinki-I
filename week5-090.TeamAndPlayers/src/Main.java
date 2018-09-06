public class Main {
    public static void main(String[] args) {
        // test your code here

        // Team barcelona = new Team("FC Barcelona");
        // System.out.println("Team: " + barcelona.getName());

        Team fcBarcelona = new Team("FC Barcelona");
        Player secondPlayer = new Player("Malek Orkstra", 24);
        Player pekkaOfCource = new Player("Pekka Mykola", 20);


        System.out.println(fcBarcelona);
        System.out.println(pekkaOfCource);

        fcBarcelona.addPlayer(pekkaOfCource);
        fcBarcelona.addPlayer(secondPlayer);

        // print all the players

        System.out.println("\nAll the players of the " + fcBarcelona.getName() + " team:");
        fcBarcelona.printPlayers();


    }
}
