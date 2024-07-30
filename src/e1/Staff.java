package e1;

public class Staff extends Officer { 

	private String job; 

 

	public Staff() { 

		super(); 

		// TODO Auto-generated constructor stub 

	} 

 

	public Staff(String name, Integer age, String gender, String address, String job) { 

		super(name, age, gender, address); 

		this.job = job; 

	} 

 

	public String getJob() { 

		return job; 

	} 

 

	public void setJob(String job) { 

		this.job = job; 

	} 

 

	@Override 

	public String toString() { 

		return "Staff [job=" + job + ", name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address 

				+ "]"; 

	} 

	 

} 
