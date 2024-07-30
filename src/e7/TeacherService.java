package e7;

import java.util.ArrayList;
import java.util.List;

public class TeacherService { 

	private List<Teacher> teachers; 

 

public TeacherService() { 

this.teachers = new ArrayList<>(); 

} 

 

public void add(Teacher teacher) { 

this.teachers.add(teacher); 

} 

 

public boolean deleteById(String id) { 

Teacher teacher = this.teachers.stream() 

		.filter(t -> t.getId().equals(id)).findFirst().orElse(null); 

if (teacher == null) { 

return false; 

} 

this.teachers.remove(teacher); 

return true; 

} 

 

public void showInfo() { 

	this.teachers.forEach(t -> System.out.println(t.toString())); 

} 

public double getSalary(String id) { 

Teacher teacher = this.teachers.stream() 

		.filter(t -> t.getId().equals(id)).findFirst().orElse(null); 

if (teacher == null) { 

return 0; 

} 

return teacher.getSalary() + teacher.getBonus() - teacher.getPenalty(); 

} 

} 
