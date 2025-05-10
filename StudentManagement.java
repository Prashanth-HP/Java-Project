import java.util.Scanner;

class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];
        int count = 0;

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search by ID");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (count < students.length) {
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine(); // consume newline
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Marks: ");
                        double marks = sc.nextDouble();
                        students[count++] = new Student(id, name, marks);
                        System.out.println("Student added successfully!");
                    } else {
                        System.out.println("Student limit reached.");
                    }
                    break;

                case 2:
                    System.out.println("Student List:");
                    for (int i = 0; i < count; i++) {
                        students[i].display();
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (students[i].id == searchId) {
                            students[i].display();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting program.");
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
