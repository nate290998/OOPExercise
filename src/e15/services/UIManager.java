package e15.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import e15.entity.Faculty;
import e15.entity.PartTimeStudent;
import e15.entity.RegularStudent;
import e15.entity.Student;
import e15.entity.StudyResult;

public class UIManager {

    List<Student> listStudents = new ArrayList<>();
    List<StudyResult> listResults = new ArrayList<>();

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Faculty Name: ");
        String facultyName = scanner.nextLine();
        boolean addMoreStudents = true;
        while (addMoreStudents) {
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
            Student student = new Student();

            if (student instanceof PartTimeStudent) {
                System.out.print("Enter Training Location: ");
                String trainingLocation = scanner.nextLine();
                listStudents.add(new PartTimeStudent(studentId, fullName, dob, startYear, entryScore, listResults,
                        trainingLocation));
            } else {
                listStudents.add(new RegularStudent(studentId, fullName, dob, startYear, entryScore, listResults));
            }
            System.out.print("Do you want to add more students? (yes/no): ");
            String addMoreStd = scanner.nextLine();
            addMoreStudents = addMoreStd.equalsIgnoreCase("yes");
        }
        new Faculty(facultyName, listStudents);
    }

    public void update() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student ID to update: ");
        String studentId = scanner.nextLine();

        // Find the student by ID
        Student studentToUpdate = listStudents.stream()
                .filter(student -> student.getStudentId().equals(studentId))
                .findFirst()
                .orElse(null);

        if (studentToUpdate != null) {
            System.out.println("Updating student information for: " + studentToUpdate.getFullName());
            System.out.print("Enter new Full Name (or press Enter to keep current): ");
            String newName = scanner.nextLine();
            if (!newName.isEmpty()) {
                studentToUpdate.setFullName(newName);
            }

            System.out.print("Enter new Date of Birth (or press Enter to keep current): ");
            String newDob = scanner.nextLine();
            if (!newDob.isEmpty()) {
                studentToUpdate.setDob(newDob);
            }

            System.out.print("Enter new Entry Year (or press Enter to keep current): ");
            String newStartYear = scanner.nextLine();
            if (!newStartYear.isEmpty()) {
                studentToUpdate.setStartYear(Integer.parseInt(newStartYear));
            }

            System.out.print("Enter new Entry Score (or press Enter to keep current): ");
            String newEntryScore = scanner.nextLine();
            if (!newEntryScore.isEmpty()) {
                studentToUpdate.setEntryScore(Double.parseDouble(newEntryScore));
            }

            if (studentToUpdate instanceof PartTimeStudent) {
                System.out.print("Enter new Training Location (or press Enter to keep current): ");
                String newLocation = scanner.nextLine();
                if (!newLocation.isEmpty()) {
                    ((PartTimeStudent) studentToUpdate).setTrainingLocation(newLocation);
                }
            }

            System.out.println("Student information updated successfully.");
        } else {
            System.out.println("Student with ID " + studentId + " not found.");
        }
    }

    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student ID to delete: ");
        String studentId = scanner.nextLine();

        // Find the student by ID and remove them
        boolean removed = listStudents.removeIf(student -> student.getStudentId().equals(studentId));

        if (removed) {
            System.out.println("Student with ID " + studentId + " has been removed.");
        } else {
            System.out.println("Student with ID " + studentId + " not found.");
        }
    }
}
