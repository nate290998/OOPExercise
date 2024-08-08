package example_13.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import example_13.entity.Employee;
import example_13.entity.Experience;
import example_13.entity.Fresher;
import example_13.entity.Intern;

public class EmployeeManager {
    // Set: uses for coupled values and doesn't accept duplicated value
    // Map: Key - value
    private List<Employee> employees;

    public EmployeeManager() {
        this.employees = new ArrayList<>();
    }

    public void insert(Employee employee) {
        this.employees.add(employee);
    }

    public Employee findEmployeeByID(String id) {
        return this.employees.stream().filter(e -> e.getId().equals(id)).findFirst().orElse(null);
    }

    public boolean deleteByID(String id) {
        Employee employee = this.findEmployeeByID(id);
        if (employee == null) {
            return false;
        }
        this.employees.remove(employee);
        return true;
    }

    public List<Employee> findByType(int type) {
        return this.employees.stream().filter(e -> {
            if (type == 0) {
                return e instanceof Experience;
            } else if (type == 1) {
                return e instanceof Fresher;
            } else if (type == 2) {
                return e instanceof Intern;
            } else {
                return false;
            }
        }).collect(Collectors.toList());
    }

    public List<Employee> findAll() {
        return this.employees;
    }
}
