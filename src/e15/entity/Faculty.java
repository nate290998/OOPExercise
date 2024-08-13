package e15.entity;

import java.util.List;

public class Faculty {
    private String name;
    private List<Student> students;

    public Faculty(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

}
