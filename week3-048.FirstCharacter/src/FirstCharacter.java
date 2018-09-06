import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        char firstLetter = firstCharacter(name);
        System.out.print("First character: " + firstLetter);
    }

    public static char firstCharacter(String text) {
        char first = text.charAt(0);
        return first;
    }
}
