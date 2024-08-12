package demo.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestMethods {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 25, 3000.0, 9922001));
        employees.add(new Employee("Ace", 22, 2000.0, 5924001));
        employees.add(new Employee("Ace", 22, 3000.0, 5924001));
        employees.add(new Employee("Keith", 27, 4000.0, 3924401));
        // Comparator to compare employees by name
        Comparator<Employee> employeeNameComparator = Comparator.comparing(Employee::getName)
                .thenComparing(Employee::getSalary);

        // Sort the employees list
        Collections.sort(employees, employeeNameComparator);

        // Print the sorted list
        System.out.println("Sorted employees by name:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
