import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstInt = Integer.parseInt(reader.nextLine());
        System.out.println("Enter the second number: ");
        int secondInt = Integer.parseInt(reader.nextLine());
        if (firstInt > secondInt) {
            System.out.println("Greater number: " + firstInt);
        } else if (firstInt < secondInt) {
            System.out.println("Greater number: " + secondInt);
            } else if (firstInt == secondInt) {
            System.out.println("The numbers are equal!");
        }
    }
}
