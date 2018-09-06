import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class ExamBook {

    // Creating a new ArrayList for storing all the grades

    private ArrayList<Integer> grades = new ArrayList<Integer>();

    private int[] gradeAmount = new int[6];

    private double acceptedAll;


    // Method for adding new grades to the ArrayList

    public void addGrade(Scanner scanner) {
        System.out.println("Type exam scores, -1 completes:");
        int grade = 0;

        while (grade != -1) {
            grade = scanner.nextInt();
            if (grade >= 0 && grade <= 60) {
                grades.add(grade);
            }
        }

        //  Calculate grade distribution after finishing adding grades
        gradeDistribution();

    }

    public void gradeDistribution() {

        for (Integer grade:grades) {
            if (grade >= 0 && grade <= 29) {
                gradeAmount[0]++;
            } else if (grade >= 30 && grade <= 34) {
                gradeAmount[1]++;
            } else if (grade >= 35 && grade <= 39) {
                gradeAmount[2]++;
            } else if (grade >= 40 && grade <= 44) {
                gradeAmount[3]++;
            } else if (grade >= 45 && grade <= 49) {
                gradeAmount[4]++;
            } else if (grade >= 50 && grade <= 60) {
                gradeAmount[5]++;
            }
        }

    }

    public void printStars(int amount) {
        for (int i=0; i<amount; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }

    public double acceptancePercentage() {
        if (grades.size() > 0) {
            acceptedAll = 100 * (gradeAmount[1] + gradeAmount[2] + gradeAmount[3] + gradeAmount[4]
                    + gradeAmount[5])/grades.size();
        }
        return acceptedAll;
    }

    public void printGrades() {
        System.out.println("Grade Distribution: ");
        for (int i=5; i>-1; i--) {
            int starAmount = gradeAmount[i];
            System.out.print(i + ": ");
            printStars(starAmount);
        }
    }

}
