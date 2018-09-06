
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // call your method from here
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int lenght = calculateCharacters(name);
        System.out.print("Number of characters: " + lenght);

    }
    
    // do here the method
    // public static int calculateCharacters(String text)

    public static int calculateCharacters(String text) {
        int length = text.length();
        return length;
    }
    
}
