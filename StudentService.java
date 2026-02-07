import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    // Add Student
    public void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Branch: ");
        String branch = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        students.add(new Student(id, name, branch, marks));
        System.out.println("Student added successfully!");
    }

    // View Students
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student s : students) {
            s.displayInfo();
        }
    }

    // Search Student
    public void searchStudent() {
        System.out.print("Enter ID to search: ");
        int id = sc.nextInt();

        for (Student s : students) {
            if (s.getId() == id) {
                s.displayInfo();
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Delete Student
    public void deleteStudent() {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();

        for (Student s : students) {
            if (s.getId() == id) {
                students.remove(s);
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
