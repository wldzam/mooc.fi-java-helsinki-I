
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        int counter = 1;
        System.out.print("Up to what number? ");
        int inputCounter = Integer.parseInt(reader.nextLine());
        while (counter <= inputCounter) {
            System.out.println(counter);
            counter++;
        }
    }
}