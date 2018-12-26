import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers:");

        int numbers = Integer.parseInt(reader.nextLine());
        int sum, counter, evenCounter, oddCounter;
        sum = counter = evenCounter = oddCounter = 0;
        double average;

        while (numbers > 0) {
            sum += numbers;
            counter++;
            if (numbers % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }
            System.out.println(numbers);
            numbers = Integer.parseInt(reader.nextLine());
        }

        average = (double)sum/counter;

        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + counter);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + evenCounter);
        System.out.println("Odd numbers: " + oddCounter);
    }
}
