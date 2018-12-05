
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        // Write your code here

        String theSecretMessage = ("supersecret");

        while (true) {

            System.out.print("Type password: ");
            String providedPassword = reader.nextLine();

            if (!providedPassword.equals(password)) {
                System.out.println("Wrong!");
            } else {
                break;
            }
        }

        System.out.println("Right!");
        System.out.println("The secret message is: " + theSecretMessage);
    }
}
