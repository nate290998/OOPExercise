package e15.entity;

import java.util.List;
import java.util.Scanner;

public class Student {
    protected String studentId;
    protected String fullName;
    protected String dob;
    protected int startYear;
    protected double entryScore;
    protected List<StudyResult> results;

    public Student() {
    }

    public Student(String studentId, String fullName, String dob, int startYear, double entryScore,
            List<StudyResult> results) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.dob = dob;
        this.startYear = startYear;
        this.entryScore = entryScore;
        this.results = results;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public double getEntryScore() {
        return entryScore;
    }

    public void setEntryScore(double entryScore) {
        this.entryScore = entryScore;
    }

    public List<StudyResult> getResults() {
        return results;
    }

    public void setResults(List<StudyResult> results) {
        this.results = results;
    }

    public double getAverageScoreByTerm(String termName) {
        return results.stream()
                .filter(result -> result.getTermName().equals(termName))
                .mapToDouble(StudyResult::getAverageScore)
                .average()
                .orElse(0);
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        this.studentId = scanner.nextLine();

        System.out.print("Enter Full Name: ");
        this.fullName = scanner.nextLine();

        System.out.print("Enter Date of Birth (dd/MM/yyyy): ");
        this.dob = scanner.nextLine(); // Validate date format

        System.out.print("Enter Entry Year: ");
        this.startYear = Integer.parseInt(scanner.nextLine()); // Validate integer

        System.out.print("Enter Entry Score: ");
        this.entryScore = Double.parseDouble(scanner.nextLine()); // Validate double

        if (this instanceof PartTimeStudent) {
            System.out.print("Enter Training Location: ");
            ((PartTimeStudent) this).setTrainingLocation(scanner.nextLine());
        }

        // Code to input the list of academic results
        // e.g., enter the number of semesters, then input each semester's GPA
    }

    public void output() {
        System.out.println("Student ID: " + this.studentId);
        System.out.println("Full Name: " + this.fullName);
        System.out.println("Date of Birth: " + this.dob);
        System.out.println("Entry Year: " + this.startYear);
        System.out.println("Entry Score: " + this.entryScore);

        if (this instanceof PartTimeStudent) {
            System.out.println("Training Location: " + ((PartTimeStudent) this).getTrainingLocation());
        }

        System.out.println("Academic Results:");
        for (StudyResult result : this.results) {
            System.out.println("Semester: " + result.getTermName() + ", GPA: " + result.getAverageScore());
        }
    }

    public boolean isRegular() {
        return false;
    }

}
