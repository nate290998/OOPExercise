package e6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Classes { 

	private List<Student> listStudent; 

	 

	public Classes() { 

this.listStudent = new ArrayList<>(); 

} 

 

public void add(Student student) { 

this.listStudent.add(student); 

} 

 

public List<Student> getStudent20YearOld() { 

return this.listStudent.stream() 

		.filter(s -> s.getAge() == 20) 

		.collect(Collectors.toList()); 

} 

 

public int countStudent23YearOldInDN() { 

return (int) this.listStudent.stream() 

		.filter(student -> student.getAge() == 23 && student.getHometown().equals("DN")) 

		.count(); 

} 

 

	@Override 

	public String toString() { 

		return "Classes [listStudent=" + listStudent + "]"; 

	} 

} 
