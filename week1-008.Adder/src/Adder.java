
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        System.out.println("Please enter two variables one by one: ");
        int variable1 = Integer.parseInt(reader.nextLine());
        int variable2 = Integer.parseInt(reader.nextLine());
        int sum = variable1 + variable2;
        System.out.println("Sum of the numbers: " + sum);
    }
}
