
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read form user in this variable

        // Write your program here
        // Use only variables sum and read

        System.out.print("Write the first number: ");
        read = reader.nextInt();
        sum += read;
        System.out.print("Write the second number: ");
        read = reader.nextInt();
        sum += read;
        System.out.print("Write the third number: ");
        read = reader.nextInt();
        sum += read;
        System.out.println("The sum is: " + sum);


    }
}
