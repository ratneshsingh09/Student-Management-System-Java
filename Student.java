public class Student {
    private int id;
    private String name;
    private String branch;
    private double marks;

    // Constructor
    public Student(int id, String name, String branch, double marks) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.marks = marks;
    }

    // Getters and Setters (Encapsulation)
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public void displayInfo() {
        System.out.println(
                 "ID: " + id +
                ", Name: " + name +
                ", Branch: " + branch +
                ", Marks: " + marks);
    }
}
