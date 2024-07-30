package e1;

public class Worker extends Officer{ 

	private Integer level; 

 

	public Worker() { 

		super(); 

		// TODO Auto-generated constructor stub 

	} 

 

	public Worker(String name, Integer age, String gender,  

			String address, Integer level) { 

		super(name, age, gender, address); 

		this.level = level; 

	} 

 

	public Integer getLevel() { 

		return level; 

	} 

 

	public void setLevel(Integer level) { 

		this.level = level; 

	} 

 

	@Override 

	public String toString() { 

		return "Worker [level=" + level + ", name=" + name + ", " 

				+ "age=" + age + ", gender=" + gender + ", address=" 

				+ address + "]"; 

	} 

	 

	 

} 
