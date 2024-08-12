package e14.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import e14.entity.GoodStudent;
import e14.entity.NormalStudent;
import e14.entity.Student;
import e14.exception.InvalidDOBException;
import e14.exception.InvalidFullNameException;
import e14.exception.InvalidPhoneNumberException;

public class UIManager {
    private List<Student> students = new ArrayList<>();

    public void insert(int type) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Full Name:");
            String fullName = scanner.nextLine();

            System.out.print("Enter Date of Birth (dd/MM/yyyy):");
            String doB = scanner.nextLine();

            System.out.print("Enter Sex:");
            String sex = scanner.nextLine();

            System.out.print("Enter Phone Number:");
            String phoneNumber = scanner.nextLine();

            System.out.print("Enter University Name:");
            String universityName = scanner.nextLine();

            System.out.print("Enter Grade Level:");
            String gradeLevel = scanner.nextLine();

            if (type == 0) {
                System.out.print("Enter GPA:");
                double gpa = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Enter Best Reward Name:");
                String bestRewardName = scanner.nextLine();

                students.add(new GoodStudent(fullName, doB, sex, phoneNumber, universityName, gradeLevel, gpa,
                        bestRewardName));
            } else if (type == 1) {
                System.out.print("Enter English Score:");
                int englishScore = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Entry Test Score:");
                double entryTestScore = scanner.nextDouble();
                scanner.nextLine();
                students.add(new NormalStudent(fullName, doB, sex, phoneNumber, universityName, gradeLevel,
                        englishScore, entryTestScore));
            }
        } catch (Exception e) {
            System.out.println("Input files have unknown errors !!!");
        }
    }

    public void update() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Full Name of the student to update:");
        String fullName = scanner.nextLine();

        boolean studentFound = false;

        for (Student student : students) {
            if (student.getFullName().equalsIgnoreCase(fullName)) {
                studentFound = true;

                System.out.println("Student found. What would you like to update?");
                System.out.println("1. Full Name");
                System.out.println("2. Date of Birth");
                System.out.println("3. Sex");
                System.out.println("4. Phone Number");
                System.out.println("5. University Name");
                System.out.println("6. Grade Level");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Enter new Full Name:");
                        String newFullName = scanner.nextLine();
                        try {
                            student.setFullName(newFullName);
                            System.out.println("Full Name updated successfully.");
                        } catch (InvalidFullNameException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    case 2:
                        System.out.println("Enter new Date of Birth (e.g., YYYY-MM-DD):");
                        String newDoB = scanner.nextLine();
                        try {
                            student.setDoB(newDoB);
                            System.out.println("Date of Birth updated successfully. ");
                        } catch (InvalidDOBException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    case 3:
                        System.out.println("Enter new Sex:");
                        String newSex = scanner.nextLine();
                        student.setSex(newSex);
                        break;
                    case 4:
                        System.out.println("Enter new Phone Number:");
                        String newPhoneNumber = scanner.nextLine();
                        try {
                            student.setPhoneNumber(newPhoneNumber);
                            System.out.println("Phone Number updated successfully. ");
                        } catch (InvalidPhoneNumberException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    case 5:
                        System.out.println("Enter new University Name:");
                        String newUniversityName = scanner.nextLine();
                        student.setUniversityName(newUniversityName);
                        break;
                    case 6:
                        System.out.println("Enter new Grade Level:");
                        String newGradeLevel = scanner.nextLine();
                        student.setGradeLevel(newGradeLevel);
                        break;
                    default:
                        System.out.println("Invalid choice. No updates made.");
                        break;
                }
                System.out.println("Student information updated successfully.");
                break;
            }
        }

        if (!studentFound) {
            System.out.println("No student found with the provided Full Name.");
        }
    }

    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Full Name to delete:");
        String fullName = scanner.nextLine();
        students.removeIf(student -> student.getFullName().equals(fullName));
    }

    // Show all student information
    public void showAllEmployeeInfo() {
        Collections.sort(students,
                Comparator.comparing(Student::getFullName).reversed().thenComparing(Student::getPhoneNumber));
        for (Student student : students) {
            student.showMyInfo();
        }
    }

    public void showAllEmployeeByType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter type (0 for GoodStudent, 1 for NormalStudent):");
        int type = scanner.nextInt();
        scanner.nextLine();

        for (Student student : students) {
            if (type == 0 && student instanceof GoodStudent) {
                student.showMyInfo();
            } else if (type == 1 && student instanceof NormalStudent) {
                student.showMyInfo();
            }
        }
    }

    public void recruit(int numberOfStudents) {
        List<GoodStudent> goodStudents = new ArrayList<>();
        List<NormalStudent> normalStudents = new ArrayList<>();

        for (Student student : students) {
            if (student instanceof GoodStudent) {
                goodStudents.add((GoodStudent) student);
            } else if (student instanceof NormalStudent) {
                normalStudents.add((NormalStudent) student);
            }
        }

        goodStudents.sort(Comparator.comparing(GoodStudent::getGpa).reversed().thenComparing(GoodStudent::getFullName));

        List<Student> selectedStudents = new ArrayList<>();

        if (goodStudents.size() > numberOfStudents) {
            selectedStudents.addAll(goodStudents.subList(0, numberOfStudents));
        } else {
            selectedStudents.addAll(goodStudents);
            numberOfStudents -= goodStudents.size();
            normalStudents.sort(Comparator.comparing(NormalStudent::getEntryTestScore).reversed()
                    .thenComparing(NormalStudent::getEnglishScore).thenComparing(NormalStudent::getFullName));

            selectedStudents.addAll(normalStudents.subList(0, Math.min(numberOfStudents, normalStudents.size())));
        }

        System.out.println("Selected Students:");
        for (Student student : selectedStudents) {
            student.showMyInfo();
        }
    }
}
