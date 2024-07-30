package e6;

public class Student { 

	private String name; 

	private int age; 

	private String hometown; 

	private String classes; 

	 

	 

	public Student() { 

		super(); 

	} 

 

 

	public Student(String name, int age, String hometown, String classes) { 

		super(); 

		this.name = name; 

		this.age = age; 

		this.hometown = hometown; 

		this.classes = classes; 

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

 

 

	public String getHometown() { 

		return hometown; 

	} 

 

 

	public void setHometown(String hometown) { 

		this.hometown = hometown; 

	} 

 

 

	public String getClasss() { 

		return classes; 

	} 

 

 

	public void setClasss(String classes) { 

		this.classes = classes; 

	} 

 

 

	@Override 

	public String toString() { 

		return "Student [name=" + name + ", age=" + age + ", hometown=" + hometown + ", classes=" + classes + "]"; 

	} 

	 

	 

} 
