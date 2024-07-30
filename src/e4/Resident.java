package e4;

public class Resident { 

	private String name; 

	private int age; 

	private String job; 

	private String idNumber; 

	 

	public Resident(String name, int age, String job, String idNumber) { 

this.name = name; 

this.age = age; 

this.job = job; 

this.idNumber = idNumber; 

} 

 

 

public String getName() { 

return name; 

} 

 

public void setName(String name) { 

this.name = name; 

} 

 

public int getAge() { 

return age; 

} 

 

public void setAge(int age) { 

this.age = age; 

} 

 

public String getJob() { 

return job; 

} 

 

public void setJob(String job) { 

this.job = job; 

} 

 

public String getPassport() { 

return idNumber; 

} 

 

public void setPassport(String passport) { 

this.idNumber = passport; 

} 

 

public void showInfoRsd() { 

System.out.println("Name: " + name); 

System.out.println("Age: " + age); 

System.out.println("Job: " + job); 

System.out.println("Identification Number: " + idNumber); 

} 

@Override 

public String toString() { 

return "Person{" + 

"name='" + name + '\'' + 

", age=" + age + 

", job='" + job + '\'' + 

", idNumber='" + idNumber + '\'' + 

'}'; 

} 

} 
