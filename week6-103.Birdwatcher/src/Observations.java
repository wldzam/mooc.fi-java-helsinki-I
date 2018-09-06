import java.util.ArrayList;
import java.util.Scanner;

public class Observations {

    private ArrayList<Bird> birds;

    public Observations() {
        this.birds = new ArrayList<Bird>();
    }

    // Adds a bird

    public void addBird(Scanner reader) {

        System.out.print("Name: ");
        String name = reader.nextLine();

        System.out.print("Latin Name: ");
        String latinName = reader.nextLine();


        birds.add(new Bird(name, latinName));

    }


    // Bird spotted

    public void observation(Scanner reader) {

        System.out.print("What was observed?: ");
        String birdObserved = reader.nextLine();

        for (Bird observedBird:birds) {
            if (observedBird.getBirdName().equals(birdObserved)) {
                observedBird.birdSpotted();
            }
        }

    }

    // Shows all birds statistics

    public void statistics() {
        for (Bird eachBird:birds) {
            System.out.println(eachBird);
        }
    }

    //Shows stats for a particular bird

    public void showBird(Scanner reader) {
        System.out.print("What: ");
        String searchedBirdName = reader.nextLine();
        for (Bird searchedBird:birds) {
            if (searchedBird.getBirdName().equals(searchedBirdName)) {
                System.out.println(searchedBird);
            } else {
                System.out.println("Not a bird!");
            }
        }
    }

}
