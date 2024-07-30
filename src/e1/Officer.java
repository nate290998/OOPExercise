package e1;

public class Officer { 

	protected String name; 

	protected Integer age; 

	protected String gender; 

	protected String address; 

	 

	public Officer() { 

		super(); 

	} 

	public Officer(String name, Integer age, String gender, String address) { 

		super(); 

		this.name = name; 

		this.age = age; 

		this.gender = gender; 

		this.address = address; 

	} 

	public String getName() { 

		return name; 

	} 

	public void setName(String name) { 

		this.name = name; 

	} 

	public Integer getAge() { 

		return age; 

	} 

	public void setAge(Integer age) { 

		this.age = age; 

	} 

	public String getGender() { 

		return gender; 

	} 

	public void setGender(String gender) { 

		this.gender = gender; 

	} 

	public String getAddress() { 

		return address; 

	} 

	public void setAddress(String address) { 

		this.address = address; 

	} 

	@Override 

	public String toString() { 

		return "Officer [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + "]"; 

	} 

 

} 