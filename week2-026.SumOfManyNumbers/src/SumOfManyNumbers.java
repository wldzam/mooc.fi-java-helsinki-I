
import java.util.Scanner;


public class SumOfManyNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        
        while (true) {
            int read = reader.nextInt();
            if (read == 0) {
                break;
            }
            System.out.println("The sum now: " + (sum+=read));
        }
        
        System.out.println("Sum in the end: " + sum);
    }
}
