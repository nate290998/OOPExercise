package e15.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import e15.entity.PartTimeStudent;
import e15.entity.Student;
import e15.entity.StudyResult;

public class UIManager {

    List<Student> listStudents = new ArrayList<>();
    List<StudyResult> listResults = new ArrayList<>();

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();

        System.out.print("Enter Full Name: ");
        String fullName = scanner.nextLine();
        if (fullName.length() < 10 || fullName.length() > 50) {
            throw new IllegalArgumentException("Full Name must be between 10 and 50 characters.");
        }

        System.out.print("Enter Date of Birth (dd/MM/yyyy): ");
        String dob = scanner.nextLine();
        // Add date format validation logic here if needed

        System.out.print("Enter Entry Year: ");
        int startYear = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Entry Score: ");
        Double entryScore = scanner.nextDouble();
        scanner.nextLine();
        boolean addMoreResults = true;
        while (addMoreResults) {
            System.out.print("Enter Semester Name: ");
            String semesterName = scanner.nextLine();

            System.out.print("Enter GPA for this semester: ");
            double gpa = scanner.nextDouble();
            scanner.nextLine();
            listResults.add(new StudyResult(semesterName, gpa));
            System.out.print("Do you want to add more results? (yes/no): ");
            String addMore = scanner.nextLine();
            addMoreResults = addMore.equalsIgnoreCase("yes");
        }
        Student student = new Student(studentId, fullName, dob, startYear, entryScore, listResults);

        if (student instanceof PartTimeStudent) {
            System.out.print("Enter Training Location: ");
            ((PartTimeStudent) student).setTrainingLocation(scanner.nextLine());
        }

    }
}
