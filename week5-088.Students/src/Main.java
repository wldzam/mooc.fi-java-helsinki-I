
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program

        // defining a new array list for students
        ArrayList<Student> list = new ArrayList<Student>();

        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.print("name: ");
            String name = reader.nextLine();

            if (name.equals("")) {   // Exit loop if string name is empty
                break;
            }

            System.out.print("studentnumber: ");
            String studentNumber = reader.nextLine();

            list.add(new Student(name, studentNumber));
        }

        for (Student student: list) {
            System.out.println(student);
        }

        System.out.print("Give search term: ");
        String searchTerm = reader.nextLine();

        for (Student student : list) {
            String studentName = student.getName();
            if (studentName.contains(searchTerm)) {
                System.out.println("Result:");
                System.out.println(student);
            }
        }

    }
}
