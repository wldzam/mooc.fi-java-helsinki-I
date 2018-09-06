import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter

        Scanner reader = new Scanner(System.in);
        Observations birdwatcher = new Observations();

        String decision = "";

        while (!decision.equals("quit")) {

            System.out.print("? ");
            decision = reader.nextLine().toLowerCase();

            if (decision.equals("add")) {
                birdwatcher.addBird(reader);
            } else if (decision.equals("observation")) {
                birdwatcher.observation(reader);
            } else if (decision.equals("statistics")) {
                birdwatcher.statistics();
            } else if (decision.equals("show")) {
                birdwatcher.showBird(reader);
            } else if (decision.equals("quit")) {
                break;
            } else {
                System.out.println("Sorry, try again.");
            }

        }

            
    }

}
