package e8;

public class Student {
	private String name;
	private String age;
	private String studentClass;
	
	
	public Student() {
		super();
	}

	public Student(String name, String age, String studentClass) {
		super();
		this.name = name;
		this.age = age;
		this.studentClass = studentClass;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * @return the studentClass
	 */
	public String getStudentClass() {
		return studentClass;
	}

	/**
	 * @param studentClass the studentClass to set
	 */
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", studentClass=" + studentClass + "]";
	}


	
}
