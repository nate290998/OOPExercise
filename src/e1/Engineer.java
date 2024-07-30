package e1;

public class Engineer extends Officer{ 

	private String major; 

 

	public Engineer() { 

		super(); 

		// TODO Auto-generated constructor stub 

	} 

 

	public Engineer(String name, Integer age, String gender, String address, String major) { 

		super(name, age, gender, address); 

		this.major = major; 

	} 

 

	public String getMajor() { 

		return major; 

	} 

 

	public void setMajor(String major) { 

		this.major = major; 

	} 

 

	@Override 

	public String toString() { 

		return "Engineer [major=" + major + ", name=" + name + ", age=" + age + ", gender=" + gender + ", address=" 

				+ address + "]"; 

	} 

 

 

	 

} 
