import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Student {
    private int registrationNumber;
    private String fullName;
    private short semester;
    private float cgpa;

    public Student(int registrationNumber, String fullName, short semester, float cgpa) {
        this.registrationNumber = registrationNumber;
        this.fullName = fullName;
        this.semester = semester;
        this.cgpa = cgpa;
    }    
	
    public void display() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Full Name: " + fullName);
        System.out.println("Semester: " + semester);
        System.out.println("CGPA: " + cgpa);
        System.out.println("------------------------");
    }
    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public short getSemester() {
        return semester;
    }

    public float getCgpa() {
        return cgpa;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Registration Number: ");
            int regNumber = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Full Name: ");
            String name = scanner.nextLine();
            System.out.print("Semester: ");
            short semester = scanner.nextShort();
            System.out.print("CGPA: ");
            float cgpa = scanner.nextFloat();

            students[i] = new Student(regNumber, name, semester, cgpa);
        }
        System.out.println("\nStudent Records:");
        for (Student student : students) {
            student.display();
        }
        sortByCGPA(students);
        System.out.println("\nStudent Records (Sorted by CGPA):");
        for (Student student : students) {
            student.display();
        }
        sortByName(students);
        System.out.println("\nStudent Records (Sorted by Name):");
        for (Student student : students) {
            student.display();
        }
    }
    private static void sortByCGPA(Student[] students) {
        Arrays.sort(students, Comparator.comparingDouble(Student::getCgpa).reversed());
    }
    private static void sortByName(Student[] students) {
        Arrays.sort(students, Comparator.comparing(Student::getFullName));
    }
}
