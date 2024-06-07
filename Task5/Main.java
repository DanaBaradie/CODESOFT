import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CourseRegistration system = new CourseRegistration();

        system.addCourse(new Course("CSC202", "OOP", "Java 2", 3, 2, "MW 8-9:30"));
        system.addCourse(new Course("MTH102", "Calculus I", "Introduction to Calculus", 2, 2, "TTh 10-11:30AM"));

        system.addStudent(new Student("A230081", "Dana"));
        system.addStudent(new Student("A230077", "Sara"));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nCourse Registration System");
            System.out.println("1. List Courses");
            System.out.println("2. Register for a course");
            System.out.println("3. Drop a course");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: 
                    system.listCourses();
                    break;
                case 2:
                    System.out.print("Enter student ID: ");
                    String studentId = scanner.next();
                    System.out.print("Enter course code: ");
                    String courseCode = scanner.next();
                    system.registerStudentForCourse(studentId, courseCode);
                    break;
                case 3:
                    System.out.print("Enter student ID: ");
                    studentId = scanner.next();
                    System.out.print("Enter course code: ");
                    courseCode = scanner.next();
                    system.dropCourseForStudent(studentId, courseCode);
                    break;
                case 4:
                    scanner.close();
                    System.out.println("Thank you!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }    
}