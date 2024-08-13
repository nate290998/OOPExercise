package e15.services;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import e15.entity.Student;
import e15.entity.PartTimeStudent;
import e15.entity.StudyResult;

public class StudentServices {

    List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    // Get total regular students
    public int getTotalRegularStudents() {
        return (int) students.stream().filter(Student::isRegular).count();
    }

    // Get student with highest entry score
    public Student getStudentWithHighestEntryScore() {
        return students.stream().max(Comparator.comparingDouble(Student::getEntryScore)).orElse(null);
    }

    // Get part-time students by location
    public List<Student> getPartTimeStudentsByLocation(String location) {
        return students.stream()
                .filter(student -> student instanceof PartTimeStudent)
                .filter(student -> ((PartTimeStudent) student).getTrainingLocation().equalsIgnoreCase(location))
                .collect(Collectors.toList());
    }

    // Get top students by recent term
    public List<Student> getTopStudentsByRecentTerm(double minAverage) {
        return students.stream()
                .filter(student -> {
                    StudyResult lastResult = student.getResults().get(student.getResults().size() - 1);
                    return lastResult.getAverageScore() >= minAverage;
                })
                .collect(Collectors.toList());
    }

    // Get student with highest average in any term
    public Student getStudentWithHighestAverageInAnyTerm() {
        return students.stream()
                .max(Comparator.comparingDouble(student -> student.getResults().stream()
                        .mapToDouble(StudyResult::getAverageScore)
                        .max()
                        .orElse(0)))
                .orElse(null);
    }

    // Sort students by type and year
    public void sortStudentsByTypeAndYear() {
        students.sort(Comparator.comparing(Student::isRegular).thenComparing(Student::getStartYear).reversed());
    }

    // Count students by year
    public Map<Integer, Integer> countStudentsByYear() {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getStartYear, Collectors.summingInt(s -> 1)));
    }

    // Output for testing purposes
    public void output() {
        students.forEach(Student::output);
    }
}
