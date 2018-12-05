
import sun.rmi.server.InactiveGroupException;

import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Type your program here:
        System.out.print("Type a number: ");
        int inputInteger = Integer.parseInt(reader.nextLine());

        if (inputInteger <= 0) {
            System.out.println("The number is not positive.");
        } else {
            System.out.println("The number is positive.");
        }
    }
}
