
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int result = 1;
        int counter = 1;
        while (counter <= number){
            result += (int)Math.pow(2, counter);
            counter++;
        }
        System.out.print("The result is: " + result);
    }
}
