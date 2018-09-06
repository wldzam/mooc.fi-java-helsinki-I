
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int result = Integer.parseInt(reader.nextLine());
        if (result >= 0 && result <= 29) {
            System.out.println("Grade: failed");
        } else if (result >= 30 && result <= 34) {
            System.out.println("Grade: 1");
        } else if (result >= 35 && result <= 39) {
            System.out.println("Grade: 2");
        } else if (result >= 40 && result <= 44) {
            System.out.println("Grade: 3");
        } else if (result >= 45 && result <= 49) {
            System.out.println("Grade: 4");
        } else if (result >= 50 && result <= 60) {
            System.out.println("Grade: 5");
        }
    }
}