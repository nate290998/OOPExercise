package e15.ui;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import e15.entity.Student;
import e15.services.StudentServices;
import e15.services.UIManager;

public class Main {

    public static void main(String[] args) {
        UIManager uiManager = new UIManager();
        StudentServices studentServices = new StudentServices();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Application");
            System.out.println("Enter 1: To insert student information");
            System.out.println("Enter 2: To update student information by ID");
            System.out.println("Enter 3: To remove student's information by ID");
            System.out.println("Enter 4: To show all students' information");
            System.out.println("Enter 5: To show students by type and year");
            System.out.println("Enter 6: To get total regular students in the faculty");
            System.out.println("Enter 7: To find student with highest entry score");
            System.out.println("Enter 8: To get part-time students by location");
            System.out.println("Enter 9: To get top students by recent term (min average 8.0)");
            System.out.println("Enter 10: To find student with highest average in any term");
            System.out.println("Enter 11: To sort students by type and year");
            System.out.println("Enter 12: To count students by year");
            System.out.println("Enter 13: To exit");

            String ch = scanner.nextLine();

            switch (ch) {
                case "1":
                    System.out.println("Inserting student information...");
                    uiManager.input();
                    break;

                case "2":
                    System.out.println("Updating student information by ID...");
                    uiManager.update();
                    break;

                case "3":
                    System.out.println("Removing student's information by ID...");
                    uiManager.delete();
                    break;

                case "4":
                    System.out.println("Showing all students' information...");
                    studentServices.output();
                    break;

                case "5":
                    System.out.println("Sorting and displaying students by type and year...");
                    studentServices.sortStudentsByTypeAndYear();
                    studentServices.output();
                    break;

                case "6":
                    System.out.println(
                            "Total regular students in the faculty: " + studentServices.getTotalRegularStudents());
                    break;

                case "7":
                    Student highestEntryScoreStudent = studentServices.getStudentWithHighestEntryScore();
                    if (highestEntryScoreStudent != null) {
                        System.out.println("Student with the highest entry score:");
                        highestEntryScoreStudent.output();
                    } else {
                        System.out.println("No students found.");
                    }
                    break;

                case "8":
                    System.out.print("Enter the training location: ");
                    String location = scanner.nextLine();
                    List<Student> partTimeStudents = studentServices.getPartTimeStudentsByLocation(location);
                    if (!partTimeStudents.isEmpty()) {
                        System.out.println("Part-time students at " + location + ":");
                        partTimeStudents.forEach(Student::output);
                    } else {
                        System.out.println("No part-time students found at this location.");
                    }
                    break;

                case "9":
                    System.out.println("Students with an average score of 8.0 or higher in the most recent term:");
                    List<Student> topStudents = studentServices.getTopStudentsByRecentTerm(8.0);
                    topStudents.forEach(Student::output);
                    break;

                case "10":
                    Student highestAverageStudent = studentServices.getStudentWithHighestAverageInAnyTerm();
                    if (highestAverageStudent != null) {
                        System.out.println("Student with the highest average in any term:");
                        highestAverageStudent.output();
                    } else {
                        System.out.println("No students found.");
                    }
                    break;

                case "11":
                    System.out.println("Sorting students by type and year...");
                    studentServices.sortStudentsByTypeAndYear();
                    studentServices.output();
                    break;

                case "12":
                    System.out.println("Counting students by year:");
                    Map<Integer, Integer> studentCountByYear = studentServices.countStudentsByYear();
                    studentCountByYear
                            .forEach((year, count) -> System.out.println("Year " + year + ": " + count + " students"));
                    break;

                case "13":
                    System.out.println("Exit the application");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Not Available");
                    break;
            }
        }
    }
}